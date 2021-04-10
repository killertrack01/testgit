package com.example.fptacademysystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DashboardController {
   
   @RequestMapping(value = "/", method = RequestMethod.GET)
    public String dashboard() {
        return "dashboard/dashboard";
    }

}
