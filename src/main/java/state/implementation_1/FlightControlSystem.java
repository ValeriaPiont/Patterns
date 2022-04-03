package state.implementation_1;

import lombok.Getter;
import state.implementation_1.states.OnTheGroundState;
import state.implementation_1.states.interfaces.State;

@Getter
public class FlightControlSystem {

    private State state;

    public FlightControlSystem() {
        this.state = new OnTheGroundState();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void takeOff() {
        state.takeOff(this);
    }

    public void climb(int alt) {
        state.climb(this, alt);
    }
    
    public void descend(int alt) {
        state.descent(this, alt);
    }

    public void land() {
        state.landing(this);
    }

    public void getStatusOfFlight() {
        state.getStatusOfFlight();
    }
}