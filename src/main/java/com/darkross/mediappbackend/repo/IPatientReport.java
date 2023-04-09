package com.darkross.mediappbackend.repo;

import com.darkross.mediappbackend.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPatientReport extends JpaRepository<Patient,Integer> {

}
