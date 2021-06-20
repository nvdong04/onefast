package com.onemount.onefast.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;


@Entity
@Table(name = "tb_car")
public class Car implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "car")
    private List<ShowroomCar> showroomCars;

    @OneToOne(cascade = CascadeType.MERGE, orphanRemoval = true)
    @JoinColumn(name = "specifications_id")
    private Specifications specifications;

    @JsonManagedReference
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true,fetch = FetchType.LAZY)
    @JoinColumn(name = "car_id")
    private List<CarColor> carColors;

    @Column(name = "name", nullable = false, length = 100)
    private String name;

    @Column(name = "seat_number")
    private int seatNumber;

    @Column(name = "year_of_manufacture")
    private int yearOfManufacture;

    @Column(name = "type", length = 100)
    private String type;

    @Column(name = "version", length = 50)
    private String version;

    @Column(name = "price")
    private float price;

    @Column(name = "status")
    private int status;

    @Column(name = "description", columnDefinition = "TEXT")
    private String description;

    public Car() {}

    public Car(Long id, List<ShowroomCar> showroomCars, Specifications specifications, List<CarColor> carColors,
            String name, int seatNumber, int yearOfManufacture, String type, String version, float price, int status,
            String description) {
        this.id = id;
        this.showroomCars = showroomCars;
        this.specifications = specifications;
        this.carColors = carColors;
        this.name = name;
        this.seatNumber = seatNumber;
        this.yearOfManufacture = yearOfManufacture;
        this.type = type;
        this.version = version;
        this.price = price;
        this.status = status;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<ShowroomCar> getShowroomCars() {
        return showroomCars;
    }

    public void setShowroomCars(List<ShowroomCar> showroomCars) {
        this.showroomCars = showroomCars;
    }

    public Specifications getSpecifications() {
        return specifications;
    }

    public void setSpecifications(Specifications specifications) {
        this.specifications = specifications;
    }

    public List<CarColor> getCarColors() {
        return carColors;
    }

    public void setCarColors(List<CarColor> carColors) {
        this.carColors = carColors;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    

    
    
}
