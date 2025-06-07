package com.xworkz.userprofile.runner;

import com.xworkz.userprofile.dto.UserProfileDto;
import com.xworkz.userprofile.service.UserProfileService;
import com.xworkz.userprofile.service.UserProfileServiceImpl;

import java.util.Scanner;

public class UserProfileRunner {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the User Name");
            String userName = scanner.next();

            System.out.println("Enter the Nick Name");
            String nickName = scanner.next();

            UserProfileDto userProfileDto = new UserProfileDto(userName, nickName);
            UserProfileService userProfileService = new UserProfileServiceImpl();

            String display = userProfileService.displayNickName(userProfileDto);
            System.out.println("Display:" + display);
        } catch (NullPointerException e) {
            System.out.println("Error: Nick Name must not be Null");
        } finally {
            System.out.println("Nick Name Displayed");
        }
    }

}