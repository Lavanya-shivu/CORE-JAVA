package com.java.external;

import com.java.internal.EmailNotifier;
import com.java.internal.Notifier;

public class SmsNotifier {
   private Notifier notifier;

   public SmsNotifier(Notifier notifier){
       this.notifier=notifier;
   }
   public void sms(){
       if(notifier!= null){
           System.out.println("Running notification");
           this.notifier.send();
       }
       else {
           System.err.println("running error");
       }
   }
}
