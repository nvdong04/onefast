package com.onemount.onefast.dto.request;

public class OrderRequest {
    //private Long userId;

    private Long carId;

    private String carColor;

    private float discount;

    private String paymentMethod;

    public OrderRequest(Long carId, String carColor, float discount, String paymentMethod) {
        this.carId = carId;
        this.carColor = carColor;
        this.discount = discount;
        this.paymentMethod = paymentMethod;
    }

    public Long getCarId() {
        return carId;
    }

    public void setCarId(Long carId) {
        this.carId = carId;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
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
}
