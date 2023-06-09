package com.alex.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("SuperContraGameQualifier")
public class SuperContraGame implements GamingConsole {
    public void up () {
        System.out.println("look up");
    }

    public void down () {
        System.out.println("Crounch");
    }

    public void left () {
        System.out.println("Go back");
    }

    public void right () {
        System.out.println("Accelerate");
    }

}
