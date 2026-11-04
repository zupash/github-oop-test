import UniversityManagementSystem.*;

public class Main {
    public static void main(String[] args) {

        Course[] c=new Course[3];
        for(int i=0;i<c.length;i++){
            c[i]=new Course("CP223","OOP",3);
        }

        Teacher t=new Teacher("Zupash");
        //Student.uniname="UMT";
        Student s=new Student("L1F25BSSE001","Ali");
        s.enroll(c[0]);
        c[0].teach(t);
       // s.setCourse(c[0]);
       // s.calTotal();
        s.display();
       // c[0].display();
       // Student.test(s);
       // Student s1=Student.test2();


//        String[] course={"OOP","COAL","CAL"};
//        s.setCourse(course);
//        s.display();
    }
}
