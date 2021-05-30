package com.onemount.onefast.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "specifications")
public class Specifications {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
