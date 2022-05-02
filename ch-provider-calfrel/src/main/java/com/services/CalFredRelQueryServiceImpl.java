package com.services;

import com.alibaba.dubbo.config.annotation.Service;
import com.pojo.dto.CalRelEntity;
import org.springframework.stereotype.Component;

import java.util.List;

// Service 为 dubbo 的 service
@Service
@Component
public interface CalFredRelQueryServiceImpl  {

    List<CalRelEntity> queryFredRelQuery(String Id);

}
