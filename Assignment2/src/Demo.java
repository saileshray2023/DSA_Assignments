import java.util.Scanner;

class Commission
 {
     int sales;
     Commission(int sales){
         this.sales=sales;
     }
     double getCommission(int sales){
         if(sales<100)
             return sales*0.02;
         if(sales<5000)
             return sales*0.05;
         return sales*0.08;
     }
 }
public class Demo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter sales ");
        int sales= sc.nextInt();
        if(sales>1){
            Commission c1=new Commission(sales);
            System.out.println("Commission of sales person:"+c1.getCommission(sales));
        }
        else System.out.println("Invalid input");
    }
}
