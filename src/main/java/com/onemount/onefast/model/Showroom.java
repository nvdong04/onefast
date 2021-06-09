package com.onemount.onefast.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "tb_showroom")
public class Showroom implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", length = 100, nullable = false)
    private String name;

    @Column(name = "address")
    private String address;

    @Column(name = "hotline")
    private String hotline;

    @Column(name = "model")
    private int model;

    @Column(name = "city")
    private String city;

    @Column(name = "status")
    private int status;

    @OneToMany(mappedBy = "showroom")
    private List<ShowroomCar> showroomCars;

    public Showroom() {

    }

    public Showroom(Long id, String name, String address, String hotline, int model, String city, int status,
            List<ShowroomCar> showroomCars) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.hotline = hotline;
        this.model = model;
        this.city = city;
        this.status = status;
        this.showroomCars = showroomCars;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getHotline() {
        return hotline;
    }

    public void setHotline(String hotline) {
        this.hotline = hotline;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public List<ShowroomCar> getShowroomCars() {
        return showroomCars;
    }

    public void setShowroomCars(List<ShowroomCar> showroomCars) {
        this.showroomCars = showroomCars;
    }

    
}
