package com.onemount.onefast.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_booking_drive_test")
public class BookingDriveTest implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "fullname", length = 100, nullable = false)
    private String fullname;

    @Column(name = "phone", length = 20)
    private String phone;

    @Column(name = "email", length = 100)
    private String email;

    @OneToOne(cascade = CascadeType.MERGE, orphanRemoval = true)
    @JoinColumn(name = "car_id")
    private Car car;

    @OneToOne(cascade = CascadeType.MERGE, orphanRemoval = true)
    @JoinColumn(name = "showroom_id")
    private Showroom showroom;

    @Column(name = "drive_date")
    private String driveDate;

    @Column(name = "status")
    private int status;


    public BookingDriveTest() {
        
    }

    


    public BookingDriveTest(Long id, String fullname, String phone, String email, Car car, Showroom showroom,
            String driveDate, int status) {
        this.id = id;
        this.fullname = fullname;
        this.phone = phone;
        this.email = email;
        this.car = car;
        this.showroom = showroom;
        this.driveDate = driveDate;
        this.status = status;
    }




    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public String getFullname() {
        return fullname;
    }


    public void setFullname(String fullname) {
        this.fullname = fullname;
    }


    public String getPhone() {
        return phone;
    }


    public void setPhone(String phone) {
        this.phone = phone;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public Car getCar() {
        return car;
    }


    public void setCar(Car car) {
        this.car = car;
    }


    public Showroom getShowroom() {
        return showroom;
    }


    public void setShowroom(Showroom showroom) {
        this.showroom = showroom;
    }


    public String getDriveDate() {
        return driveDate;
    }


    public void setDriveDate(String driveDate) {
        this.driveDate = driveDate;
    }


    public int getStatus() {
        return status;
    }


    public void setStatus(int status) {
        this.status = status;
    }

    
    
    
}
