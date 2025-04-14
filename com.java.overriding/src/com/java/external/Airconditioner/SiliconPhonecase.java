package com.java.external.Airconditioner;

import com.java.internal.PhoneCase;

public class SiliconPhonecase {
    public void siliconePhonecase(PhoneCase phoneCase){
        if(phoneCase!= null){
            if(phoneCase instanceof LeatherCase){
                LeatherCase leatherCase = (LeatherCase) phoneCase;

                leatherCase.flipCover();
                leatherCase.close();
            }
            else {
                phoneCase.protect();
                System.err.println("This is SiliconPhonecase");
            }
        }
    else{
        System.err.println("Phonecase is null");
        }
    }
}
