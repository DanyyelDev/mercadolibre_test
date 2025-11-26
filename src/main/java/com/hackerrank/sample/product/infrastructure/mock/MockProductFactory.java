package com.hackerrank.sample.product.infrastructure.mock;


import com.hackerrank.sample.product.infrastructure.entity.*;

import java.util.List;

public class MockProductFactory {

    public static ProductEntity createMockProduct() {

        ProductEntity product = new ProductEntity();
        product.setId(1L);
        product.setName("Wireless Bluetooth Headphones Pro X");
        product.setDescription("Auriculares Bluetooth de alta calidad con cancelación activa de ruido.");

        // ---- Rating ----
        RatingEntity rating = new RatingEntity();
        rating.setAverage(4.7);
        rating.setTotalReviews(2450);
        product.setRatingEntity(rating);

        // --- Offer ---
        product.setOfferEntity(
                new OfferEntity(true, 15.0, 169.99)
        );

        product.setPrice(199.99);

        // ---- Colors ----
        ColorOptionEntity black = new ColorOptionEntity();
        black.setId(1L);
        black.setColorName("Black");
        black.setHexCode("#000000");
        black.setProduct(product);

        ColorOptionEntity white = new ColorOptionEntity();
        white.setId(2L);
        white.setColorName("White");
        white.setHexCode("#FFFFFF");
        white.setProduct(product);

        product.setColors(List.of(black, white));

        // ---- Payment Methods ----
        PaymentMethodEntity pm1 = new PaymentMethodEntity();
        pm1.setId(1L);
        pm1.setProvider("Visa");
        pm1.setType("CreditCard");
        pm1.setProduct(product);

        PaymentMethodEntity pm2 = new PaymentMethodEntity();
        pm2.setId(2L);
        pm2.setProvider("PayPal");
        pm2.setType("DigitalWallet");
        pm2.setProduct(product);

        product.setPaymentMethodEntities(List.of(pm1, pm2));

        // ---- String-based lists ----
        product.setProductHighlights(List.of(
                "Cancelación activa de ruido",
                "35 horas de autonomía",
                "Carga rápida en 10 minutos"
        ));

        product.setImages(List.of(
                "https://example.com/img/product/main1.png",
                "https://example.com/img/product/main2.png"
        ));

        product.setGeneralFeatures(List.of(
                "Bluetooth 5.3",
                "Compatible con iOS y Android",
                "Garantía de 12 meses"
        ));

        product.setSpecifications(List.of(
                "Frecuencia: 2.4GHz",
                "Driver: 40mm",
                "Impedancia: 32Ω"
        ));

        product.setOtherDetails(List.of(
                "Incluye estuche rígido",
                "Cable USB-C incluido"
        ));

        product.setSpecificProductData(List.of(
                "Uso recomendado: Deportivo / Viajes / Oficina"
        ));

        // ---- Questions & Answers ----
        QuestionAnswerEntity q1 = new QuestionAnswerEntity();
        q1.setId(1L);
        q1.setQuestion("¿Sirve para hacer llamadas?");
        q1.setAnswer("Sí, incluye micrófono con reducción de ruido.");
        q1.setProduct(product);

        QuestionAnswerEntity q2 = new QuestionAnswerEntity();
        q2.setId(2L);
        q2.setQuestion("¿Viene con funda?");
        q2.setAnswer("Sí, viene con estuche rígido premium.");
        q2.setProduct(product);

        product.setQuestions(List.of(q1, q2));

        // ---- Purchase Info ----
        PurchaseInfoEntity purchaseInfo = new PurchaseInfoEntity();
        purchaseInfo.setId(1L);
        purchaseInfo.setEstimatedArrival("Llega mañana");
        purchaseInfo.setPickupLocation("Punto de entrega cercano");
        purchaseInfo.setAvailableStock(50);
        purchaseInfo.setSoldQuantity(12480);
        purchaseInfo.setShippingMethod("Envío desde bodega central");
        purchaseInfo.setSellerName("SoundTech Store");

        purchaseInfo.setProduct(product);
        product.setPurchaseInfoEntity(purchaseInfo);

        return product;
    }
}
