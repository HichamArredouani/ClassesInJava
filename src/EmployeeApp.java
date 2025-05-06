public class EmployeeApp {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();

        employee1.setFirstName(" Hicham");
        employee1.setLastName("Arredouani");
        employee1.setRole("Developer");
        employee1.setSalary(1000);

        employee2.setFirstName(" Zaid");
        employee2.setLastName("ha");
        employee2.setRole("Taxi");
        employee2.setSalary(2000);

        employee1.introduce();
        employee2.introduce();

        employee1.calcBonus();
        employee1.getSalary();
        employee1.promote("senior Developper", 1000);



        System.out.println(employee1.calcFullname() + " with a salary of EUR " + employee1.getSalary() + " gets a bonus of EUR" + employee1.calcBonus());
        System.out.println(employee1.calcFullname() + " has been promoted to" + employee1.getRole() + " with a salary of EUR " + employee1.getSalary());
    }
}
