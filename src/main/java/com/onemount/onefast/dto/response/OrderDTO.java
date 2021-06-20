package com.onemount.onefast.dto.response;

import com.onemount.onefast.model.Car;
import com.onemount.onefast.model.CarColor;

import javax.persistence.*;
import java.util.Date;

public class OrderDTO {

    private Long id;
    private Long userId;
    private Car car;
    private CarColor carColor;
    private float discount;
    private float totalPrice;
    private String paymentMethod;
    private float deposit;
    private Date createdAt;
    private Date modifiedAt;
    private int status;

}
