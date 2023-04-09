package com.darkross.mediappbackend.service;

import com.darkross.mediappbackend.model.Patient;
import com.darkross.mediappbackend.repo.IPatientReport;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PatientServiceImpl implements IPatientService{

    private final IPatientReport repo;
    @Override
    public Patient save(Patient patient) {
        return repo.save(patient);
    }

    @Override
    public Patient update(Patient patient) {
        return repo.save(patient);
    }

    @Override
    public List<Patient> findAll() {
        return repo.findAll();
    }

    @Override
    public Patient findById(Integer id) {
        return repo.findById(id).orElse(new Patient());
    }

    @Override
    public void delete(Integer id) {
        repo.deleteById(id);
    }
}

