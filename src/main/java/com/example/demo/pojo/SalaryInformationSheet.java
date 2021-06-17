package com.example.demo.pojo;

import java.util.Date;

public class SalaryInformationSheet {
    private Integer serialNumber;
    private EmployeeInformationSheet employeeInformationSheet;
    private Date months;
    private Double grossSalary;
    private Double takeHomePay;

    public SalaryInformationSheet() {
    }

    public SalaryInformationSheet(Integer serialNumber, EmployeeInformationSheet employeeInformationSheet, Date months, Double grossSalary, Double takeHomePay) {
        this.serialNumber = serialNumber;
        this.employeeInformationSheet = employeeInformationSheet;
        this.months = months;
        this.grossSalary = grossSalary;
        this.takeHomePay = takeHomePay;
    }

    public Integer getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(Integer serialNumber) {
        this.serialNumber = serialNumber;
    }

    public EmployeeInformationSheet getEmployeeInformationSheet() {
        return employeeInformationSheet;
    }

    public void setEmployeeInformationSheet(EmployeeInformationSheet employeeInformationSheet) {
        this.employeeInformationSheet = employeeInformationSheet;
    }

    public Date getMonths() {
        return months;
    }

    public void setMonths(Date months) {
        this.months = months;
    }

    public Double getGrossSalary() {
        return grossSalary;
    }

    public void setGrossSalary(Double grossSalary) {
        this.grossSalary = grossSalary;
    }

    public Double getTakeHomePay() {
        return takeHomePay;
    }

    public void setTakeHomePay(Double takeHomePay) {
        this.takeHomePay = takeHomePay;
    }

    @Override
    public String toString() {
        return "SalaryInformationSheet{" +
                "serialNumber=" + serialNumber +
                ", employeeInformationSheet=" + employeeInformationSheet +
                ", months=" + months +
                ", grossSalary=" + grossSalary +
                ", takeHomePay=" + takeHomePay +
                '}';
    }
}
