package com.services.ServiceEntities;

import com.alibaba.dubbo.config.annotation.Service;
import com.pojo.dto.CarEntity;
import com.services.CarFinderServices;

@Service
public class CalFredCarFinderServices implements CarFinderServices {

    @Override
    public CarEntity beCallToFinderCarById(String carId) {
        CarEntity carEntity = new CarEntity();
        carEntity.setCarName("carName");
        carEntity.setCarId("ID20220922091100");
        return carEntity;
    }

}
