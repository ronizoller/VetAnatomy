package com.example.ronizoller.vetanatomy;

import android.os.Bundle;

/**
 * Created by ronizoller on 02/11/2019.
 */

public class cat1 extends category {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.q = questions.getRandomQuestions(1,questions.get_number_of_question_cat(1));
        super.onCreate(savedInstanceState);
    }
}
