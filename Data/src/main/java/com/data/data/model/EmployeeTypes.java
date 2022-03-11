package com.data.data.model;

import java.util.List;

public class EmployeeTypes {
    private static final long serialVersionUID = -1773599508061743960L;
    public List<EmployeeType> employeeTypeList;

    public List<EmployeeType> EmployeeTypeList() {
        return employeeTypeList;
    }

    public void setEmployeeTypeListList(List<EmployeeType> employeeTypeList) {
        this.employeeTypeList = employeeTypeList;
    }

    @Override
    public String toString() {
        return "EmployeeTypes [employeeTypeList=" + employeeTypeList + "]";
    }
}
