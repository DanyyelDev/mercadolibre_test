package com.hackerrank.sample.product.infrastructure.mapper;

import com.hackerrank.sample.product.application.mapper.*;
import com.hackerrank.sample.product.domain.model.ColorOption;
import com.hackerrank.sample.product.domain.model.PaymentMethod;
import com.hackerrank.sample.product.domain.model.Product;
import com.hackerrank.sample.product.domain.model.Question;
import com.hackerrank.sample.product.infrastructure.entity.ColorOptionEntity;
import com.hackerrank.sample.product.infrastructure.entity.PaymentMethodEntity;
import com.hackerrank.sample.product.infrastructure.entity.ProductEntity;
import com.hackerrank.sample.product.infrastructure.entity.QuestionAnswerEntity;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-11-26T11:15:48-0500",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.3 (Oracle Corporation)"
)
@Component
public class ProductEntityMapperImpl implements ProductEntityMapper {

    @Autowired
    private RatingMapper ratingMapper;
    @Autowired
    private OfferMapper offerMapper;
    @Autowired
    private ColorOptionMapper colorOptionMapper;
    @Autowired
    private PaymentMethodMapper paymentMethodMapper;
    @Autowired
    private QuestionMapper questionMapper;
    @Autowired
    private PurchaseInfoMapper purchaseInfoMapper;

    @Override
    public Product toDomain(ProductEntity entity) {
        if ( entity == null ) {
            return null;
        }

        Product product = new Product();

        product.setRating( ratingMapper.toDomain( entity.getRatingEntity() ) );
        product.setOffer( offerMapper.toDomain( entity.getOfferEntity() ) );
        product.setColors( colorOptionEntityListToColorOptionList( entity.getColors() ) );
        product.setPaymentMethods( paymentMethodEntityListToPaymentMethodList( entity.getPaymentMethodEntities() ) );
        List<String> list2 = entity.getImages();
        if ( list2 != null ) {
            product.setProductImages( new ArrayList<String>( list2 ) );
        }
        List<String> list3 = entity.getOtherDetails();
        if ( list3 != null ) {
            product.setAdditionalDetails( new ArrayList<String>( list3 ) );
        }
        List<String> list4 = entity.getSpecificProductData();
        if ( list4 != null ) {
            product.setSpecificTypeDetails( new ArrayList<String>( list4 ) );
        }
        product.setQuestions( questionAnswerEntityListToQuestionList( entity.getQuestions() ) );
        product.setPurchaseInfo( purchaseInfoMapper.toDomain( entity.getPurchaseInfoEntity() ) );
        product.setId( entity.getId() );
        product.setName( entity.getName() );
        product.setDescription( entity.getDescription() );
        if ( entity.getPrice() != null ) {
            product.setPrice( entity.getPrice() );
        }
        List<String> list6 = entity.getProductHighlights();
        if ( list6 != null ) {
            product.setProductHighlights( new ArrayList<String>( list6 ) );
        }
        List<String> list7 = entity.getGeneralFeatures();
        if ( list7 != null ) {
            product.setGeneralFeatures( new ArrayList<String>( list7 ) );
        }
        List<String> list8 = entity.getSpecifications();
        if ( list8 != null ) {
            product.setSpecifications( new ArrayList<String>( list8 ) );
        }

        return product;
    }

    @Override
    public ProductEntity toEntity(Product domain) {
        if ( domain == null ) {
            return null;
        }

        ProductEntity productEntity = new ProductEntity();

        productEntity.setRatingEntity( ratingMapper.toEntity( domain.getRating() ) );
        productEntity.setOfferEntity( offerMapper.toEntity( domain.getOffer() ) );
        productEntity.setColors( colorOptionListToColorOptionEntityList( domain.getColors() ) );
        productEntity.setPaymentMethodEntities( paymentMethodListToPaymentMethodEntityList( domain.getPaymentMethods() ) );
        List<String> list2 = domain.getProductImages();
        if ( list2 != null ) {
            productEntity.setImages( new ArrayList<String>( list2 ) );
        }
        List<String> list3 = domain.getAdditionalDetails();
        if ( list3 != null ) {
            productEntity.setOtherDetails( new ArrayList<String>( list3 ) );
        }
        List<String> list4 = domain.getSpecificTypeDetails();
        if ( list4 != null ) {
            productEntity.setSpecificProductData( new ArrayList<String>( list4 ) );
        }
        productEntity.setQuestions( questionListToQuestionAnswerEntityList( domain.getQuestions() ) );
        productEntity.setPurchaseInfoEntity( purchaseInfoMapper.toEntity( domain.getPurchaseInfo() ) );
        productEntity.setId( domain.getId() );
        productEntity.setName( domain.getName() );
        productEntity.setDescription( domain.getDescription() );
        productEntity.setPrice( domain.getPrice() );
        List<String> list6 = domain.getProductHighlights();
        if ( list6 != null ) {
            productEntity.setProductHighlights( new ArrayList<String>( list6 ) );
        }
        List<String> list7 = domain.getGeneralFeatures();
        if ( list7 != null ) {
            productEntity.setGeneralFeatures( new ArrayList<String>( list7 ) );
        }
        List<String> list8 = domain.getSpecifications();
        if ( list8 != null ) {
            productEntity.setSpecifications( new ArrayList<String>( list8 ) );
        }

        return productEntity;
    }

    protected List<ColorOption> colorOptionEntityListToColorOptionList(List<ColorOptionEntity> list) {
        if ( list == null ) {
            return null;
        }

        List<ColorOption> list1 = new ArrayList<ColorOption>( list.size() );
        for ( ColorOptionEntity colorOptionEntity : list ) {
            list1.add( colorOptionMapper.toDomain( colorOptionEntity ) );
        }

        return list1;
    }

    protected List<PaymentMethod> paymentMethodEntityListToPaymentMethodList(List<PaymentMethodEntity> list) {
        if ( list == null ) {
            return null;
        }

        List<PaymentMethod> list1 = new ArrayList<PaymentMethod>( list.size() );
        for ( PaymentMethodEntity paymentMethodEntity : list ) {
            list1.add( paymentMethodMapper.toDomain( paymentMethodEntity ) );
        }

        return list1;
    }

    protected List<Question> questionAnswerEntityListToQuestionList(List<QuestionAnswerEntity> list) {
        if ( list == null ) {
            return null;
        }

        List<Question> list1 = new ArrayList<Question>( list.size() );
        for ( QuestionAnswerEntity questionAnswerEntity : list ) {
            list1.add( questionMapper.toDomain( questionAnswerEntity ) );
        }

        return list1;
    }

    protected List<ColorOptionEntity> colorOptionListToColorOptionEntityList(List<ColorOption> list) {
        if ( list == null ) {
            return null;
        }

        List<ColorOptionEntity> list1 = new ArrayList<ColorOptionEntity>( list.size() );
        for ( ColorOption colorOption : list ) {
            list1.add( colorOptionMapper.toEntity( colorOption ) );
        }

        return list1;
    }

    protected List<PaymentMethodEntity> paymentMethodListToPaymentMethodEntityList(List<PaymentMethod> list) {
        if ( list == null ) {
            return null;
        }

        List<PaymentMethodEntity> list1 = new ArrayList<PaymentMethodEntity>( list.size() );
        for ( PaymentMethod paymentMethod : list ) {
            list1.add( paymentMethodMapper.toEntity( paymentMethod ) );
        }

        return list1;
    }

    protected List<QuestionAnswerEntity> questionListToQuestionAnswerEntityList(List<Question> list) {
        if ( list == null ) {
            return null;
        }

        List<QuestionAnswerEntity> list1 = new ArrayList<QuestionAnswerEntity>( list.size() );
        for ( Question question : list ) {
            list1.add( questionMapper.toEntity( question ) );
        }

        return list1;
    }
}
