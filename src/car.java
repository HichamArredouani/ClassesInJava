public class car {

    String model;
    double price;
    String colour;
    int buildYear;

    public car(String model, double price, String colour, int buildYear) {
        this.model = model;
        this.price = price;
        this.colour = colour;
        this.buildYear = buildYear;
    }

    @Override
    public String toString() {
        return "Car{" + "model=" + model + '\'' + ", price=" + price + ", colour=" +'\'' + ", buildyear=" +buildYear + '}';
    }
}
