package com.codingshuttle.springbootwebtutorial.springbootwebtutorial.dtos;

import java.time.LocalDate;

public class EmployeeDTO {
    private String employeeId;
    private String employeeName;
    private String email;
    private int age;
    private LocalDate dateOfJoining;
    private boolean isActive;

    public EmployeeDTO() {
    }

    public EmployeeDTO(String employeeId, String employeeName, String email, int age, LocalDate dateOfJoining, boolean isActive) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.email = email;
        this.age = age;
        this.dateOfJoining = dateOfJoining;
        this.isActive = isActive;
    }

    public String getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getDateOfJoining() {
        return dateOfJoining;
    }

    public void setDateOfJoining(LocalDate dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
