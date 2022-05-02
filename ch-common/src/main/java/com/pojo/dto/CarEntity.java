package com.pojo.dto;

import java.io.Serializable;

/**
 *  车的实体类
 */
public class CarEntity implements Serializable {

    private String carId;

    private String carName;

    public void setCarId(String carId) {
        this.carId = carId;
    }

    public String getCarId() {
        return carId;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }
}
