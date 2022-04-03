package state.implementation_2.states.impl;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import state.implementation_2.ReservationContext;
import state.implementation_2.states.ReservationState;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Processed implements ReservationState {
    //singleton
    private static Processed instance = new Processed();

    public static Processed instance() {
        return instance;
    }

    //business logic
    @Override
    public void updateState(ReservationContext reservationContext) {
        System.out.println("Reservation " + reservationContext.getReservationId() + " is processed");
        //change state
        reservationContext.setCurrentState(Confirmed.instance());
    }
}