package com.master.masterhibernate.servicesImpl;

import com.master.masterhibernate.domain.Avion1;
import com.master.masterhibernate.repositories.Avion1Repository;
import com.master.masterhibernate.services.Avion1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Avion1ServiceImpl implements Avion1Service {

    @Autowired
    private Avion1Repository avion1Repository;

    @Override
    public List<Avion1> findAll() {
        return avion1Repository.findAll();
    }
}
