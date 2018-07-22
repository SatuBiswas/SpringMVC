package com.satu.model;

import java.util.ArrayList;
import java.util.Date;

public class Employee {

    private String name;
    private String address;
    private Long empMob;
    private Date empDate;
    private ArrayList<String> skills;
    private Department department;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getEmpMob() {
        return empMob;
    }

    public void setEmpMob(Long empMob) {
        this.empMob = empMob;
    }

    public Date getEmpDate() {
        return empDate;
    }

    public void setEmpDate(Date empDate) {
        this.empDate = empDate;
    }

    public ArrayList<String> getSkills() {
        return skills;
    }

    public void setSkills(ArrayList<String> skills) {
        this.skills = skills;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }    
}
