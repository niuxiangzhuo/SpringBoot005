package com.example.demo.mapper;

import com.example.demo.pojo.EmployeeInformationSheet;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EmployeeInformationSheetMapper {
    EmployeeInformationSheet selectEmployeeInformationSheet(String accountId);
    List<EmployeeInformationSheet> selectEmployeeInformationSheet1(String contactPhoneNumber);
    List<EmployeeInformationSheet> selectEmployeeInformationSheets();
    Integer selectCountEmployeeInformationSheet();
    Integer insertEmployeeInformationSheet(EmployeeInformationSheet employeeInformationSheet);
    Integer updateEmployeeInformationSheet(EmployeeInformationSheet employeeInformationSheet);
    Integer deleteEmployeeInformationSheet(String accountId);
}
