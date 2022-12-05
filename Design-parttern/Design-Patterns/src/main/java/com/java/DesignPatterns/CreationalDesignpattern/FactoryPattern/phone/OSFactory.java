package com.java.DesignPatterns.FactoryPattern.phone;

public class OSFactory {
    public OS getInstance(String str) {
        if (str.equals("A"))
            return new andriod();
        else if (str.equals("B"))
            return new IOS();
        else
            return new windows();
    }
}
