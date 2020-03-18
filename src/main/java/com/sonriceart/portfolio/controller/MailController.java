package com.sonriceart.portfolio.controller;

import com.sonriceart.portfolio.service.MailServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
    public String sendMail(Model model, @RequestParam("email") String email, @RequestParam("subject") String subject, @RequestParam("message") String message){
        String messageImpl = "You have receive message from : " + email + "\n" + "and the message is : " + message;
        mailService.sendSimpleMessage("phanhaingan@gmail.com", subject, messageImpl);
        model.addAttribute("flash","You have successfully send the message");
        return "contact";
    }
}
