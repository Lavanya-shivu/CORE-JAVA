package com.java.external.shell;

import com.java.internal.shell.Coneshell;

public class ShellRunner {
    public static void main(String[] args){
        Coneshell coneshell=new Coneshell();
        coneshell.shellconeShell();
        System.out.println("shell type is coneshell");

        RoundShell roundShell=new RoundShell();
        roundShell.shellRoundshell();
        System.out.println("shell type is Roundshell");
    }
}
