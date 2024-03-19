package com.base.artefactobase.back.controllers;


import com.base.artefactobase.service.services.security.JwtService;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@WebMvcTest(WarehouseControllerTest.class) //Carga solo esta clase, es mejor así
//@SpringBootTest //Carga contexto entero Spring
@AutoConfigureMockMvc //Carga MockMvc
class WarehouseControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private JwtService jwtService;

    @Test
    void getAllPencilsById() throws Exception{

        mockMvc.perform(MockMvcRequestBuilders.get("/").param("id", "1"))
                .andExpect(MockMvcResultMatchers.status().isOk())                                   //Cheking the status
                .andExpect(MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON)) //Cheking that is Json
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].name").value("Pencil 1"));

    }

    @Test
    void getAllPencils() throws Exception{

        Mockito.when(jwtService.generateToken(Mockito.any(UserDetails.class))).thenReturn("fakeToken");

        mockMvc.perform(MockMvcRequestBuilders.get("/all"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.jsonPath("$").isArray())                  //Cheking that is Array
                .andExpect(MockMvcResultMatchers.jsonPath("$", Matchers.hasSize(0)));
    }

}
