package com.xworkz.dto;

import lombok.*;

import java.io.Serializable;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CampingDto implements Serializable {
    private String tentSize;
    private boolean isStoveStainless;
    private boolean isFlashLightLongLasting;
    private String place;
    private boolean isChairFoldable;

}
