package com.ironhack.trailsservice.controller.impl;

import com.ironhack.trailsservice.controller.dto.TrailDTO;
import com.ironhack.trailsservice.controller.interfaces.TrailControllerInterface;
import com.ironhack.trailsservice.model.Trail;
import com.ironhack.trailsservice.repository.TrailRepository;
import com.ironhack.trailsservice.service.impl.TrailServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class TrailControllerImpl implements TrailControllerInterface {

    @Autowired
    private TrailRepository trailRepository;

    @Autowired
    private TrailServiceImpl trailsService;


    @GetMapping("/trails")
    @ResponseStatus(HttpStatus.OK)
    public List<Trail> findAll() {

        return trailRepository.findAll();
    }

    @GetMapping("/trails/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Trail findTrailById(@PathVariable("id") Long id) {
        return trailRepository.findById(id).get();


    }

    @PostMapping("/trail/add")
    @ResponseStatus(HttpStatus.CREATED)
    public Trail createTrail(@RequestBody Trail trail) {

        return trailRepository.save(trail);
    }

    @PutMapping("/trail/edit/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public Trail updatePlace(@PathVariable("id") Long id,@RequestBody @Valid TrailDTO trail) {
        Trail trailUpdated = trailsService.updateTrail(id, trail);
        return trailUpdated;
    }

    @DeleteMapping("/trail/delete/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteTrail(@PathVariable("id") Long id) {
        trailRepository.deleteById(id);

    }

}
















