public class Smartphone {
    private String brand;
    private int price;
    private int battery;
    private boolean charging;

    public String getBrand() {
        return brand;
    }

    public int getPrice() {
        return price;
    }

    public int getBattery() {
        return battery;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public boolean isCharging() {
        return charging;
    }

    public void setCharging(boolean charging) {
        this.charging = charging;
    }

    public void charge() {
        setCharging(true);
        System.out.println("Battery is at " + getBattery() + "% and is charging.");
    }
}
