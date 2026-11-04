package UniversityManagementSystem;

public class Teacher {
    private String teacherName;

    public Teacher(String name){
        teacherName=name;
    }

    public void display()
    {
        System.out.println(teacherName);
    }
}
