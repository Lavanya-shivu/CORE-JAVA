package com.xworkz.userprofile.service;

import com.xworkz.userprofile.dto.UserProfileDto;

public class UserProfileServiceImpl implements UserProfileService {
    @Override
    public String displayNickName(UserProfileDto userProfileDto) {
        if (userProfileDto == null) {
            throw new NullPointerException("UserProfileDto is null");
        }
        String userName = userProfileDto.getUserName();
        String nickName = userProfileDto.getNickName();
    return nickName;
    }
}
