package com.hackerrank.sample.product.domain.model;

import java.util.List;

public class QuestionsAndAnswers {
    private List<Question> questions;

    public QuestionsAndAnswers(List<Question> questions) {
        this.questions = questions;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }
}

