package com.satu.controller;

import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    
    @RequestMapping(value = "/")
    public String index(){
        return "index";
    }
    
    @RequestMapping(value = ("welcome/{country}/{name}"))
    public String welcome(ModelMap map,@PathVariable Map<String,String> m){
        String name = m.get("country");
        String country = m.get("name");
        map.addAttribute("hello", "Hello, "+name+" you from "+country);
        return "display";
    }
}
