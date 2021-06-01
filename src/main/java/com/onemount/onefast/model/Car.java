package com.onemount.onefast.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
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

    @Column(name = "seat_number")
    private int seatNumber;

    @Column(name = "year_of_manufacture")
    private int yearOfManufacture;

    @Column(name = "description", columnDefinition = "TEXT")
    private String description;

    @Column(name = "type", length = 100)
    private String type;

    @Column(name = "version", length = 50)
    private String version;

    @Column(name = "color",length = 50)
    private String color;

    @Column(name = "quantity", columnDefinition = "INT DEFAULT 0")
    private int quantity;

    @Column(name = "status")
    private int status;

    @Column(name = "thumnailURL")
    private String thumnailURL;
}
