package com.greenfox.wednesdayexcercises;

import org.springframework.stereotype.Service;

@Service
public class RedColor implements MyColor {

    @Override
    public void printColor() {
        System.out.println("The color is red");

    }
}
