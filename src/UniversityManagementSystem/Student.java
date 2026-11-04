package UniversityManagementSystem;
public class Student {
    private final String studentid; //constant
    private String name;
    static String uniname="UCP"; //class level
    private int[] marks;
    private Course course;
   // private String[] course;
    private int totalmarks;

    public static void test(Student s){
        System.out.println(s.studentid);
        System.out.println(s.name);
    }
//    public static Student test2(){
//        return new Student("111","aaa");
//    }
    public Student(String studentid,String name){
       this.studentid=studentid;
       this.name=name;
      // setCourse(course);
       //this.course=new String[]{"OOP","COAL"};
       this.marks=new int[]{95,80};
    }

//    public void setCourse(Course course){
//        this.course=course;
//    }

    public String getStudentid(){return studentid;}
    public String getUniname(){return uniname;}

    public void calTotal(){
        for(int i=0;i<marks.length;i++)
            totalmarks+=marks[i];
    }
    public void enroll(Course course){
        this.course=course;
    }
    public void display(){
        System.out.println(uniname);
        System.out.println(studentid);
        System.out.println(name);
        course.display();
//        for(int i=0;i<course.length;i++) {
//            course[i].display();
//        }
//        for(int i=0;i<course.length;i++)
//            System.out.print(course[i]+" ");
        System.out.println();
//        for(int i=0;i<marks.length;i++)
//            System.out.print(marks[i]+" ");
     //   System.out.println("\n"+totalmarks);
    }

}
