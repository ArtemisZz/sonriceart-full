package com.sonriceart.portfolio.controller;

import com.sonriceart.portfolio.service.MailServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String home(){
        return "home";
    }

    @RequestMapping(value = "/contact")
    public String contact(){
        return "contact";
    }


}
