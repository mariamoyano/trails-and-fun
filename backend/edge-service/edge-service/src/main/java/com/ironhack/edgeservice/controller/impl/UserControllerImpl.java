package com.ironhack.edgeservice.controller.impl;

import com.ironhack.edgeservice.client.PlacesClient;
import com.ironhack.edgeservice.client.TrailsClient;
import com.ironhack.edgeservice.controller.dto.PlaceDTO;
import com.ironhack.edgeservice.controller.dto.RoleDTO;
import com.ironhack.edgeservice.controller.dto.TrailDTO;
import com.ironhack.edgeservice.controller.dto.UserDTO;
import com.ironhack.edgeservice.controller.interfaces.UserController;
import com.ironhack.edgeservice.enums.Category;
import com.ironhack.edgeservice.enums.Region;
import com.ironhack.edgeservice.model.Role;
import com.ironhack.edgeservice.model.User;
import com.ironhack.edgeservice.service.interfaces.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@Slf4j
@CrossOrigin(origins="http://localhost:4200")
public class UserControllerImpl implements UserController {

    @Autowired
    private UserService userService;


    @Autowired
    private PlacesClient placesClient;

    @Autowired
    private TrailsClient trailsClient;



    @PostMapping("/users")
    @ResponseStatus(HttpStatus.CREATED)
    public UserDTO register(@RequestBody UserDTO userDTO) {
        return userService.store(userDTO);
    }

    @GetMapping("/users")
    @ResponseStatus(HttpStatus.OK)
    public List<UserDTO> findAll() {

        return userService.findAll();
    }

    @GetMapping("/login")
    @ResponseStatus(HttpStatus.OK)
    public UserDTO login(@AuthenticationPrincipal User user) {
        log.info("Login successful");
        user.setPassword(null); // NEVER RETURN PASSWORD
        return userToDTO(user);
    }

    private UserDTO userToDTO(User user) {
        UserDTO userDTO = new UserDTO();
        userDTO.setUsername(user.getUsername());
        userDTO.setPassword(user.getPassword());
        userDTO.setRoles(user.getRoles().stream().map(this::roleToDTO).collect(Collectors.toSet()));

        return userDTO;
    }

    private RoleDTO roleToDTO(Role role) {
        RoleDTO roleDTO = new RoleDTO();
        roleDTO.setName(role.getName());

        return roleDTO;
    }




    @GetMapping("/places")
    @ResponseStatus(HttpStatus.OK)
    public List<PlaceDTO> getPlaces() {
        return placesClient.getPlaces();
    }

    @PutMapping("/place/edit/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updatePlace(@PathVariable("id") Long id, @RequestBody PlaceDTO place) {
        placesClient.updatePlace(id, place);
    }

    @DeleteMapping("/place/delete/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletePlace(@PathVariable (name="id") Long id) {
        placesClient.deletePlace(id);
    }

    @PostMapping("/place/add")
    @ResponseStatus(HttpStatus.CREATED)
    public PlaceDTO createPlace(@RequestBody PlaceDTO place) {
        return placesClient.createPlace(place);
    }

    @GetMapping("/places/{id}")
    @ResponseStatus(HttpStatus.OK)
    public PlaceDTO getPlace(Long id) {
        return placesClient.getPlace(id);
    }

    @GetMapping("/places/name/{name}")
    @ResponseStatus(HttpStatus.OK)
    public List<PlaceDTO> getPlaceByName(@PathVariable(name = "name") String name) {
        return placesClient.getPlaceByName(name);

    }

    @GetMapping("/places/user/{userId}")
    @ResponseStatus(HttpStatus.OK)
    public List<PlaceDTO> getPlaceByUserId(@PathVariable (name = "userId") Long userId) {
        return placesClient.getPlaceByUserId(userId);
    }


    @GetMapping("/places/category/{category}")
    @ResponseStatus(HttpStatus.OK)
    public List<PlaceDTO> getPlaceByCategory(@PathVariable (name = "category") Category category) {
        return placesClient.getPlaceByCategory(category);
    }

    @GetMapping("/places/address/{address}")
    @ResponseStatus(HttpStatus.OK)
    public List<PlaceDTO> getPlaceByAddress(@PathVariable (name = "address") String address) {
        return placesClient.getPlaceByAddress(address);
    }


    @GetMapping("/places/region/{region}")
    @ResponseStatus(HttpStatus.OK)
    public List<PlaceDTO> getPlaceByRegion(@PathVariable (name = "region") Region region) {
        return placesClient.getPlaceByRegion(region);
    }

    @GetMapping("/places/latitude/{latitude}/longitude/{longitude}")
    @ResponseStatus(HttpStatus.OK)
    public List<PlaceDTO> getPlaceByLatitudeAndLongitude(@PathVariable (name = "latitude") double latitude, @PathVariable (name = "longitude") double longitude) {
        return placesClient.getPlaceByLatitudeAndLongitude(latitude, longitude);
    }

    @GetMapping("/trails")
    @ResponseStatus(HttpStatus.OK)
    public List<TrailDTO> getTrails() {
        return trailsClient.getTrails();
    }

    @GetMapping("/trail/{id}")
    @ResponseStatus(HttpStatus.OK)
    public TrailDTO getTrail(@PathVariable Long id) {
        return trailsClient.getTrail(id);
    }

    @PutMapping("/trail/edit/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateTrail(@PathVariable Long id, TrailDTO trail) {
        trailsClient.updateTrail(id, trail);
    }

    @DeleteMapping("/trail/delete/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteTrail(@PathVariable Long id) {
        trailsClient.deleteTrail(id);
    }

    @PostMapping("/trail/add")
    @ResponseStatus(HttpStatus.CREATED)
    public TrailDTO createTrail(TrailDTO trail) {
        return trailsClient.createTrail(trail);
    }

}
