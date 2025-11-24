package com.hackerrank.sample.product.application.dto;

import java.util.List;

public class QuestionsAndAnswersDto {
    private List<QuestionDto> questions;

    // getters y setters

    public List<QuestionDto> getQuestions() {
        return questions;
    }

    public void setQuestions(List<QuestionDto> questions) {
        this.questions = questions;
    }
}
