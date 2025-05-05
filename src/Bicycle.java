import java.util.Random;

class Bicycle {

    private String colour;
    private int nrOfSeats;

    public Bicycle (String colour, int nrOfSeats) {
        this.colour = colour;
        this.nrOfSeats = nrOfSeats;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getNrOfSeats() {
        return nrOfSeats;
    }

    public void setNrOfSeats() {
        this.nrOfSeats = nrOfSeats;
    }

    public void ride () {
        Random randNumGenerator = new Random();
        int randomSpeed = randNumGenerator.nextInt(30);
        String sentence = "Riding around at " + randomSpeed + "km/h";
        System.out.println(sentence);

    }

    public void displayInfo(){
        String colour = "blue"; // My eye colour
        System.out.println("Eye colour: " + colour); // Eye colour
        System.out.println("Bicycle colour: " + this.colour); // Bicycle colour
        System.out.println("Number of seats: " + nrOfSeats);
        }
    }

