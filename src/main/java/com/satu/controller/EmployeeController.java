package com.satu.controller;

import com.satu.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EmployeeController {
    
    @InitBinder
    public void myInitBinder(WebDataBinder binder){
        binder.setDisallowedFields(new String[]{"empMob"});
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String newEmployee() {
        return "newEmployee";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addEmp(ModelMap map, @ModelAttribute("employee") Employee employee, BindingResult result) {
        if (result.hasErrors()) {
            return "newEmployee";
        }
        return "displayEmployee";
    }
}
