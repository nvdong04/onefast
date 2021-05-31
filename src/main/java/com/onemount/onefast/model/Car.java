package com.onemount.onefast.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_car")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    private Showroom showroom;

    @Column(name = "name", nullable = false, length = 100)
    private String name;

    @Column(name = "thumnailURL")
    private String thumnailURL;

    @Column(name = "seating")
    private int seating;

    @Column(name = "year_of_manufacture")
    private int yearOfManufacture;

    @Column(name = "description", columnDefinition = "TEXT")
    private String description;

    @Column(name = "type", length = 50)
    private String type;

    @Column(name = "version", length = 50)
    private String version;

    @Column(name = "color",length = 50)
    private String color;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "status")
    private int status;
}
