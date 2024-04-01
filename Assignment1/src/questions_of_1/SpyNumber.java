package questions_of_1;

import java.util.Scanner;

public class SpyNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int n= sc.nextInt();
        int num=n,sum=0,prod=1;
        while (num>0){
            int d=num%10;
            sum+=d;
            prod*=d;
            num/=10;


        }
        if(sum==prod)
            System.out.printf("%d is a Spy number.",n);
        else System.out.printf("%d is  not a Spy number.",n);
    }
}
