public class Airplane {
    private String manufacturer;
    private String model;
    private int capacity;
    private boolean inFlight;

    public Airplane (String manufacturer, String model, int capacity, boolean inFlight) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.capacity = capacity;
        this.inFlight = inFlight;

    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public int getCapacity() {
        return capacity;
    }

    public boolean isInFlight() {
        return inFlight;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setInFlight(boolean inFlight) {
        this.inFlight = inFlight;
    }

    public void fly() {
        setInFlight(true);
    System.out.printf("%s %s is flying.\n", getManufacturer(), getModel());
    }

    public void land() {
        setInFlight(false);
    System.out.printf("%s %s is landin.\n", getManufacturer(), getModel());
    }

    public boolean checkIfPassengersFit(int nrOfPassengers) {
        return capacity >= nrOfPassengers;
    }
}
