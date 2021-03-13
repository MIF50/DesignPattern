package com.MIF50.behavioural.state.excerise;

public class DirectionService {

    private DirectionState state;

    public Object getEta() {
        return state.getEta();
    }

    public Object getDirection() {
       return state.getDirection();
    }

    public DirectionState getDirectionState() {
        return state;
    }

    public void setDirectionState(DirectionState directionState) {
        this.state = directionState;
    }
}

