package com.sonriceart.portfolio.controller;

import com.sonriceart.portfolio.service.MailServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {
    @RequestMapping(value = {"","/"})
    public String home(){
        return "home";
    }

    @RequestMapping(value = "/contact")
    public String contact(){
        return "contact";
    }


}
