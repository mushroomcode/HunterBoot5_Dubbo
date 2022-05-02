package com.services.ServiceEntities;

import com.pojo.dto.CalRelEntity;
import com.services.CalFredRelQueryServiceImpl;
import java.util.ArrayList;
import java.util.List;

public class CalFredRelQueryServiceEntity implements CalFredRelQueryServiceImpl {

    @Override
    public List<CalRelEntity> queryFredRelQuery(String Id) {
        List<CalRelEntity> retList = new ArrayList<>();
        CalRelEntity calRelEntity = new CalRelEntity();
        calRelEntity.setNameId("NI202205011322000001");
        retList.add(calRelEntity);
        return retList;
    }
}
