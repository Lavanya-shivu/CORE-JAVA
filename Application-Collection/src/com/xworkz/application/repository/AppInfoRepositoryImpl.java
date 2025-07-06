package com.xworkz.application.repository;

import com.xworkz.application.dto.AppInfoDto;
import com.xworkz.application.dto.AppType;
import com.xworkz.application.dto.AppVersion;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class AppInfoRepositoryImpl implements AppInfoRepository{
    @Override
    public Collection<AppInfoDto> findAll() {

        AppInfoDto appInfoDto1 = new AppInfoDto(1,"Zoom", AppVersion.V1_0, LocalDate.of(2023,01,01), 41.5, AppType.GAME, true, 0.0);
        AppInfoDto appInfoDto2 = new AppInfoDto(2, "Slack", AppVersion.V2_0, LocalDate.of(2023,02,02), 43.0, AppType.EDUCATION, true, 0.0);
        AppInfoDto appInfoDto3 = new AppInfoDto(3, "Trello",AppVersion.V3_0, LocalDate.of(2023,03,03), 44.5,AppType.SOCIAL, true, 0.0);
        AppInfoDto appInfoDto4 = new AppInfoDto(4, "Spotify", AppVersion.V4_0, LocalDate.of(2023,04,04), 46.0, AppType.PRODUCTIVITY, false, 53.99);
        AppInfoDto appInfoDto5 = new AppInfoDto(5,"WhatsApp",AppVersion.V2_24_13,LocalDate.of(2010,05,03),55.4,AppType.SOCIAL,true,0.0);
        AppInfoDto appInfoDto6 = new AppInfoDto(6,"FaceBook",AppVersion.V2_24_10,LocalDate.of(2004,02,04),78.9,AppType.SOCIAL,true,0.0);
        AppInfoDto appInfoDto7 = new AppInfoDto(7,"Instagram",AppVersion.V2_24_9,LocalDate.of(2010,10,06),69.3,AppType.SOCIAL,true,0.0);
        AppInfoDto appInfoDto8 = new AppInfoDto(8,"Hotstar",AppVersion.V2_24_8,LocalDate.of(2015,02,11),84.7,AppType.ENTERTAINMENT,false,299.0);
        AppInfoDto appInfoDto9 = new AppInfoDto(9,"Netflix",AppVersion.V2_24_7,LocalDate.of(2007,01,15),92.5,AppType.ENTERTAINMENT,false,199.0);
        AppInfoDto appInfoDto10 = new AppInfoDto(10,"SnapChat",AppVersion.V2_24_6,LocalDate.of(2011,06,01),63.2,AppType.SOCIAL,true,0.0);
        AppInfoDto appInfoDto11 = new AppInfoDto(11,"Zee5",AppVersion.V2_24_5,LocalDate.of(2018,02,14),77.1,AppType.ENTERTAINMENT,false,149.0);
        AppInfoDto appInfoDto12 = new AppInfoDto(12,"Ajio",AppVersion.V2_24_4,LocalDate.of(2016,04,01),45.6,AppType.SHOPPING,true,0.0);
        AppInfoDto appInfoDto13 = new AppInfoDto(13,"Amazon", AppVersion.V2_24_3, LocalDate.of(2012,06,05), 80.3, AppType.SHOPPING, true, 0.0);
        AppInfoDto appInfoDto14 = new AppInfoDto(14, "Flipkart", AppVersion.V2_24_2, LocalDate.of(2013,06,01), 73.2, AppType.SHOPPING, true, 0.0);
        AppInfoDto appInfoDto15 = new AppInfoDto(15, "Nyntra",AppVersion.V2_24_12, LocalDate.of(2015,06,01), 51.9,AppType.SHOPPING, true, 0.0);
        AppInfoDto appInfoDto16 = new AppInfoDto(16, "Meesho", AppVersion.V2_24_10, LocalDate.of(2013,06,04), 65.7, AppType.SOCIAL, true, 0.0);
        AppInfoDto appInfoDto17 = new AppInfoDto(17,"Telegram",AppVersion.V2_24_13,LocalDate.of(2010,05,03),55.4,AppType.SOCIAL,true,0.0);
        AppInfoDto appInfoDto18 = new AppInfoDto(18,"YouTube",AppVersion.V2_24_8,LocalDate.of(2005,02,14),95.4,AppType.ENTERTAINMENT,true,0.0);
        AppInfoDto appInfoDto19 = new AppInfoDto(19, "Gaana", AppVersion.V2_24_7, LocalDate.of(2015, 5, 1), 60.4, AppType.ENTERTAINMENT, false, 99.0);
        AppInfoDto appInfoDto20 = new AppInfoDto(20, "JioCinema", AppVersion.V2_24_6, LocalDate.of(2016, 9, 5), 85.0, AppType.ENTERTAINMENT, true, 0.0);
        AppInfoDto appInfoDto21 = new AppInfoDto(21, "SonyLIV", AppVersion.V2_24_5, LocalDate.of(2013, 1, 1), 76.8, AppType.ENTERTAINMENT, false, 299.0);
        AppInfoDto appInfoDto22 = new AppInfoDto(22, "BigBasket", AppVersion.V2_24_4, LocalDate.of(2011, 12, 12), 49.6, AppType.SHOPPING, true, 0.0);
        AppInfoDto appInfoDto23 = new AppInfoDto(23, "Swiggy", AppVersion.V2_24_3, LocalDate.of(2014, 8, 1), 57.9, AppType.SHOPPING, true, 0.0);
        AppInfoDto appInfoDto24 = new AppInfoDto(24, "Zomato", AppVersion.V2_24_2, LocalDate.of(2014, 7, 15), 56.4, AppType.SHOPPING, true, 0.0);
        AppInfoDto appInfoDto25 = new AppInfoDto(25, "Ola", AppVersion.V2_24_1, LocalDate.of(2013, 3, 5), 59.8, AppType.SERVICE, true, 0.0);
        AppInfoDto appInfoDto26 = new AppInfoDto(26, "Uber", AppVersion.V2_24_1, LocalDate.of(2012, 10, 9), 60.2, AppType.SERVICE, true, 0.0);
        AppInfoDto appInfoDto27 = new AppInfoDto(27, "BookMyShow", AppVersion.V2_24_2, LocalDate.of(2007, 2, 10), 70.1, AppType.ENTERTAINMENT, true, 0.0);
        AppInfoDto appInfoDto28 = new AppInfoDto(28, "Paytm", AppVersion.V2_24_3, LocalDate.of(2010, 7, 28), 52.5, AppType.SERVICE, true, 0.0);
        AppInfoDto appInfoDto29 = new AppInfoDto(29, "PhonePe", AppVersion.V2_24_4, LocalDate.of(2016, 12, 1), 49.9, AppType.SERVICE, true, 0.0);
        AppInfoDto appInfoDto30 = new AppInfoDto(30, "Google Pay", AppVersion.V2_24_5, LocalDate.of(2017, 9, 18), 48.3, AppType.SERVICE, true, 0.0);
        AppInfoDto appInfoDto31 = new AppInfoDto(31, "CRED", AppVersion.V2_24_6, LocalDate.of(2018, 4, 1), 50.1, AppType.SERVICE, false, 49.0);
        AppInfoDto appInfoDto32 = new AppInfoDto(32, "Upstox", AppVersion.V2_24_7, LocalDate.of(2019, 6, 10), 46.7, AppType.SERVICE, true, 0.0);
        AppInfoDto appInfoDto33 = new AppInfoDto(33, "Groww", AppVersion.V2_24_8, LocalDate.of(2017, 5, 1), 47.2, AppType.SERVICE, true, 0.0);
        AppInfoDto appInfoDto34 = new AppInfoDto(34, "MoEngage", AppVersion.V2_24_9, LocalDate.of(2015, 3, 12), 41.5, AppType.SERVICE, false, 99.0);
        AppInfoDto appInfoDto35 = new AppInfoDto(35, "Slack", AppVersion.V2_24_10, LocalDate.of(2013, 8, 14), 66.1, AppType.WORK, true, 0.0);
        AppInfoDto appInfoDto36 = new AppInfoDto(36, "Microsoft Teams", AppVersion.V2_24_11, LocalDate.of(2017, 3, 14), 75.3, AppType.WORK, true, 0.0);
        AppInfoDto appInfoDto37 = new AppInfoDto(37, "Zoom", AppVersion.V2_24_12, LocalDate.of(2011, 9, 10), 70.6, AppType.WORK, true, 0.0);
        AppInfoDto appInfoDto38 = new AppInfoDto(38, "LinkedIn", AppVersion.V2_24_13, LocalDate.of(2003, 5, 5), 85.0, AppType.WORK, true, 0.0);
        AppInfoDto appInfoDto39 = new AppInfoDto(39, "Notion", AppVersion.V2_24_1, LocalDate.of(2016, 3, 2), 54.2, AppType.WORK, true, 0.0);
        AppInfoDto appInfoDto40 = new AppInfoDto(40, "Canva", AppVersion.V2_24_2, LocalDate.of(2013, 8, 1), 61.8, AppType.WORK, false, 499.0);
        AppInfoDto appInfoDto41 = new AppInfoDto(41, "Inshorts", AppVersion.V2_24_3, LocalDate.of(2015, 6, 1), 35.2, AppType.NEWS, true, 0.0);
        AppInfoDto appInfoDto42 = new AppInfoDto(42, "Dailyhunt", AppVersion.V2_24_4, LocalDate.of(2009, 10, 10), 38.7, AppType.NEWS, true, 0.0);
        AppInfoDto appInfoDto43 = new AppInfoDto(43, "Josh", AppVersion.V2_24_5, LocalDate.of(2020, 9, 15), 52.9, AppType.ENTERTAINMENT, true, 0.0);
        AppInfoDto appInfoDto44 = new AppInfoDto(44, "MX TakaTak", AppVersion.V2_24_4, LocalDate.of(2020, 8, 1), 60.0, AppType.ENTERTAINMENT, true, 0.0);
        AppInfoDto appInfoDto45 = new AppInfoDto(45, "ShareChat", AppVersion.V2_24_5, LocalDate.of(2015, 1, 10), 59.3, AppType.SOCIAL, true, 0.0);
        AppInfoDto appInfoDto46 = new AppInfoDto(46, "Kuku FM", AppVersion.V2_24_6, LocalDate.of(2018, 9, 5), 48.5, AppType.ENTERTAINMENT, false, 99.0);
        AppInfoDto appInfoDto47 = new AppInfoDto(47, "Relevel", AppVersion.V2_24_7, LocalDate.of(2021, 4, 18), 53.0, AppType.EDUCATION, true, 0.0);
        AppInfoDto appInfoDto48 = new AppInfoDto(48, "Unacademy", AppVersion.V2_24_8, LocalDate.of(2015, 7, 1), 58.9, AppType.EDUCATION, true, 0.0);
        AppInfoDto appInfoDto49 = new AppInfoDto(49, "BYJU'S", AppVersion.V2_24_9, LocalDate.of(2011, 8, 1), 85.7, AppType.EDUCATION, false, 299.0);
        AppInfoDto appInfoDto50 = new AppInfoDto(50, "Vedantu", AppVersion.V2_24_10, LocalDate.of(2014, 10, 15), 72.4, AppType.EDUCATION, true, 0.0);

        Collection<AppInfoDto>collection = new ArrayList<>();
        collection.add(appInfoDto2);
        collection.add(appInfoDto6);
        collection.add(appInfoDto3);
        collection.add(appInfoDto7);
        collection.add(appInfoDto1);
        collection.add(appInfoDto4);
        collection.add(appInfoDto5);
        collection.add(appInfoDto8);
        collection.add(appInfoDto9);
        collection.add(appInfoDto10);
        collection.add(appInfoDto12);
        collection.add(appInfoDto13);
        collection.add(appInfoDto14);
        collection.add(appInfoDto15);
        collection.add(appInfoDto16);
        collection.add(appInfoDto30);
        collection.add(appInfoDto17);
        collection.add(appInfoDto18);
        collection.add(appInfoDto19);
        collection.add(appInfoDto20);
        collection.add(appInfoDto21);
        collection.add(appInfoDto22);
        collection.add(appInfoDto23);
        collection.add(appInfoDto24);
        collection.add(appInfoDto25);
        collection.add(appInfoDto26);
        collection.add(appInfoDto27);
        collection.add(appInfoDto28);
        collection.add(appInfoDto29);
        collection.add(appInfoDto31);
        collection.add(appInfoDto32);
        collection.add(appInfoDto34);
        collection.add(appInfoDto35);
        collection.add(appInfoDto33);
        collection.add(appInfoDto34);
        collection.add(appInfoDto35);
        collection.add(appInfoDto36);
        collection.add(appInfoDto37);
        collection.add(appInfoDto38);
        collection.add(appInfoDto39);
        collection.add(appInfoDto40);
        collection.add(appInfoDto41);
        collection.add(appInfoDto42);
        collection.add(appInfoDto43);
        collection.add(appInfoDto44);
        collection.add(appInfoDto45);
        collection.add(appInfoDto46);
        collection.add(appInfoDto47);
        collection.add(appInfoDto48);
        collection.add(appInfoDto49);
        collection.add(appInfoDto50);


        return collection;
    }
}
