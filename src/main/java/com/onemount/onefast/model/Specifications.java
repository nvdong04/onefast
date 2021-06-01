package com.onemount.onefast.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_specifications")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Specifications {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(cascade = CascadeType.MERGE, orphanRemoval = true)
    @JoinColumn(name = "car_id")
    private Car car;

    @Column(name = "weight")
    private float weight;

    @Column(name = "size", length = 100)
    private String size;

    @Column(name = "fuel_tank_capacity", length = 30) // dung tích nhiên liệu eg: 85L
    private String fuelTankCapacity;

    @Column(name = "engine", length = 30) // động cơ eg: 2.0L, 3.0L. 
    private String Engine;

    @Column(name = "maximum_power", length = 30) //công suất tối đa eg: 250HP
    private String maximumPower;

    @Column(name = "maximum_torque",length = 30) //Mô-men soắn cực đại eg:350Nm
    private String maximumTorque;

    @Column(name = "automatic_transmission") // Hộp số tự động
    private String automaticTransmission;
}
