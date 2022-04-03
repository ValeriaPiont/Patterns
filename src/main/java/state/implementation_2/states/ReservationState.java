package state.implementation_2.states;

import state.implementation_2.ReservationContext;

public interface ReservationState {
    void updateState(ReservationContext reservationContext);
}