public class Mainn {
    public static void main(String[] args) {
        Person first = new Person("Hicham", 25);
        Person second = new Person("Sara", 28);
        Person third = new Person("Ali", 30);
        Person fourth = new Person("Zainab", 22);
        Person fifth = new Person("Omar", 35);
        Person sixth = new Person("Mouna", 27);
        Person seventh = new Person("Khalid", 32);
        Person eighth = new Person("Laila", 24);
        Person ninth = new Person("Youssef", 29);
        Person tenth = new Person("Fatima", 26);

        first.setName("Hicham", "The sbe3");

        System.out.println("De eerste persoon noemt " + first.getName() + " en is " + first.getAge() + " jaar oud");
        System.out.println("Updated name is: " + first.getName());
        System.out.println("Population: " + Person.getPopulation());
    }
}
