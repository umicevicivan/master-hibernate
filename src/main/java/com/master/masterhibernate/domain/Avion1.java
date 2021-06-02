package com.master.masterhibernate.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "Avion1", schema = "STUDENT")
public class Avion1 {
    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "REGISTRACIONI_BROJ")
    private int registracioniBroj;
    @Column(name = "PROIZVODJAC")
    private String proizvodjac;
    @Column(name = "MODEL")
    private String model;
    @Column(name = "BROJ_SEDISTA")
    private int brojSedista;

}
