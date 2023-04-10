package com.darkross.mediappbackend.controller;


import com.darkross.mediappbackend.exception.ModelNotFoundException;
import com.darkross.mediappbackend.model.Medic;
import com.darkross.mediappbackend.service.MedicServiceimpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

import static org.springframework.http.HttpStatus.NO_CONTENT;
import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("/medics")
@RequiredArgsConstructor
public class MedicController {

    private final MedicServiceimpl service;

    @GetMapping
    public ResponseEntity<List<Medic>> findAll(){
        List<Medic> list = service.findAll();
        return new ResponseEntity<>(list, OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Medic> findById(@PathVariable("id") Integer id){
        Medic obj = service.findById(id);
        if(obj == null){
            //throw new ModelNotFoundException("ID NOT FOUND" + id);
            throw new ModelNotFoundException("ID NOT FOUND " + id);
        }
        return new ResponseEntity<>(obj,OK);
    }

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody Medic medic){
        Medic obj = service.save(medic);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getIdMedic()).toUri();
        return ResponseEntity.created(location).build();
    }

    @PutMapping
    public ResponseEntity <Medic> update(@RequestBody Medic medic){
        Medic obj = service.update(medic);
        return new  ResponseEntity<>(obj, OK);
    }

    public ResponseEntity <Void> delete(@PathVariable("id") Integer id){
        service.delete(id);
        return new ResponseEntity<>(NO_CONTENT);
    }
}
