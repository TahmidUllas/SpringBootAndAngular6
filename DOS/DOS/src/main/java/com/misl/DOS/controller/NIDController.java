package com.misl.DOS.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import com.misl.DOS.repository.NIDRepository;
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
import com.misl.DOS.model.NID;
import com.misl.DOS.repository.NIDRepository;

@RestController
@RequestMapping("/api/v1")
public class NIDController {
    @Autowired
    private NIDRepository nidRepository;

    @GetMapping("/NIDs")
    public List<NID> getAllNid() {
        return nidRepository.findAll();
    }

    @GetMapping("/NIDs/{id}")
    public ResponseEntity<NID> getNIDById(@PathVariable(value = "id") Long nidId)
            throws ResourceNotFoundException {
        NID userNid = nidRepository.findById(nidId)
                .orElseThrow(() -> new ResourceNotFoundException("NID not found for this id :: " + nidId));
        return ResponseEntity.ok().body(userNid);
    }

    @PostMapping("/NIDs")
    public NID createNid(@Valid @RequestBody NID userNid) {
        return nidRepository.save(userNid);
    }

    @PutMapping("/NIDs/{id}")
    public ResponseEntity<NID> updateUser(@PathVariable(value = "id") Long nidId,
                                              @Valid @RequestBody NID nidDetails) throws ResourceNotFoundException {
        NID userNid = nidRepository.findById(nidId)
                .orElseThrow(() -> new ResourceNotFoundException("nid not found for this id :: " + nidId));

        userNid.setIdN(nidDetails.getIdN());
        userNid.setUserID(nidDetails.getUserID());
        userNid.setName(nidDetails.getName());
        userNid.setfatherName(nidDetails.getfatherName());
        userNid.setMotherName(nidDetails.getMotherName());
        userNid.setDateOfBirth(nidDetails.getDateOfBirth());
        final NID updatedUserNid = nidRepository.save(userNid);
        return ResponseEntity.ok(updatedUserNid);
    }

    @DeleteMapping("/NIDs/{id}")
    public Map<String, Boolean> deleteNid(@PathVariable(value = "id") Long nidId)
            throws ResourceNotFoundException {
        NID userNid = nidRepository.findById(nidId)
                .orElseThrow(() -> new ResourceNotFoundException("nid not found for this id :: " + nidId));

        nidRepository.delete(userNid);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);cd 
        return response;
    }
}
