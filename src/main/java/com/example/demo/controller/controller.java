package com.example.demo.controller;

import com.alibaba.fastjson.JSON;
import com.example.demo.pojo.EmployeeInformationSheet;
import com.example.demo.pojo.PositionInformationSheet;
import com.example.demo.service.EmployeeInformationSheetService;
import com.example.demo.service.PositionInformationSheetService;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

@Controller
@RequestMapping("/")
public class controller {

    @Resource
    private EmployeeInformationSheetService employeeInformationSheetService;
    @Resource
    private PositionInformationSheetService positionInformationSheetService;


    @ResponseBody
    @RequestMapping(value = "selectEmpl11")
    public String selectEmpl11(Integer page,Integer limit){
        Map<String,Object> map = new HashMap<>();
        PageHelper.startPage(page, limit);
        List<EmployeeInformationSheet> list = employeeInformationSheetService.selectEmployeeInformationSheets();
        Integer count = positionInformationSheetService.selectCountPositionInformationSheet();
        map.put("code",0);
        map.put("msg","");
        map.put("count",count);//总个数
        map.put("data",list);//List数组,查询的结果
        String json= JSON.toJSONString(map);
        System.out.println(json);
        return json;
    }

    @RequestMapping("Empl")
    public String Empl(){
        return "Empl";
    }

    @ResponseBody
    @RequestMapping(value = "selectPosit")
    public String selectPosit(Integer page,Integer limit){
        Map<String,Object> map1 = new HashMap<>();
        PageHelper.startPage(page, limit);
        List<PositionInformationSheet> list = positionInformationSheetService.selectPositionInformationSheets();
        Integer count = positionInformationSheetService.selectCountPositionInformationSheet();
        map1.put("code",0);
        map1.put("msg","");
        map1.put("count",count);//总个数
        map1.put("data",list);//List数组,查询的结果
        String json= JSON.toJSONString(map1);
        return json;
    }

    @ResponseBody
    @RequestMapping("updatePos")
    public String updatePos(PositionInformationSheet positionInformationSheet){
        return JSON.toJSONString(positionInformationSheetService.updatePositionInformationSheet(positionInformationSheet));
    }

    @ResponseBody
    @RequestMapping("updatePosit1")
    public String updatePosit1(HttpServletRequest request){
        PositionInformationSheet positionInformationSheet = (PositionInformationSheet)request.getSession().getAttribute("positionInformationSheet");
        return JSON.toJSONString(positionInformationSheet);
    }

    @RequestMapping("updatePosit")
    public String updatePosit(Integer jobsNumbers,HttpServletRequest request){
        PositionInformationSheet positionInformationSheet = positionInformationSheetService.selectPositionInformationSheet(jobsNumbers);
        request.getSession().setAttribute("positionInformationSheet",positionInformationSheet);
        return "updatePosit";
    }

    @RequestMapping("PositionInformationSheet")
    public String PositionInformationSheet(){
        return "PositionInformationSheet";
    }

    @RequestMapping(value = "ViewPersonalInformation")
    public String ViewPersonalInformation(){
        return "ViewPersonalInformation";
    }

    @RequestMapping(value = "")
    public String login(){
        return "login";
    }

    @RequestMapping(value = "login")
    public String login1(){
        return "login";
    }

    @RequestMapping(value = "index")
    public String index(){
        return "index";
    }

    @ResponseBody
    @RequestMapping(value = "selectEmpl")
    public String selectEmpl(HttpServletRequest request){
        EmployeeInformationSheet employeeInformationSheet = (EmployeeInformationSheet)request.getSession().getAttribute("Empl");
        return JSON.toJSONString(employeeInformationSheet);
    }

    @ResponseBody
    @RequestMapping(value = "UpdatePasswords")
    public String UpdatePasswords(String passwords, HttpServletRequest request){
        EmployeeInformationSheet employeeInformationSheet = (EmployeeInformationSheet)request.getSession().getAttribute("Empl");
        employeeInformationSheet.setPasswords(passwords);
        String patt = "^[0-9]{9}$";
        if(Pattern.matches(patt,passwords)){
            Integer res = employeeInformationSheetService.updateEmployeeInformationSheet1(employeeInformationSheet);
            if(res>0){
                return "1";
            }else{
                return "-2";
            }
        }else{
            return "-1";
        }
    }

    @ResponseBody
    @RequestMapping(value = "loginyes")
    public String loginyes(String accountId, String passwords, HttpServletRequest request){
        EmployeeInformationSheet employeeInformationSheet = employeeInformationSheetService.selectEmployeeInformationSheet(accountId);
        if(employeeInformationSheet!=null){
            if(employeeInformationSheet.getPasswords().equals(passwords)){
                if(employeeInformationSheet.getPositionInformationSheet().getJobsNumbers()==4){
                    request.getSession().setAttribute("accountId",accountId);
                    request.getSession().setAttribute("Empl",employeeInformationSheet);
                    return "1";
                }else{
                    return "-1";
                }
            }else{
                return "-2";
            }
        }else {
            return "-3";
        }
    }
}
