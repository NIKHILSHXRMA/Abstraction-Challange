class Employee {
    private String name;
    private int baseSalary;

    public int getBaseSalary() {
        return baseSalary;
    }

    public String getName() {
        return name;
    }

    Employee(String name, int baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    int calculateSalary(){
        return baseSalary;
    }
}

class FullTimeEmployee extends Employee{

    FullTimeEmployee(String name , int baseSalary){
        super(name, baseSalary);
    }

    @Override
    int calculateSalary() {
        // TODO Auto-generated method stub
         return getBaseSalary() + 5000;
    }


}

class Intern extends Employee{

    Intern(String name, int baseSalary ){
        super(name, baseSalary);
    }

    @Override
    int calculateSalary() {
        // TODO Auto-generated method stub
        return getBaseSalary()+1000;
    }
}

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        

        Employee E1 = new FullTimeEmployee("Nikhil Sharma", 20000);
        Employee E2 = new Intern("Rohit Chamar", 20000);

        System.out.println("Employee name :" + E1.getName());
        System.out.println("Full Time Employee Salary :"+E1.calculateSalary());

        System.out.println("Employee name :" + E2.getName());
        System.out.println("Intern Employee Salary :"+E2.calculateSalary());
    }
}