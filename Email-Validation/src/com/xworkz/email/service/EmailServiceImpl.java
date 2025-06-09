package com.xworkz.email.service;

import com.xworkz.email.dto.EmailDto;

public class EmailServiceImpl implements EmailService{
    @Override
    public boolean validate(EmailDto emailDto) throws InterruptedException {
        if(emailDto == null){
            throw new NullPointerException("EmailDto is null");
        }
        return false;
    }
}
