package com.example.demo.service.impl;

import com.example.demo.mapper.EmployeeInformationSheetMapper;
import com.example.demo.pojo.EmployeeInformationSheet;
import com.example.demo.service.EmployeeInformationSheetService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class EmployeeInformationSheetServiceImpl implements EmployeeInformationSheetService {

    @Resource
    private EmployeeInformationSheetMapper employeeInformationSheetMapper;

    @Override
    public EmployeeInformationSheet selectEmployeeInformationSheet(String accountId) {
        return employeeInformationSheetMapper.selectEmployeeInformationSheet(accountId);
    }

    @Override
    public List<EmployeeInformationSheet> selectEmployeeInformationSheet1(String contactPhoneNumber) {
        return employeeInformationSheetMapper.selectEmployeeInformationSheet1(contactPhoneNumber);
    }

    @Override
    public List<EmployeeInformationSheet> selectEmployeeInformationSheets() {
        return employeeInformationSheetMapper.selectEmployeeInformationSheets();
    }

    @Override
    public Integer selectCountEmployeeInformationSheet() {
        return employeeInformationSheetMapper.selectCountEmployeeInformationSheet();
    }

    @Override
    public Integer insertEmployeeInformationSheet(EmployeeInformationSheet employeeInformationSheet) {
        EmployeeInformationSheet employeeInformationSheet1 = this.selectEmployeeInformationSheet(employeeInformationSheet.getAccountId());
        List<EmployeeInformationSheet> employeeInformationSheet2 = this.selectEmployeeInformationSheet1(employeeInformationSheet.getContactPhoneNumber());
        if(employeeInformationSheet1!=null){
            return -1;//存在
        }else{
            if(employeeInformationSheet2.size()!=0){
                return -2;//存在
            }else {
                return employeeInformationSheetMapper.insertEmployeeInformationSheet(employeeInformationSheet);
            }
        }
    }

    @Override
    public Integer updateEmployeeInformationSheet(EmployeeInformationSheet employeeInformationSheet) {
        EmployeeInformationSheet employeeInformationSheet1 = this.selectEmployeeInformationSheet(employeeInformationSheet.getAccountId());
        List<EmployeeInformationSheet> employeeInformationSheet2 = this.selectEmployeeInformationSheet1(employeeInformationSheet.getContactPhoneNumber());
        if(employeeInformationSheet1!=null){
            if(employeeInformationSheet2.size()==0||employeeInformationSheet2.size()==1){
                return employeeInformationSheetMapper.updateEmployeeInformationSheet(employeeInformationSheet);
            }else{
                return -2;
            }
        }else {
            return -1;//不存在
        }
    }

    @Override
    public Integer updateEmployeeInformationSheet1(EmployeeInformationSheet employeeInformationSheet) {
        return employeeInformationSheetMapper.updateEmployeeInformationSheet(employeeInformationSheet);
    }

    @Override
    public Integer deleteEmployeeInformationSheet(String accountId) {
        EmployeeInformationSheet employeeInformationSheet1 = this.selectEmployeeInformationSheet(accountId);
        if(employeeInformationSheet1!=null){
            return employeeInformationSheetMapper.deleteEmployeeInformationSheet(accountId);
        }else {
            return -1;//不存在
        }
    }
}
