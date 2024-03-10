package questions_of_1;

import java.util.Scanner;
public class NumberOfDivisors {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int c=0;
        if(n<2)
            System.out.println("Invalid Number");
        else{
            while(n>=2){
                n/=2;
                c++;

            }
        }
        System.out.println("Number of Divisors are:"+c);
    }

}
