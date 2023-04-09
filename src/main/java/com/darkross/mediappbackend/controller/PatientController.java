package com.darkross.mediappbackend.controller;

import com.darkross.mediappbackend.model.Patient;
import com.darkross.mediappbackend.service.PatientServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patients")
@RequiredArgsConstructor
public class PatientController {

    private final PatientServiceImpl service;
    @GetMapping
    public List<Patient> findAll(){
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Patient findById(@PathVariable("id") Integer id){
        return service.findById(id);
    }

    @PostMapping
    public Patient save(@RequestBody Patient patient){
        return service.save(patient);
    }

    @PutMapping
    public Patient update(@RequestBody Patient patient){
        return service.save(patient);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id){
         service.delete(id);
    }
}
