package com.darkross.mediappbackend.repo;

import com.darkross.mediappbackend.model.Patient;
import org.springframework.stereotype.Repository;

@Repository
public class PatientReport {
    public String sayHello(Patient p){
        return p.getIdPatient() + " - " + p.getName();
    }
}
