package com.java.external.Airconditioner;

import com.java.internal.Rainbow;

public class BeautifulRainbow {
    public void beautifulRainbow(Rainbow rainbow){
        if(rainbow!= null){
            if(rainbow instanceof ColorfulRainbow){
                ColorfulRainbow colorfulRainbow = (ColorfulRainbow) rainbow;
                colorfulRainbow.displayColors();
                colorfulRainbow.fade();
            }
            else{
                rainbow.appear();
                System.err.println("Rainbow is beautiful");
            }
        }
        else{
            System.err.println("Rainbow is null");
        }
    }
}
