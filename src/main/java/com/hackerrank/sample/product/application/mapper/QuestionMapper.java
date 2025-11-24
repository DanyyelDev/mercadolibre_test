package com.hackerrank.sample.product.application.mapper;

import com.hackerrank.sample.product.domain.model.Question;
import com.hackerrank.sample.product.domain.model.QuestionsAndAnswers;
import com.hackerrank.sample.product.application.dto.QuestionDto;
import com.hackerrank.sample.product.application.dto.QuestionsAndAnswersDto;

import java.util.stream.Collectors;

public class QuestionMapper {

    public static QuestionsAndAnswersDto toDto(QuestionsAndAnswers domain) {
        QuestionsAndAnswersDto dto = new QuestionsAndAnswersDto();

        dto.setQuestions(
                domain.getQuestions().stream()
                        .map(QuestionMapper::toQuestionDto)
                        .collect(Collectors.toList())
        );

        return dto;
    }

    private static QuestionDto toQuestionDto(Question q) {
        QuestionDto dto = new QuestionDto();
        dto.setQuestion(q.getQuestion());
        dto.setAnswer(q.getAnswer());
        dto.setDate(q.getDate());
        return dto;
    }
}