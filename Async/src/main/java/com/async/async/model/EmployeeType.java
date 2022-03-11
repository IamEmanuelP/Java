package com.async.async.model;

import java.io.Serializable;
import java.util.List;

public class EmployeeType implements Serializable {

    private static final long serialVersionUID = -1773599508061743941L;

    public String departamento;

    public String getDepartamento(){
        return departamento;
    }
    public void setDepartamento(String departamento){
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "EmployeeDept [departamento=" + departamento + "]";
    }


}
