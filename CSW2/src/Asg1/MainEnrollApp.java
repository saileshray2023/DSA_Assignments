package Asg1;

interface EnrollmentSystem{
  void display();
  Student enroll();
  Student drop();

}
class Student extends Course{
    String name;
    Student(String name,String course,String branch){
        super(course, branch);
        this.name=name;

    }


}
class Course{
    String course;
    String branch;
    Course(String course,String branch){
        this.course=course;
        this.branch=branch;
    }
}
class Enrollment extends Student implements EnrollmentSystem{
    Enrollment(String name, String course, String branch) {
        super(name, course, branch);
    }

    @Override
    public void display() {
        System.out.println(name+" "+course+" "+branch);
    }

    @Override
    public Student enroll() {
        return  new Student(name,course,branch);
    }

    @Override
    public Student drop() {
        return new Student(name,course,branch);
    }
}
public class MainEnrollApp
{

    public static void main(String[] args) {
        Enrollment student1=new Enrollment("Ram","B.Tech","CS");
        Enrollment student2=new Enrollment("Shyam","B.Tech","ECE");
        student1.display();student2.display();
        System.out.println(student1.enroll());
        System.out.println(student2.enroll());
        System.out.println(student2.drop());
    }
}
