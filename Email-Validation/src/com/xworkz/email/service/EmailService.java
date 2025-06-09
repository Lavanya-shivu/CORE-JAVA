package com.xworkz.email.service;

import com.xworkz.email.dto.EmailDto;

public interface EmailService {
    boolean validate(EmailDto emailDto) throws InterruptedException;
}
