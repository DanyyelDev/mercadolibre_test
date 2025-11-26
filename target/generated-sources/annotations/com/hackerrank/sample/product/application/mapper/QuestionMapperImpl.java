package com.hackerrank.sample.product.application.mapper;

import com.hackerrank.sample.product.domain.model.Question;
import com.hackerrank.sample.product.infrastructure.entity.QuestionAnswerEntity;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-11-26T11:15:48-0500",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.3 (Oracle Corporation)"
)
@Component
public class QuestionMapperImpl implements QuestionMapper {

    @Override
    public Question toDomain(QuestionAnswerEntity entity) {
        if ( entity == null ) {
            return null;
        }

        String question = null;
        String answer = null;

        question = entity.getQuestion();
        answer = entity.getAnswer();

        String date = null;

        Question question1 = new Question( question, answer, date );

        return question1;
    }

    @Override
    public QuestionAnswerEntity toEntity(Question domain) {
        if ( domain == null ) {
            return null;
        }

        QuestionAnswerEntity questionAnswerEntity = new QuestionAnswerEntity();

        questionAnswerEntity.setQuestion( domain.getQuestion() );
        questionAnswerEntity.setAnswer( domain.getAnswer() );

        return questionAnswerEntity;
    }
}
