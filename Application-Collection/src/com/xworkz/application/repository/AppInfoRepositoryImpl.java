package com.xworkz.application.repository;

import com.xworkz.application.dto.AppInfoDto;
import com.xworkz.application.dto.AppType;
import com.xworkz.application.dto.AppVersion;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Collections;

public class AppInfoRepositoryImpl implements AppInfoRepository{
    @Override
    public Collection<AppInfoDto> findAll() {

        AppInfoDto appInfoDto1 = new AppInfoDto(1,"Zoom", AppVersion.V1_0, LocalDate.of(2023,01,01), 41.5, AppType.GAME, true, 0.0);
        AppInfoDto appInfoDto2 = new AppInfoDto(2, "Slack", AppVersion.V2_0, LocalDate.of(2023,02,02), 43.0, AppType.EDUCATION, true, 0.0);
        AppInfoDto appInfoDto3 = new AppInfoDto(3, "Trello",AppVersion.V3_0, LocalDate.of(2023,03,03), 44.5,AppType.SOCIAL, true, 0.0);
        AppInfoDto appInfoDto4 = new AppInfoDto(4, "Spotify", AppVersion.V4_0, LocalDate.of(2023,04,04), 46.0, AppType.PRODUCTIVITY, false, 53.99);
        return Collections.emptyList();
    }
}
