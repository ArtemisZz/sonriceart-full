package com.sonriceart.portfolio.controller;

import com.sonriceart.portfolio.service.MailServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    /**
     * Direct to the home page
     * @return name of the home page in thymeleaf
     */
    @GetMapping("/")
    public String home(){
        return "home";
    }

    /**
     * Go to contact form
     * @return name of the contact page in thymeleaf
     */
    @RequestMapping(value = "/contact")
    public String contact(){
        return "contact";
    }


}
