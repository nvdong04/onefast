package com.onemount.onefast.dto;

import java.util.List;

import com.onemount.onefast.model.CarColor;
import com.onemount.onefast.model.Specifications;

public class CarDTO {
    private Long id;

    //private List<ShowroomCar> showroomCars;

    private Specifications specifications;

    private List<CarColor> carColors;

    private String name;

    private int seatNumber;

    private int yearOfManufacture;

    private String type;

    private String version;

    private float price;

    private int status;

    private String description;
}
