class Course {
    private String courseName;
    private int duration;
    private double fee;
    private static String instituteName = "BridgeLabz";

    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    public void displayCourseDetails() {
        System.out.println("Course: " + courseName + ", Duration: " + duration + " weeks, Fee: " + fee + ", Institute: " + instituteName);
    }

    public static void updateInstituteName(String newName) {
        instituteName = newName;
    }
}

public class onlineCourseManagement {
    public static void main(String[] args) {
        Course c1 = new Course("Java OOP", 8, 1500.0);
        Course c2 = new Course("Web Development", 12, 2000.0);

        c1.displayCourseDetails();
        c2.displayCourseDetails();

        Course.updateInstituteName("BridgeLabz SIPP");

        c1.displayCourseDetails();
        c2.displayCourseDetails();
    }
}
