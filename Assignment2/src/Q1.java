import java.util.Scanner;
class Person {
    String name;
    int age;
    void setData(String name, int age) {
        this.name = name;
        this.age = age;}
    void displayData() {
        System.out.println("Person name :" + name);
        System.out.println("Person age :" + age);
    }
}

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person p1 = new Person();
        Person p2 = new Person();
        p1.name = "Rohan";
        p1.age = 20;
        System.out.println("Enter person name");
        String name = sc.nextLine();
        System.out.println("Enter age ");
        int age = sc.nextInt();
        p2.setData(name, age);
        p1.displayData();
        p2.displayData();
        if (p1.age > p2.age)
            System.out.println(p2.name + " is younger");
        else
            System.out.println(p1.name + " is younger");


    }

}
