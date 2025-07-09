package com.xworkz.application.runner;

import com.xworkz.application.dto.AppInfoDto;
import com.xworkz.application.dto.AppType;
import com.xworkz.application.dto.AppVersion;
import com.xworkz.application.repository.AppInfoRepository;
import com.xworkz.application.repository.AppInfoRepositoryImpl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class ApplicationRunner {
    public static void main(String[] args) {
        AppInfoRepository appInfoRepository = new AppInfoRepositoryImpl();
        Collection<AppInfoDto> appInfoDtos =appInfoRepository.findAll();

        appInfoDtos.forEach(System.out::println);
        System.out.println("=================================================");
//Find all applications by type
        System.out.println("All applications By Type");
        appInfoDtos.stream()
                .filter(appInfoDto -> appInfoDto.getType()==AppType.EDUCATION)
                        .forEach(System.out::println);
        System.out.println("==========================================================");

        //. Find chargePerUSer by application name
        System.out.println("ChargePerUSer by Application name");
        appInfoDtos.stream()
                .filter(appInfoDto -> appInfoDto.getName().equalsIgnoreCase("Netflix"))
                .map(AppInfoDto::getChargePerUser)
                .forEach(System.out::println);
        System.out.println("===========================================================");

        // 3. All apps created after a date and sort in desc
        System.out.println("Apps Created After 2005 and sort in desc");
        appInfoDtos.stream()
                .filter(appInfoDto -> appInfoDto.getCreatedDate().isAfter(LocalDate.of(2014,07,14)))
                .sorted(Comparator.comparing(AppInfoDto::getCreatedDate).reversed())
                .forEach(System.out::println);
        System.out.println("==================================================================");

        //4. Sort all applications by Size in Desc order
        System.out.println("All applications by Size in Desc order");
        appInfoDtos.stream()
                .sorted(Comparator.comparing(AppInfoDto::getSize).reversed())
                .forEach(System.out::println);
        System.out.println("===================================================================");

        //5. Find the version by name,type
        System.out.println("Version by name,type");
        appInfoDtos.stream()
                .filter(appInfoDto -> appInfoDto.getName().equalsIgnoreCase("Spotify")&& appInfoDto.getType().equals(AppType.ENTERTAINMENT))
                .map(AppInfoDto::getVersion)
                .forEach(System.out::println);
        System.out.println("=============================================================================");

        //6. Find all applications by ownerName
       // System.out.println("All applications by ownerName");
        //appInfoDtos.stream()
               // .filter(appInfoDto -> appInfoDto.)

        //11. Add a application by index
        //System.out.println("Add a application by index");
        //AppInfoDto appInfoDto = new AppInfoDto(101,"chatGPT", AppVersion.V4_0,LocalDate.now(),60.0,AppType.WORK,true,0.0,
                //List.of(new ))


        // 12. Remove an application by index
        //System.out.println("Remove application at index 3");
        //AppInfoDto removedApp = appInfoDtos.remove(3);
        //System.out.println("Removed: " + removedApp);


        // 13. Get Owner by Index
        //System.out.println("Get owner[0] from application[0]");
        //if (!appInfoDtos.isEmpty() && !appInfoDtos.getClass(0).getOwners().isEmpty()) {
            //System.out.println(appInfoDtos.getClass(0).getOwners().get(0));
        }

    }

