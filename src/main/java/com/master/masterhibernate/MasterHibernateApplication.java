package com.master.masterhibernate;

import com.master.masterhibernate.services.Avion1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MasterHibernateApplication implements CommandLineRunner {

    @Autowired
    Avion1Service avion1Service;

    public static void main(String[] args) {
        SpringApplication.run(MasterHibernateApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("aaaa");

        System.out.println(avion1Service.findAll().get(0));
    }
}
