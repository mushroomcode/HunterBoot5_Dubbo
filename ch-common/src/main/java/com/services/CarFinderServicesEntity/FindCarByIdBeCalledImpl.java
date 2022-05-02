package com.services.CarFinderServicesEntity;

import com.pojo.dto.CarEntity;
import com.services.CarFinderServices;

public class FindCarByIdBeCalledImpl implements CarFinderServices {
    @Override
    public CarEntity beCallToFinderCarById(String carId) {
        CarEntity carEntity = new CarEntity();
        carEntity.setCarName("Honda civic!");
        return carEntity;
    }
}
