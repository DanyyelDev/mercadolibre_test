package com.hackerrank.sample.product.application.service;

import com.hackerrank.sample.product.domain.service.ProductDomainService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

class ProductApplicationServiceTest {

    @Mock
    ProductDomainService domainService;

    @InjectMocks
    ProductApplicationService appService;

    @Test
    void shouldCallDomainService() {;
        //Pendiente
    }
}
