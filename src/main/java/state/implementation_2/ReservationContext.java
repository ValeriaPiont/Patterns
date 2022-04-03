package state.implementation_2;

import lombok.Getter;
import lombok.Setter;
import state.implementation_2.states.ReservationState;
import state.implementation_2.states.impl.Accepted;

@Getter
@Setter
public class ReservationContext {

    private ReservationState currentState;
    private final long reservationId;

    public ReservationContext(ReservationState currentState, long reservationId) {
        this.currentState = currentState;
        this.reservationId = reservationId;
        if (currentState == null) {
            this.currentState = Accepted.instance();
        }
    }

    public void update() {
        currentState.updateState(this);
    }
}
