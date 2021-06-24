package com.onemount.onefast.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;


@Entity
@Table(name = "tb_order")
public class Order implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_id")
    private Long userId;

    @OneToOne(cascade = CascadeType.MERGE, orphanRemoval = true)
    @JoinColumn(name = "car_id")
    private Car car;

    @Column(name = "car_color_id")
    private Long carColorId;

    @Column(name = "discount")
    private float discount;

    @Transient
    private float totalPrice;

    @Column(name = "payment_method", length = 100)  // Trả thẳng, trả góp
    private String paymentMethod;

    @Transient
    private float deposit;

    @Column(name = "created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;

    @Column(name = "modified_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedAt;

    @Column(name = "status")
    @Enumerated(EnumType.ORDINAL)
    private OrderType status;

    public Order() {

    }

    public Order(Long id, Long userId, Car car, Long carColorId, float discount, float totalPrice, String paymentMethod, float deposit, Date createdAt, Date modifiedAt, OrderType status) {
        this.id = id;
        this.userId = userId;
        this.car = car;
        this.carColorId = carColorId;
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

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    public float getTotalPrice() {
        return car.getPrice() - car.getPrice() * (getDiscount()/ 100);
    }

    public void setTotalPrice() {
        this.totalPrice = car.getPrice() - car.getPrice() * (this.discount/ car.getPrice());
    }

    public Long getCarColorId() {
        return carColorId;
    }

    public void setCarColorId(Long carColorId) {
        this.carColorId = carColorId;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public float getDeposit() {
        return (float) (getTotalPrice() * 0.2);
    }

    public void setDeposit() {
        this.deposit = (float) (getTotalPrice() * 0.2);
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

    public OrderType getStatus() {
        return status;
    }

    public void setStatus(OrderType status) {
        this.status = status;
    }
}
