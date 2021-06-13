package com.onemount.onefast.dto;

import com.onemount.onefast.model.Car;

import java.util.Date;

public class OrderDTO {

    private Long userId;

    private Long carId;

    private float discount;

    private String paymentMethod;

    private int status;

    public OrderDTO() {
    }

    public OrderDTO(Long userId, Long carId, float discount, String paymentMethod, int status) {
        this.userId = userId;
        this.carId = carId;
        this.discount = discount;
        this.paymentMethod = paymentMethod;
        this.status = status;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getCarId() {
        return carId;
    }

    public void setCarId(Long carId) {
        this.carId = carId;
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
