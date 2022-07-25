package com.ironhack.trailsservice.controller.impl;

import com.ironhack.trailsservice.controller.interfaces.TrailsControllerInterface;
import com.ironhack.trailsservice.model.Trails;
import com.ironhack.trailsservice.repository.TrailsRepository;
import com.ironhack.trailsservice.service.impl.TrailsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class TrailsControllerImpl implements TrailsControllerInterface {

    @Autowired
    private TrailsRepository trailsRepository;

    @Autowired
    private TrailsServiceImpl trailsService;


    @GetMapping("/trails")
    @ResponseStatus(HttpStatus.OK)
    public List<Trails> findAll() {

        return trailsRepository.findAll();
    }

    @GetMapping("/trails/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Trails findById(@PathVariable("id") Long id) {
        return trailsRepository.findById(id).get();


    }

    @PostMapping("/trails")
    @ResponseStatus(HttpStatus.CREATED)
    public Trails create(@RequestBody Trails trails) {
        return null;
    }

    @PutMapping("/trails/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void update(Long id, Trails trails) {
         trailsService.update(id, trails);
    }

    @DeleteMapping("/trails/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(Long id) {
        trailsService.delete(id);


    }

















}
