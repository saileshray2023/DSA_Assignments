package pack1Ofag2;

import java.util.Scanner;

public  class Test extends Student{
   public int mark1,mark2;
     public void inputDetails(){
         super.inputDetails();
         Scanner sc=new Scanner(System.in);
         System.out.print("Enter marks 1:");
         mark1= sc.nextInt();
         System.out.print("Enter marks 2:");
         mark2= sc.nextInt();
    }
     public void showDetails(){
         super.showDetails();
         System.out.printf("%nMark1:%d Mark2:%d",mark1,mark2);

    }

}
