package com.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.pojo.dto.CarEntity;
import com.services.CarFinderServices;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *  此 Controller 使用RPC调用 Dubbo 的Service 服务
 * @Reference 是Dubbo的注解，用于Scan 定义的服务方提供的接口信息
 */
@Controller
public class WhichRelQueryController {

    @Reference
    CarFinderServices calFredRelQueryService;

    @GetMapping(value = "/hello")
    @ResponseBody
    public CarEntity hello() {
        return calFredRelQueryService.beCallToFinderCarById("112");
    }

}
