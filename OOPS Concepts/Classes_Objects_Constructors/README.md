# Java Notes: Classes & Objects, Constructors & `this` Keyword

## 📌 Classes & Objects
- **Class** → A blueprint/template that defines variables (fields) and methods.  
- **Object** → An instance of a class (created using `new` keyword).  

### Example
```java
class Car {
    String brand;
    int speed;

    void drive() {
        System.out.println(brand + " is driving at " + speed + " km/h");
    }
}

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.brand = "Tesla";
        car1.speed = 120;
        car1.drive();

        Car car2 = new Car();
        car2.brand = "BMW";
        car2.speed = 150;
        car2.drive();
    }
}
```

---

## 📌 Constructors
- A **constructor** is a special method with the **same name as class**.  
- Invoked **automatically** when an object is created.  
- Has **no return type** (not even `void`).  

### Types of Constructors
1. **Default Constructor** – No parameters.  
2. **Parameterized Constructor** – Accepts arguments.  
3. **Copy Constructor** – Copies values from another object.  

### Example
```java
class Student {
    String name;
    int age;

    // Default Constructor
    Student() {
        name = "Unknown";
        age = 0;
    }

    // Parameterized Constructor
    Student(String name, int age) {
        this.name = name;   // using 'this' keyword
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.display();

        Student s2 = new Student("Vighnesh", 21);
        s2.display();
    }
}
```

---

## 📌 `this` Keyword
- Refers to the **current object** of a class.  
- Uses:  
  ✅ Differentiate between instance & local variables.  
  ✅ Call other constructors (`this(...)`).  
  ✅ Pass current object as a parameter.  

### Example
```java
class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;       
        this.salary = salary;
    }

    void show() {
        System.out.println("Employee: " + this.name + ", Salary: " + this.salary);
    }
}

public class Main {
    public static void main(String[] args) {
        Employee e = new Employee("John", 50000);
        e.show();
    }
}
```

---

## 📝 Practice Tasks
1. Create a class **Book** with variables `title`, `author`, `price`.  
   - Write a constructor to initialize them.  
   - Create objects and display details.  

2. Create a class **Rectangle** with `length` and `breadth`.  
   - Write a method to calculate **area** and **perimeter**.  
   - Use **this keyword** in the constructor.  

3. Create a class **Employee** with `id`, `name`, `salary`.  
   - Write a **parameterized constructor**.  
   - Write a method `raiseSalary(int percent)` that increases salary.  

4. Create a class **Circle** with `radius`.  
   - Write a method to calculate **area** and **circumference**.  
   - Create two objects and display results.  

5. Create a class **Laptop** with `brand`, `model`, and `price`.  
   - Use a constructor to initialize values.  
   - Write a method to display laptop details.  

---

✨ Happy Coding!
