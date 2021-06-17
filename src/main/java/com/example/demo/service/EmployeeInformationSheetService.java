package com.example.demo.service;

import com.example.demo.pojo.EmployeeInformationSheet;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface EmployeeInformationSheetService {
    EmployeeInformationSheet selectEmployeeInformationSheet(String accountId);
    List<EmployeeInformationSheet> selectEmployeeInformationSheet1(String contactPhoneNumber);
    List<EmployeeInformationSheet> selectEmployeeInformationSheets();
    Integer selectCountEmployeeInformationSheet();
    Integer insertEmployeeInformationSheet(EmployeeInformationSheet employeeInformationSheet);
    Integer updateEmployeeInformationSheet(EmployeeInformationSheet employeeInformationSheet);
    Integer updateEmployeeInformationSheet1(EmployeeInformationSheet employeeInformationSheet);
    Integer deleteEmployeeInformationSheet(String accountId);
}
