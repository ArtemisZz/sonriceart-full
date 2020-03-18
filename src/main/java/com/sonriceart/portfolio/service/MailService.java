package com.sonriceart.portfolio.service;

public interface MailService {
    public void sendSimpleMessage(String to, String subject, String text);
    //public void sendMessageWithAttachment(String to, String subject, String text, String pathToAttachment);
}
