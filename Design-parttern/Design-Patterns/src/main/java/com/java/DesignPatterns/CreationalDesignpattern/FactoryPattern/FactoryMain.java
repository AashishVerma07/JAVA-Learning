package com.java.DesignPatterns.FactoryPattern;

import com.java.DesignPatterns.FactoryPattern.phone.*;

public class FactoryMain {
    public static void main(String a[]){
        OSFactory osf = new OSFactory();
        OS obj = osf.getInstance("E");
        obj.spec();
    }
}
