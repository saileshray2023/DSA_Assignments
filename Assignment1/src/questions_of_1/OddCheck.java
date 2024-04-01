package questions_of_1;

import java.util.Scanner;

public class OddCheck {
    public static boolean isOdd(int n){
        return((n&1)==1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ");
        int n=sc.nextInt();
        if(isOdd(n))
            System.out.print("Odd number");
        else System.out.println("Even number");

    }
}
