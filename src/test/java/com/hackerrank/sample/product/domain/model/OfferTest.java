package com.hackerrank.sample.product.domain.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OfferTest {

    @Test
    void shouldRoundDiscountPercentage() {
        Offer offer = new Offer(true,12.7, 100.0);
        assertEquals(13, offer.getDiscountPercentage());
    }
}
