package com.async.async.model;

import java.io.Serializable;
import java.util.List;

public class EmployeeType implements Serializable {

    private static final long serialVersionUID = 3705958972000701963L;
    public List<String> typeEmployee;

    public List<String> getType(){
        return typeEmployee;
    }

    public void setType(List<Integer> type){
        this.typeEmployee = typeEmployee;
    }

    @Override
    public String toString() {
        return "EmployeeType [typeEmployee=" + typeEmployee + "]";
    }


}
