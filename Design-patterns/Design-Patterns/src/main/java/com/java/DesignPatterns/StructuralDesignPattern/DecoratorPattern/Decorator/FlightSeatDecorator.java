package com.java.DesignPatterns.StructuralDesignPattern.DecoratorPattern.Decorator;


import com.java.DesignPatterns.StructuralDesignPattern.DecoratorPattern.FlightSeat;

public abstract class FlightSeatDecorator implements FlightSeat {
    protected FlightSeat flightSeat;

    public FlightSeatDecorator(FlightSeat flightSeat) {
        this.flightSeat = flightSeat;
    }

    public abstract String getFacilities();

    public abstract Double getCost();
}
