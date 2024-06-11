package com.ingenieriaweb.springboot.app.spring_boot_web.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class indexController {
    @GetMapping({"/index","/","/home"})
    public String index() {
        return "index";
    }
    
}
