package com.MIF50.state.excerise;

public class BicyclingTravel implements DirectionState {

    @Override
    public Object getEta() {
        System.out.println("Calculating ETA (bicycling)");
        return 2;
    }

    @Override
    public Object getDirection() {
        System.out.println("Calculating Direction (bicycling)");
        return 2;
    }
}
