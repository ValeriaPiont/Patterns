package state.implementation_2.states.impl;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import state.implementation_2.ReservationContext;
import state.implementation_2.states.ReservationState;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Paid implements ReservationState {
    //singleton
    private static final Paid instance = new Paid();

    public static Paid instance() {
        return instance;
    }

    //business logic
    @Override
    public void updateState(ReservationContext reservationContext) {
        System.out.println("Reservation " + reservationContext.getReservationId() + " is paid");
        //change state
        reservationContext.setCurrentState(Processed.instance());
    }
}
