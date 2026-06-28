class Student {
    public String rollNumber;
    protected String name;
    private double cgpa;

    public Student(String rollNumber, String name, double cgpa) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.cgpa = cgpa;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        if (cgpa >= 0.0 && cgpa <= 10.0) {
            this.cgpa = cgpa;
        }
    }
}

class PostgraduateStudent extends Student {
    private String researchTopic;

    public PostgraduateStudent(String rollNumber, String name, double cgpa, String researchTopic) {
        super(rollNumber, name, cgpa);
        this.researchTopic = researchTopic;
    }

    public void displayPostgraduateDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name (accessed via subclass): " + name);
        System.out.println("CGPA: " + getCgpa());
        System.out.println("Research Topic: " + researchTopic);
    }
}

public class universityManagementSystem {
    public static void main(String[] args) {
        PostgraduateStudent pg = new PostgraduateStudent("PG101", "John Doe", 8.5, "Machine Learning");
        pg.displayPostgraduateDetails();

        pg.setCgpa(9.2);
        System.out.println("Updated CGPA: " + pg.getCgpa());
    }
}
