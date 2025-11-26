package com.hackerrank.sample.product.api;

import com.hackerrank.sample.product.application.service.ProductApplicationService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(ProductController.class)
class ProductControllerTest {

    @Autowired
    private MockMvc mvc;

    @MockBean
    private ProductApplicationService service;

    @Test
    void shouldReturnProduct() throws Exception {
        mvc.perform(get("/products/1"))
                .andExpect(status().isOk());
    }
}

