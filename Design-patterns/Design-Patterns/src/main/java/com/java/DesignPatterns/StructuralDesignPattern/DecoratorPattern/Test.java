package com.java.DesignPatterns.StructuralDesignPattern.DecoratorPattern;

import com.java.DesignPatterns.StructuralDesignPattern.DecoratorPattern.Decorator.HeadPhone;
import com.java.DesignPatterns.StructuralDesignPattern.DecoratorPattern.Decorator.LiveTV;
import com.java.DesignPatterns.StructuralDesignPattern.DecoratorPattern.Decorator.WiFi;

public class Test {
    public static void main(String[] args) {
        FlightSeat mainCabinSeat = new WiFi(new HeadPhone(new LiveTV(new MainCabinSeat())));

        System.out.println("Chosen Facilities for your seat:");
        System.out.println(mainCabinSeat.getFacilities());
        System.out.println("Total Cost:" + mainCabinSeat.getCost());
    }
}
