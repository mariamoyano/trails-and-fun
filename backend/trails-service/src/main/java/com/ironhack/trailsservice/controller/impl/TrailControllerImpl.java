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
    public Trail findById(@PathVariable("id") Long id) {
        return trailRepository.findById(id).get();


    }

    @PostMapping("/trail/add")
    @ResponseStatus(HttpStatus.CREATED)
    public Trail create(@RequestBody Trail trail) {

        return trailRepository.save(trail);
    }

    @PutMapping("/trail/edit/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void update(@PathVariable Long id,@RequestBody @Valid TrailDTO trail) {
        trailsService.update(id, trail);
    }

    @DeleteMapping("/trail/delete/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        trailsService.delete(id);


    }

}
















