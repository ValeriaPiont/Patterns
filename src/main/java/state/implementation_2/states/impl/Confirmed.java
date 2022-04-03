package state.implementation_2.states.impl;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import state.implementation_2.ReservationContext;
import state.implementation_2.states.ReservationState;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Confirmed implements ReservationState {
    //singleton
    private static final Confirmed instance = new Confirmed();

    public static Confirmed instance() {
        return instance;
    }

    //business logic
    @Override
    public void updateState(ReservationContext reservationContext) {
        //change state
        System.out.println("Reservation " + reservationContext.getReservationId() + " is confirmed");
    }
}