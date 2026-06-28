class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}

class Student extends Person {
    private final String studentId;
    private double gpa;

    public Student(String name, int age, String studentId, double gpa) {
        super(name, age);
        this.studentId = studentId;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return super.toString() + ", Student ID: " + studentId + ", GPA: " + gpa;
    }
}

class GradStudent extends Student {
    private String thesis;

    public GradStudent(String name, int age, String studentId, double gpa, String thesis) {
        super(name, age, studentId, gpa);
        this.thesis = thesis;
    }

    @Override
    public String toString() {
        return super.toString() + ", Thesis: " + thesis;
    }
}

public class universitySystem {
    public static void main(String[] args) {
        GradStudent grad = new GradStudent("Alice", 24, "S12345", 3.8, "AI in Healthcare");
        System.out.println(grad);

        System.out.println("grad IS-A Student: " + (grad instanceof Student));
        System.out.println("grad IS-A Person: " + (grad instanceof Person));
    }
}
