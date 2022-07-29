package com.ironhack.eventservice.controller.impl;

import org.mockito.Mock;
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
import com.ironhack.eventservice.enums.Region;
import com.ironhack.eventservice.enums.Type;
import com.ironhack.eventservice.model.Event;
import com.ironhack.eventservice.repository.EventRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;


@SpringBootTest
public class EventControllerImplTest {

    @Autowired
    private EventRepository eventRepository;

    @Autowired
    private WebApplicationContext webApplicationContext;
    private MockMvc mockMvc;
    private final ObjectMapper objectMapper = new ObjectMapper();


    private Event event1, event2, event3;

    @BeforeEach
    void setUp() {
        mockMvc = webApplicationContext.getBean(MockMvc.class);
        event1 = new Event(1L,"Name 1", "Description 1", "Adrress 1", Region.MADRID , 10,10,"Date 1","Time 1", 10, Type.TRAIL);
        event2 = new Event(2L,"Name 2", "Description 2", "Adrress 2", Region.MADRID , 10,10,"Date 2","Time 2", 10, Type.TRAIL);
        event3 = new Event(3L,"Name 3", "Description 3", "Adrress 3", Region.MADRID , 10,10,"Date 3","Time 3", 10, Type.TRAIL);
        eventRepository.save(event1);
        eventRepository.save(event2);
        eventRepository.save(event3);

    }

    @AfterEach
    void tearDown() {
        eventRepository.deleteAll();
    }

    @Test
    void findAll() throws Exception {

        Event event1 = new Event(1L, "Name 1", "Description 1", "Adrress 1", Region.MADRID, 10, 10, "Date 1", "Time 1", 10, Type.TRAIL);
        String objectAsJson = objectMapper.writeValueAsString(event1);
        mockMvc.perform(get("/events/")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().json(objectAsJson));
    }
    @Test
    void findEventById() throws Exception{

        Event event1 = new Event(1L,"Name 1", "Description 1", "Adrress 1", Region.MADRID , 10,10,"Date 1","Time 1", 10, Type.TRAIL);
        String objectAsJson = objectMapper.writeValueAsString(event1);
        mockMvc.perform(get("/events/1")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().json(objectAsJson));
    }

    @Test
    void findEventByName() throws Exception{

        Event event1 = new Event(1L,"Name 1", "Description 1", "Adrress 1", Region.MADRID , 10,10,"Date 1","Time 1", 10, Type.TRAIL);
        String objectAsJson = objectMapper.writeValueAsString(event1);
        mockMvc.perform(get("/events/name/Name 1")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().json(objectAsJson));
    }

    @Test
    void findEventByDescription() throws Exception{

        Event event1 = new Event(1L,"Name 1", "Description 1", "Adrress 1", Region.MADRID , 10,10,"Date 1","Time 1", 10, Type.TRAIL);
        String objectAsJson = objectMapper.writeValueAsString(event1);
        mockMvc.perform(get("/events/description/Description 1")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().json(objectAsJson));


    }

    @Test
    void findEventByAddress() throws Exception{

        Event event1 = new Event(1L,"Name 1", "Description 1", "Adrress 1", Region.MADRID , 10,10,"Date 1","Time 1", 10, Type.TRAIL);
        String objectAsJson = objectMapper.writeValueAsString(event1);
        mockMvc.perform(get("/events/address/Adrress 1")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().json(objectAsJson));

    }

    @Test
    void findEventByRegion() throws Exception{

        Event event1 = new Event(1L,"Name 1", "Description 1", "Adrress 1", Region.MADRID , 10,10,"Date 1","Time 1", 10, Type.TRAIL);
        String objectAsJson = objectMapper.writeValueAsString(event1);
        mockMvc.perform(get("/events/region/MADRID")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().json(objectAsJson));

    }

    @Test
    void findEventByDate() throws Exception{

        Event event1 = new Event(1L,"Name 1", "Description 1", "Adrress 1", Region.MADRID , 10,10,"Date 1","Time 1", 10, Type.TRAIL);
        String objectAsJson = objectMapper.writeValueAsString(event1);
            mockMvc.perform(get("/events/date/Date 1")
                    .contentType(MediaType.APPLICATION_JSON))
                    .andExpect(status().isOk())
                    .andExpect(content().json(objectAsJson));

    }

    @Test
    void findEventByTime() throws Exception{

        Event event1 = new Event(1L,"Name 1", "Description 1", "Adrress 1", Region.MADRID , 10,10,"Date 1","Time 1", 10, Type.TRAIL);
        String objectAsJson = objectMapper.writeValueAsString(event1);
        mockMvc.perform(get("/events/time/Time 1")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().json(objectAsJson));

    }

    @Test
    void findEventByType() throws Exception{

        Event event1 = new Event(1L,"Name 1", "Description 1", "Adrress 1", Region.MADRID , 10,10,"Date 1","Time 1", 10, Type.TRAIL);
        String objectAsJson = objectMapper.writeValueAsString(event1);
        mockMvc.perform(get("/events/type/TRAIL")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().json(objectAsJson));

    }

    @Test
    void findEventByPrice() throws Exception{

        Event event1 = new Event(1L,"Name 1", "Description 1", "Adrress 1", Region.MADRID , 10,10,"Date 1","Time 1", 10, Type.TRAIL);
        String objectAsJson = objectMapper.writeValueAsString(event1);
        mockMvc.perform(get("/events/price/10")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().json(objectAsJson));

    }

    @Test
    void findEventByCapacity() throws Exception{

        Event event1 = new Event(1L,"Name 1", "Description 1", "Adrress 1", Region.MADRID , 10,10,"Date 1","Time 1", 10, Type.TRAIL);
        String objectAsJson = objectMapper.writeValueAsString(event1);
        mockMvc.perform(get("/events/capacity/10")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().json(objectAsJson));

    }


    @Test
    void deleteEvent() throws Exception{

        Event event1 = new Event(1L,"Name 1", "Description 1", "Adrress 1", Region.MADRID , 10,10,"Date 1","Time 1", 10, Type.TRAIL);
        String objectAsJson = objectMapper.writeValueAsString(event1);
        mockMvc.perform(delete("/events/1")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().json(objectAsJson));

    }

    @Test
    void updateEvent() throws Exception{

        Event event1 = new Event(1L,"Name 1", "Description 1", "Adrress 1", Region.MADRID , 10,10,"Date 1","Time 1", 10, Type.TRAIL);
        String objectAsJson = objectMapper.writeValueAsString(event1);
        mockMvc.perform(put("/events/1")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().json(objectAsJson));

    }

    @Test
    void createEvent() throws Exception{

        Event event1 = new Event(1L,"Name 1", "Description 1", "Adrress 1", Region.MADRID , 10,10,"Date 1","Time 1", 10, Type.TRAIL);
        String objectAsJson = objectMapper.writeValueAsString(event1);
        mockMvc.perform(post("/events")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().json(objectAsJson));

    }















}
