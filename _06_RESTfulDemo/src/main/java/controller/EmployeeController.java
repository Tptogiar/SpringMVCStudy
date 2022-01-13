package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import pojo.po.Employee;

/**
 * @author Tptogiar
 * @description
 * @date 2022/1/13 - 11:36
 */

@Controller
public class EmployeeController {


    @GetMapping("/employee")
    public String employees(Model model){
        model.addAttribute("employees","allEmployees");
        return "employee";
    }

    @GetMapping("/employee/{id}")
    public String employee(@PathVariable("id")Integer id,Model model){
        model.addAttribute("employee",id);
        return "employee";
    }


    @DeleteMapping("/employee/{id}")
    public String deleteEmploy(@PathVariable("id")Integer id,Model model){
        model.addAttribute("deleteEmploy",id);
        return "employee";
    }

    @PostMapping("/employee")
    public String addEmployee(Employee employee){
        System.out.println("add");
        System.out.println(employee);
        return "employee";
    }


    @PutMapping("/employee")
    public String updataEmployee(Employee employee){
        System.out.println("update");
        System.out.println(employee);
        return "employee";
    }


}



