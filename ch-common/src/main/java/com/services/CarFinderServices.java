package com.services;

import com.pojo.dto.CarEntity;

/**\
 *  Dubbo 的stub
 */
//@Generated(value = "by Dubbo generator", comments = "Source: DemoService.proto")
public interface CarFinderServices  {

    public CarEntity beCallToFinderCarById(String carId);

}
