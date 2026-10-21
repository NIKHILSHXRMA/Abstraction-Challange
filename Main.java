abstract class Employee {
    private String name;
    private int id;

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    

    double salary;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    abstract double getcalculateSalary();
}

class FullTimeEmployee extends Employee {

    FullTimeEmployee(String name, int id) {
        super(name, id);
    }

    @Override
    double getcalculateSalary() {
        return 40000;
    }

}

class PartTimeEmployee extends Employee {

    int hoursWorked;

   PartTimeEmployee(String name, int id, int hoursWorked) {
        super(name, id);

        if (hoursWorked < 0) {
            throw new IllegalArgumentException(
                "Hours worked cannot be negative"
            );
        }

        this.hoursWorked = hoursWorked;
    }

    @Override
    double getcalculateSalary() {
        return hoursWorked * 300.0;
    }

}

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
         Employee e1 = new FullTimeEmployee("Rahul", 101);
        Employee e2 = new PartTimeEmployee("Aman", 102, 80);

        System.out.println("Employee: " + e1.getName());
        System.out.println("Full-Time Salary: " + e1.getcalculateSalary());

        System.out.println();

        System.out.println("Employee: " + e2.getName());
        System.out.println("Part-Time Salary: " + e2.getcalculateSalary());
    }

}