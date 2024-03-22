package com.inditex.test.inditex.infrastructure.controllers;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest
@AutoConfigureMockMvc
class PriceControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @ParameterizedTest
    @CsvSource({
            "2020-06-14T00:00:00, 35455, 1",
            "2020-06-14T15:00:00, 35455, 1",
            "2020-06-15T00:00:00, 35455, 1",
            "2020-06-15T16:00:00, 35455, 1"
    })
    void testPriceEndpoint(String date, String productId, String brandId) throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/prices")
                        .param("date", date)
                        .param("productId", productId)
                        .param("brandId", brandId)
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }
}