package com.example.ronizoller.vetanatomy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class categories extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);

        Button cat0 = (Button) findViewById(R.id.cat0);
        Button cat1 = (Button) findViewById(R.id.cat1);
        Button random = (Button) findViewById(R.id.random);

        cat0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(categories.this, cat0.class);
                startActivity(i);}
        });
        cat1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(categories.this, cat1.class);
                startActivity(i);}
        });
        random.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(categories.this, random.class);
                startActivity(i);}
        });
    }

}
