import java.util.Scanner;


public class RihannaAirApp {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("Boeing", "737", 100, true);
        Airplane airplane2 = new Airplane("Airbus", "A320", 180, false);
        Airplane airplane3 = new Airplane("Embraer", "E195", 120, true);
        Airplane airplane4 = new Airplane("Bombardier", "CRJ900", 90, false);
        Airplane airplane5 = new Airplane("Cessna", "Citation X", 12, true);

       airplane1.fly();
       airplane2.fly();
       airplane3.fly();
       airplane4.fly();
       airplane5.fly();

       airplane1.land();
       airplane2.land();
       airplane3.land();
       airplane4.land();
       airplane5.land();

        System.out.println("Vliegtuigen zijn aangemaakt!");

        int passengerAmount = KeyboardUtility.askForInt("Enter a number of passengers: ");
        boolean itFits = airplane5.checkIfPassengersFit(passengerAmount);
        System.out.printf("%d passengers %s fit on the %s %s (capacity: %d).\n",
                passengerAmount, itFits ? "do" : "do not", airplane5.getManufacturer(), airplane5.getModel(), airplane5.getCapacity());
        if (itFits) {
            FlightBooking booking4 = new FlightBooking(airplane5, 1004, "BRU",  "13:15" , passengerAmount);
        } else {
            System.out.println("Booking aborted.");
        }
    }


    }
