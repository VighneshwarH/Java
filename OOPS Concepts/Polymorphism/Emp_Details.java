// Base class
class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }

    double calculateSalary() {
        System.out.println("Calculating salary for generic employee");
        return 0;
    }
}

// Derived class 1
class Manager extends Employee {
    double baseSalary;
    double bonus;

    Manager(String name, double baseSalary, double bonus) {
        super(name);
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    @Override
    double calculateSalary() {
        return baseSalary + bonus;
    }
}

// Derived class 2
class Developer extends Employee {
    double baseSalary;
    int overtimeHours;

    Developer(String name, double baseSalary, int overtimeHours) {
        super(name);
        this.baseSalary = baseSalary;
        this.overtimeHours = overtimeHours;
    }

    @Override
    double calculateSalary() {
        return baseSalary + (overtimeHours * 50);
    }
}

// Derived class 3
class Intern extends Employee {
    double stipend;

    Intern(String name, double stipend) {
        super(name);
        this.stipend = stipend;
    }

    @Override
    double calculateSalary() {
        return stipend;
    }
}

public class Emp_Details {
    public static void main(String[] args) {
        Employee[] employees = {
            new Manager("Alice", 80000, 15000),
            new Developer("Bob", 60000, 10),
            new Intern("Charlie", 20000)
        };

        for (Employee emp : employees) {
            System.out.println(emp.name + " Salary: " + emp.calculateSalary());
        }
    }
}
