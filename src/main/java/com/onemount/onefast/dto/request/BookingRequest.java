package com.onemount.onefast.dto.request;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.Data;

import java.io.Serializable;

@Data
public class BookingRequest implements Serializable {
    // private Long id;

    @NotEmpty(message = "{constraints.not-empty}")
    @Size(min = 4, max = 100, message = "{constraints.min-4-max-100}")
    private String fullname;

    @NotEmpty(message = "{constraints.not-empty}")
    private String phone;

    @NotEmpty(message = "{constraints.not-empty}")
    @Email(message = "{constraints.email}")
    private String email;

    @NotEmpty(message = "{constraints.not-empty}")
    private String driveDate;

    @NotEmpty(message = "{constraints.not-empty}")
    private Long showroomId;

    @NotEmpty(message = "{constraints.not-empty}")
    private Long carId;

    //private int status;


    public BookingRequest(@NotEmpty(message = "{constraints.not-empty}") @Size(min = 4, max = 100, message = "{constraints.min-4-max-100}") String fullname, @NotEmpty(message = "{constraints.not-empty}") String phone, @NotEmpty(message = "{constraints.not-empty}") @Email(message = "{constraints.email}") String email, @NotEmpty(message = "{constraints.not-empty}") String driveDate, @NotEmpty(message = "{constraints.not-empty}") Long showroomId, @NotEmpty(message = "{constraints.not-empty}") Long carId) {
        this.fullname = fullname;
        this.phone = phone;
        this.email = email;
        this.driveDate = driveDate;
        this.showroomId = showroomId;
        this.carId = carId;
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

    public String getDriveDate() {
        return driveDate;
    }

    public void setDriveDate(String driveDate) {
        this.driveDate = driveDate;
    }

    public Long getShowroomId() {
        return showroomId;
    }

    public void setShowroomId(Long showroomId) {
        this.showroomId = showroomId;
    }

    public Long getCarId() {
        return carId;
    }

    public void setCarId(Long carId) {
        this.carId = carId;
    }
}
