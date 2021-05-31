package com.onemount.onefast.model;

import javax.persistence.Column;
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

    @Column(name = "battery")
    private Long battery;

    @Column(name = "weight")
    private Long weight;

    @Column(name = "size")
    private Long size;

    @Column(name = "exterior")
    private String exterior;

    @Column(name = "furniture")
    private String furniture;

    @Column(name = "smart_feature")
    private String smartFeature;
}
