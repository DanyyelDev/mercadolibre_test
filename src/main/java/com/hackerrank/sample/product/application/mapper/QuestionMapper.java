package com.hackerrank.sample.product.application.mapper;

import com.hackerrank.sample.product.domain.model.Question;
import com.hackerrank.sample.product.domain.model.QuestionsAndAnswers;
import com.hackerrank.sample.product.application.dto.QuestionDto;
import com.hackerrank.sample.product.application.dto.QuestionsAndAnswersDto;
import com.hackerrank.sample.product.infrastructure.entity.QuestionAnswerEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.stream.Collectors;
@Mapper(componentModel = "spring")
public
interface QuestionMapper {

    @Mapping(target = "question", source = "question")
    @Mapping(target = "answer", source = "answer")
    Question toDomain(QuestionAnswerEntity entity);

    @Mapping(target = "question", source = "question")
    @Mapping(target = "answer", source = "answer")
    @Mapping(target = "product", ignore = true)
    QuestionAnswerEntity toEntity(Question domain);
}