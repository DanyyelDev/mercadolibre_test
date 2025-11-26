package com.hackerrank.sample.product.domain.model;

public class Question {
    private String question;
    private String answer;
    private String date;

    public Question(String question, String answer, String date) {
        this.question = question;
        this.answer = answer;
        this.date = date;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
