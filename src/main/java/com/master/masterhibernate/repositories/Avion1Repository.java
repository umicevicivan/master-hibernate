package com.master.masterhibernate.repositories;

import com.master.masterhibernate.domain.Avion1;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Avion1Repository extends CrudRepository<Avion1, Integer> {

    List<Avion1> findAll();
}
