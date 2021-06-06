package com.onemount.onefast.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_specifications")
public class Specifications implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "weight")
    private float weight;

    @Column(name = "size", length = 100)
    private String size;

    @Column(name = "fuel_tank_capacity", length = 30) // dung tích nhiên liệu eg: 85L
    private String fuelTankCapacity;

    @Column(name = "engine", length = 30) // động cơ eg: 2.0L, 3.0L. 
    private String engine;

    @Column(name = "maximum_power", length = 30) //công suất tối đa eg: 250HP
    private String maximumPower;

    @Column(name = "maximum_torque",length = 30) //Mô-men soắn cực đại eg:350Nm
    private String maximumTorque;

    @Column(name = "automatic_transmission") // Hộp số tự động
    private String automaticTransmission;

    public Specifications() {
        
    }

    public Specifications(float weight, String size, String fuelTankCapacity, String engine,
            String maximumPower, String maximumTorque, String automaticTransmission) {
        this.weight = weight;
        this.size = size;
        this.fuelTankCapacity = fuelTankCapacity;
        this.engine = engine;
        this.maximumPower = maximumPower;
        this.maximumTorque = maximumTorque;
        this.automaticTransmission = automaticTransmission;
    }

    public Specifications(Long id,float weight, String size, String fuelTankCapacity, String engine,
            String maximumPower, String maximumTorque, String automaticTransmission) {
        this.id = id;
        this.weight = weight;
        this.size = size;
        this.fuelTankCapacity = fuelTankCapacity;
        this.engine = engine;
        this.maximumPower = maximumPower;
        this.maximumTorque = maximumTorque;
        this.automaticTransmission = automaticTransmission;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getFuelTankCapacity() {
        return fuelTankCapacity;
    }

    public void setFuelTankCapacity(String fuelTankCapacity) {
        this.fuelTankCapacity = fuelTankCapacity;
    }

    public String getEngine() {
        return this.engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getMaximumPower() {
        return maximumPower;
    }

    public void setMaximumPower(String maximumPower) {
        this.maximumPower = maximumPower;
    }

    public String getMaximumTorque() {
        return maximumTorque;
    }

    public void setMaximumTorque(String maximumTorque) {
        this.maximumTorque = maximumTorque;
    }

    public String getAutomaticTransmission() {
        return automaticTransmission;
    }

    public void setAutomaticTransmission(String automaticTransmission) {
        this.automaticTransmission = automaticTransmission;
    }

    
    
}
