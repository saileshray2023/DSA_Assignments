package pack1Ofag2;

import java.util.Scanner;

public class Student  {
     String name;
     int rollNo;
   public void inputDetails(){
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter Name:");
       name=sc.nextLine();
       System.out.print("Enter the roll no:");
       rollNo= sc.nextInt();


    }
     public void showDetails(){
         System.out.printf("Name:%s RollNo:%d",name,rollNo);
    }

}
