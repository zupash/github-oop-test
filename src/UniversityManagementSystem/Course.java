package UniversityManagementSystem;

public class Course {
    private String courseCode;
    private String courseName;
    private int courseCreditHours;
    private Teacher teacher;

    public Course(String courseCode,String courseName, int courseCreditHours){
        this.courseCode=courseCode;
        this.courseName=courseName;
        this.courseCreditHours=courseCreditHours;
    }

    public void teach(Teacher teacher){
        this.teacher=teacher;
    }

    public void display() {
        System.out.println(courseCode);
        System.out.println(courseName);
        System.out.println(courseCreditHours);
        teacher.display();
    }

}
