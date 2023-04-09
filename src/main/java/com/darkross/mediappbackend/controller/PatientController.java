package com.darkross.mediappbackend.controller;

import com.darkross.mediappbackend.model.Patient;
import com.darkross.mediappbackend.service.PatientServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

import static org.springframework.http.HttpStatus.*;

@RestController
@RequestMapping("/patients")
@RequiredArgsConstructor
public class PatientController {

    private final PatientServiceImpl service;
   /* @GetMapping
    public List<Patient> findAll(){
        return service.findAll();
    }*/
   @GetMapping
   public ResponseEntity<List<Patient>> findAll(){
       List<Patient> list = service.findAll();
       return new ResponseEntity<>(list, OK);
   }

  /*  @GetMapping("/{id}")
    public Patient findById(@PathVariable("id") Integer id){
        return service.findById(id);
    }*/

    @GetMapping("/{id}")
    public ResponseEntity<Patient> findById(@PathVariable("id") Integer id){
        Patient obj = service.findById(id);
        return new ResponseEntity<>(obj,OK);
    }

  /*  @PostMapping
    public Patient save(@RequestBody Patient patient){
        return service.save(patient);
    }*/
    //nivel mbasico de richardzon
/*  @PostMapping
  public ResponseEntity<Patient> save(@RequestBody Patient patient){
      Patient obj = service.save(patient);
      return new ResponseEntity<>(obj,CREATED);
  }*/

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody Patient patient){
        Patient obj = service.save(patient);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getIdPatient()).toUri();
        return ResponseEntity.created(location).build();
    }
/*
    //@PatchMapping---> solo para modificar algunos elementos
    @PutMapping//(consume="",produce="") --> putmapping para modificar todos los elementos
    public Patient update(@RequestBody Patient patient){
        return service.update(patient);
    }*/

    @PutMapping
    public ResponseEntity <Patient> update(@RequestBody Patient patient){
        Patient obj = service.update(patient);
        return new  ResponseEntity<>(obj, OK);
    }

   /* @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id){
         service.delete(id);
    }*/

    public ResponseEntity <Void> delete(@PathVariable("id") Integer id){
        service.delete(id);
        return new ResponseEntity<>(NO_CONTENT);
    }
}
