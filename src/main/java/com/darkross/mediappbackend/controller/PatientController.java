package com.darkross.mediappbackend.controller;

import com.darkross.mediappbackend.model.Patient;
import com.darkross.mediappbackend.service.PatientService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/patients")
@RequiredArgsConstructor
public class PatientController {
//   @Autowired
    private final PatientService service;


@GetMapping
    public String sayHello(){
        Patient p = new Patient();
        p.setIdPatient(1);
        p.setName("ALAIN CAMPOVERDEx");
        return service.sayHello(p);

    }
}
