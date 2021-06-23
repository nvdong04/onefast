package com.onemount.onefast.dto.request;

public class OrderRequest {
    private Long userId;

    private Long carId;

    private Long carColorId;

    private float discount;

    private String paymentMethod;

    public OrderRequest(Long userId, Long carId, Long carColorId, float discount, String paymentMethod) {
        this.userId = userId;
        this.carId = carId;
        this.carColorId = carColorId;
        this.discount = discount;
        this.paymentMethod = paymentMethod;
    }

    public OrderRequest() {
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

    public Long getCarColorId() {
        return carColorId;
    }

    public void setCarColorId(Long carColorId) {
        this.carColorId = carColorId;
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
