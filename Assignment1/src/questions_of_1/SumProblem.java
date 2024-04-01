package questions_of_1;

import java.util.Scanner;

public class SumProblem {
    public static  int sum_Of_Digits(int n){
        while (n>=10){
            int sum=0;
            while(n>0){
                sum+=n%10;
                n/=10;
            }
            n=sum;
        }
        return n;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        System.out.println("Sum is :"+sum_Of_Digits(n));

    }
}
