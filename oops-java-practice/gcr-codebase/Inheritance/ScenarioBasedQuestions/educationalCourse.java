class Course {
    protected String courseName;
    protected int duration;

    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }
}

class OnlineCourse extends Course {
    protected String platform;
    protected boolean isRecorded;

    public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }
}

class PaidOnlineCourse extends OnlineCourse {
    private double fee;
    private double discount;

    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    public double calculateFinalFee() {
        return fee - discount;
    }

    public void displayDetails() {
        System.out.println("Course: " + courseName + " | Duration: " + duration + " weeks");
        System.out.println("Platform: " + platform + " | Recorded: " + isRecorded);
        System.out.println("Original Fee: $" + fee + " | Discount: $" + discount + " | Final Fee: $" + calculateFinalFee());
    }
}

public class educationalCourse {
    public static void main(String[] args) {
        PaidOnlineCourse course = new PaidOnlineCourse("Java Mastery", 12, "Udemy", true, 200.0, 50.0);
        course.displayDetails();
    }
}
