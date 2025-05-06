public class Employee {
    private String firstName;
    private String lastName;
    private String role;
    private double salary;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getRole() {
        return role;
    }

    public double getSalary() {
        return salary;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String calcFullname() {
        return firstName + " " + lastName;
    }

    public void introduce() {
        System.out.println("Hallo, my name is" + firstName + " and i'm training to become " + role);
    }

    public double calcBonus() {
        return salary * 0.05;
    }

    public void promote(String newRole, double extraSalary) {
        setRole(newRole);
        setSalary(getSalary() + extraSalary);
    }
}


