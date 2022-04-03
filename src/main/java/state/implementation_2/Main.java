package state.implementation_2;

public class Main {
    public static void main(String[] args) {
        ReservationContext reservationContext = new ReservationContext(null, 1);
        reservationContext.update();
        reservationContext.update();
        reservationContext.update();
        reservationContext.update();
    }
}
