package com.sonriceart.portfolio.controller;

import com.sonriceart.portfolio.service.MailServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/mail")
public class MailController {
    public MailServiceImpl mailService;

    @Autowired
    public MailController(MailServiceImpl mailService) {
        this.mailService = mailService;
    }

    @PostMapping(value = "")
    public String sendMail(@RequestParam("email") String email, @RequestParam("subject") String subject, @RequestParam("message") String message){
        mailService.sendSimpleMessage("phanhaingan@gmail.com", subject, message);
        return "contact";
    }
}
