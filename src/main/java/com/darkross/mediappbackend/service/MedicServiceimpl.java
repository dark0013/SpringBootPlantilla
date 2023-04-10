package com.darkross.mediappbackend.service;

import com.darkross.mediappbackend.model.Medic;
import com.darkross.mediappbackend.repo.IGenericRepo;
import com.darkross.mediappbackend.repo.IMedicRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MedicServiceimpl extends CRUDImpl<Medic,Integer> implements IMedicService{

    private final IMedicRepo repo;
    @Override
    protected IGenericRepo<Medic, Integer> getRepo() {
        return repo;
    }
}
