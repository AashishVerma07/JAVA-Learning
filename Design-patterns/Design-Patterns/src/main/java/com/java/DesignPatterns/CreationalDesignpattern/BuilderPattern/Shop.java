package com.java.DesignPatterns.CreationalDesignpattern.BuilderPattern;

public class Shop {
    public static void main(String a[]){
        Phone p = new PhoneBuilder().setRam(2).setScreenSize(6.0).getPhone();
        System.out.println(p);
    }
}
