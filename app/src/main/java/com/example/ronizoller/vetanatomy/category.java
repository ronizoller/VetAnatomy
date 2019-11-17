package com.example.ronizoller.vetanatomy;

import android.content.Intent;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class category extends categories {
    int changed_characters;
    int success_counter = 0;

    private Tuple<Boolean, String> almose_correct(String s1, String s2) {
        char[] chars = {'a','o','i','h','e'};
        for (char car1 : chars) {
            for (char car2 : chars) {
                changed_characters = 0;
                for (char j:chars) {
                    String new_s1 = replace_only_one_char(s1, car1, car2);
                    if (new_s1.equalsIgnoreCase(s2)) {
                        return new Tuple<>(true, car1 + " with " + car2);
                    }
                }
            }
        }
        return new Tuple<>(false,"");
    }

    private String replace_only_one_char(String s,char old_char, char new_char) {
        int counter = 0;
        int index = 0;
        for (char char1:s.toCharArray()) {
            if (char1 == old_char) {
                if (counter < changed_characters) {
                    counter ++;
                }
                else {
                    char[] res = s.toCharArray();
                    res[index] = new_char;
                    changed_characters ++;
                    return new String(res);
                }
            }
            index ++;
        }
        return s;
    }

    private void success_in_a_raw() {
        ImageView star1 = (ImageView) findViewById(R.id.star1);
        star1.setVisibility(View.VISIBLE);

        ImageView star2 = (ImageView) findViewById(R.id.star2);
        star2.setVisibility(View.VISIBLE);

        ImageView star3 = (ImageView) findViewById(R.id.star3);
        star3.setVisibility(View.VISIBLE);

        ImageView star4 = (ImageView) findViewById(R.id.star4);
        star4.setVisibility(View.VISIBLE);

        ImageView star5 = (ImageView) findViewById(R.id.star5);
        star5.setVisibility(View.VISIBLE);

        Animation rotate_anim = AnimationUtils.loadAnimation(this, R.anim.rotate_and_bounce);
        Animation move_anim = AnimationUtils.loadAnimation(this, R.anim.move);


        star1.startAnimation(rotate_anim);
        star1.startAnimation(move_anim);
        star2.startAnimation(move_anim);
        star2.startAnimation(rotate_anim);
        star3.startAnimation(rotate_anim);
        star3.startAnimation(move_anim);
        star4.startAnimation(move_anim);
        star4.startAnimation(rotate_anim);
        star5.startAnimation(move_anim);
        star5.startAnimation(rotate_anim);

        star1.setVisibility(View.INVISIBLE);
        star2.setVisibility(View.INVISIBLE);
        star3.setVisibility(View.INVISIBLE);
        star4.setVisibility(View.INVISIBLE);
        star5.setVisibility(View.INVISIBLE);
    }


    question q;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        TextView question_text = (TextView) findViewById(R.id.question_text);
        question_text.setText(q.question);
        Button check_butt = (Button) findViewById(R.id.check_butt);
        final Button next_butt = (Button) findViewById(R.id.next_butt);
        next_butt.setVisibility(View.INVISIBLE);
        final TextView error_text_box = (TextView) findViewById(R.id.error_text);
        final TextView correct_answer_text_box = (TextView) findViewById(R.id.correct_answer_text);
        final EditText ans_text = (EditText) findViewById(R.id.ans_text);


        if (q.picture >= 0) {
            ImageView picture = (ImageView) findViewById(R.id.picture_box);
            picture.setImageBitmap(BitmapFactory.decodeResource(getResources(), q.picture));
            picture.setAdjustViewBounds(true);
        }
        else {
            question_text.setY(-500);
            ans_text.setY(-400);
        }



        check_butt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                next_butt.setVisibility(View.VISIBLE);
                if (ans_text.getText().toString().equalsIgnoreCase(q.answer)) {
                    error_text_box.setText("You are the best!");
                    error_text_box.setTextColor(Color.parseColor("#009933"));
                    success_counter ++;
                    if (success_counter == 3) {
                        success_in_a_raw();
                        success_counter = 0;
                    }

                }
                else {
                    Tuple<Boolean,String> almost = almose_correct(ans_text.getText().toString(), q.answer);
                    if (almost.x) {
                        error_text_box.setText("Almost perfect!, you confused "+almost.y+".\nThe correct answer is:");
                        correct_answer_text_box.setText(q.answer);
                        error_text_box.setTextColor(Color.parseColor("#ff0000"));
                        correct_answer_text_box.setTextColor(Color.parseColor("#450f0f"));
                    }
                    else {
                        error_text_box.setText("Not so good but you are still the best.\nThe correct answer is:");
                        correct_answer_text_box.setText(q.answer);
                        error_text_box.setTextColor(Color.parseColor("#ff0000"));
                        correct_answer_text_box.setTextColor(Color.parseColor("#450f0f"));
                    }
                    success_counter = 0;
                }
            }
        });
        next_butt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mIntent = getIntent();
                finish();
                startActivity(mIntent);
            }
        });
    }
}

