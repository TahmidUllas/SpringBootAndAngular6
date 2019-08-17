package com.misl.DOS.controller;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.misl.DOS.exception.ResourceNotFoundException;
import com.misl.DOS.model.DosUser;
import com.misl.DOS.repository.DosRepository;


@RestController
@RequestMapping("/api/v1")
public class DosController{
    @Autowired
    private DosRepository dosRepository;

    @GetMapping("/users")
    public List<DosUser> getAllUser() {
        return dosRepository.findAll();
    }

    @GetMapping("/users/{id}")
    public ResponseEntity<DosUser> getUserById(@PathVariable(value = "id") Long userId)
            throws ResourceNotFoundException {
        DosUser user = dosRepository.findById(userId)
                .orElseThrow(() -> new ResourceNotFoundException("User not found for this id :: " + userId));
        return ResponseEntity.ok().body(user);
    }

    @PostMapping("/users")
    public DosUser createUser(@Valid @RequestBody DosUser user) {
        return dosRepository.save(user);
    }

    @PutMapping("/users/{id}")
    public ResponseEntity<DosUser> updateUser(@PathVariable(value = "id") Long userId,
                                                   @Valid @RequestBody DosUser userDetails) throws ResourceNotFoundException {
        DosUser user = dosRepository.findById(userId)
                .orElseThrow(() -> new ResourceNotFoundException("User not found for this id :: " + userId));

        user.setEmailId(userDetails.getEmailId());
        user.setName(userDetails.getName());
        final DosUser updatedUser = dosRepository.save(user);
        return ResponseEntity.ok(updatedUser);
    }

    @DeleteMapping("/users/{id}")
    public Map<String, Boolean> deleteUser(@PathVariable(value = "id") Long userId)
            throws ResourceNotFoundException {
        DosUser user = dosRepository.findById(userId)
                .orElseThrow(() -> new ResourceNotFoundException("User not found for this id :: " + userId));

        dosRepository.delete(user);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;
    }
}