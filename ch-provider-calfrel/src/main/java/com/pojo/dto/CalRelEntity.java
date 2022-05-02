package com.pojo.dto;

import com.pojo.CommonPojo;

public class CalRelEntity implements CommonPojo {

    private String nameId;

    private String male;

    private String female;

    public String getNameId() {
        return nameId;
    }

    public String getFemale() {
        return female;
    }

    public void setNameId(String nameId) {
        this.nameId = nameId;
    }

    public String getMale() {
        return male;
    }

    public void setMale(String male) {
        this.male = male;
    }

    public void setFemale(String female) {
        this.female = female;
    }
}
