package state.implementation_2.states.impl;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import state.implementation_2.ReservationContext;
import state.implementation_2.states.ReservationState;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Accepted implements ReservationState {
    //singleton
    private static final Accepted instance = new Accepted();

    public static Accepted instance() {
        return instance;
    }

    //business logic
    @Override
    public void updateState(ReservationContext reservationContext) {
        System.out.println("Reservation " + reservationContext.getReservationId() + " is accepted");
        //change state
        reservationContext.setCurrentState(Paid.instance());
    }
}
