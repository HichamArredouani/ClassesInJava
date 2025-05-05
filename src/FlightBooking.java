
public class FlightBooking {
    private Airplane airplane;
    private int bookingNumber;
    private String destination;
    private String ArrivalTime;
    private int passengerAmount;

    public FlightBooking(Airplane airplane, int bookingNumber, String destination, String ArrivalTime, int passengerAmount) {
        this.airplane = airplane;
        this.bookingNumber = bookingNumber;
        this.destination = destination;
        this.ArrivalTime = ArrivalTime;
        this.passengerAmount = passengerAmount;

    }
}
