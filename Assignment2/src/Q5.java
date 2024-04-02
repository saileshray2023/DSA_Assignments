import java.util.Scanner;

class Person1 {
    String name;
    int age;
    Person1(String name,int age){
        this.name=name;
        this.age=age;
    }



}
class Employee extends Person1{
    int eID;
    double salary;
    Employee(String name,int age,int eID,double salary){
        super(name, age);
        this.eID=eID;
        this.salary=salary;
    }
    void empDisplay(){
        System.out.printf("Name:%s Age:%d Eid:%d Salary:%f",name,age,eID,salary);

    }

}
public class Q5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the name,age,eid,salary");
        Employee ob=new Employee(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextDouble());
        ob.empDisplay();
    }

}
