interface Person {
    void showDetails();
    String getName();
    int getId();
}

class UniversityMember {
    String universityName = "XYZ University";
    String department;

    UniversityMember(String department) {
        this.department = department;
    }

    void universityInfo() {
        System.out.println("Member of " + universityName + ", Department: " + department);
    }
}

class Student extends UniversityMember implements Person {
    String name;
    int id;
    String major;
    int year;

    Student(String name, int id, String major, int year, String department) {
        super(department);
        this.name = name;
        this.id = id;
        this.major = major;
        this.year = year;
    }

    public void showDetails() {
        System.out.println("Student: " + name + ", ID: " + id + ", Major: " + major + ", Year: " + year);
    }

    public String getName() { return name; }
    public int getId() { return id; }

    void studentInfo() {
        System.out.println("Enrolled in " + major + ", Year: " + year);
    }
}

class GraduateStudent extends Student {
    String thesisTitle;
    String advisor;

    GraduateStudent(String name, int id, String major, int year, String department, String thesisTitle, String advisor) {
        super(name, id, major, year, department);
        this.thesisTitle = thesisTitle;
        this.advisor = advisor;
    }

    void thesisInfo() {
        System.out.println("Thesis: " + thesisTitle + ", Advisor: " + advisor);
    }

    void graduationStatus() {
        System.out.println(name + " is expected to graduate this year.");
    }
}

public class University_Details {
    public static void main(String[] args) {
        GraduateStudent grad = new GraduateStudent(
            "John Doe", 12345, "Computer Science", 2, "Engineering",
            "Artificial Intelligence Applications", "Dr. Smith"
        );
        grad.showDetails();        // From interface Person
        grad.universityInfo();     // From UniversityMember
        grad.studentInfo();        // From Student
        grad.thesisInfo();         // From GraduateStudent
        grad.graduationStatus();   // Additional method
    }
}