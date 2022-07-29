package com.ironhack.outdoorplacesservice.controller.impl;
import com.ironhack.outdoorplacesservice.controller.dto.PlaceDTO;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ironhack.outdoorplacesservice.enums.Region;
import com.ironhack.outdoorplacesservice.enums.Category;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PlaceControllerImplTest {

    @Autowired
    private WebApplicationContext webApplicationContext;
    private MockMvc mockMvc;
    private final ObjectMapper objectMapper = new ObjectMapper();

    @BeforeEach
    public void setUp() {
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }

    @AfterEach
    public void tearDown() {
    }

    @Test
    public void getAllPlaces() throws Exception {
        MvcResult mvcResult = mockMvc.perform(get("/places")).andExpect(status().isOk()).andReturn();
        String content = mvcResult.getResponse().getContentAsString();
        assertNotNull(content);
    }

    @Test
    public void getPlaceById() throws Exception {
        MvcResult mvcResult = mockMvc.perform(get("/places/1")).andExpect(status().isOk()).andReturn();
        String content = mvcResult.getResponse().getContentAsString();
        assertNotNull(content);
    }

    @Test
    public void getPlaceByName() throws Exception {
        MvcResult mvcResult = mockMvc.perform(get("/places/name/test")).andExpect(status().isOk()).andReturn();
        String content = mvcResult.getResponse().getContentAsString();
        assertNotNull(content);
    }

    @Test
    public void getPlaceByUserId() throws Exception {
        MvcResult mvcResult = mockMvc.perform(get("/places/user/1")).andExpect(status().isOk()).andReturn();
        String content = mvcResult.getResponse().getContentAsString();
        assertNotNull(content);
    }

    @Test
    public void getPlaceByRegion() throws Exception {
        MvcResult mvcResult = mockMvc.perform(get("/places/region/NORTH_EAST")).andExpect(status().isOk()).andReturn();
        String content = mvcResult.getResponse().getContentAsString();
        assertNotNull(content);
    }

    @Test
    public void getPlaceByCategory() throws Exception {
        MvcResult mvcResult = mockMvc.perform(get("/places/category/OUTDOOR")).andExpect(status().isOk()).andReturn();
        String content = mvcResult.getResponse().getContentAsString();
        assertNotNull(content);
    }

    public void deleteById() throws Exception {
        MvcResult mvcResult = mockMvc.perform(delete("/places/1")).andExpect(status().isOk()).andReturn();
        String content = mvcResult.getResponse().getContentAsString();
        assertNotNull(content);
    }

    @Test
    public void createPlace() throws Exception {
        PlaceDTO placeDTO = new PlaceDTO();
        placeDTO.setName("test");
        placeDTO.setDescription("test");
        placeDTO.setRegion(Region.MADRID);
        placeDTO.setCategory(Category.AQUATIC);
        placeDTO.setUserId(1L);
        MvcResult mvcResult = mockMvc.perform(post("/places").contentType(MediaType.APPLICATION_JSON).content(objectMapper.writeValueAsString(placeDTO))).andExpect(status().isOk()).andReturn();
        String content = mvcResult.getResponse().getContentAsString();
        assertNotNull(content);
    }

    @Test
    public void updatePlace() throws Exception {
        PlaceDTO placeDTO = new PlaceDTO();
        placeDTO.setName("test");
        placeDTO.setDescription("test");
        placeDTO.setRegion(Region.MADRID);
        placeDTO.setCategory(Category.AQUATIC);
        placeDTO.setUserId(1L);
        MvcResult mvcResult = mockMvc.perform(put("/places/1").contentType(MediaType.APPLICATION_JSON).content(objectMapper.writeValueAsString(placeDTO))).andExpect(status().isOk()).andReturn();
        String content = mvcResult.getResponse().getContentAsString();
        assertNotNull(content);
    }



}
