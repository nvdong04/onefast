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

    public OrderDTO() {
    }

    public OrderDTO(Long id, Long userId, Car car, CarColor carColor, float discount, float totalPrice, String paymentMethod, float deposit, Date createdAt, Date modifiedAt, int status) {
        this.id = id;
        this.userId = userId;
        this.car = car;
        this.carColor = carColor;
        this.discount = discount;
        this.totalPrice = totalPrice;
        this.paymentMethod = paymentMethod;
        this.deposit = deposit;
        this.createdAt = createdAt;
        this.modifiedAt = modifiedAt;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public CarColor getCarColor() {
        return carColor;
    }

    public void setCarColor(CarColor carColor) {
        this.carColor = carColor;
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public float getDeposit() {
        return deposit;
    }

    public void setDeposit(float deposit) {
        this.deposit = deposit;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getModifiedAt() {
        return modifiedAt;
    }

    public void setModifiedAt(Date modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
