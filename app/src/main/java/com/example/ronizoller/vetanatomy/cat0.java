package com.example.ronizoller.vetanatomy;

import android.os.Bundle;

/**
 * Created by ronizoller on 02/11/2019.
 */

public class cat0 extends category {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.q = questions.getRandomQuestions(0,questions.get_number_of_question_cat(0));
        super.onCreate(savedInstanceState);
    }
}
