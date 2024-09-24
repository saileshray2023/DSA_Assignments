import java.util.Scanner;

public class Fibonacci {
    public static long[] fib(int n){
        if(n<=1)
            return new long[]{n,0};
        else {
            long[] temp=fib(n-1);
            return new long[]{temp[0]+temp[1],temp[0]};
        }
     }

    public static void main(String[] args) {
        System.out.println("Enter n value:");
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
              System.out.println(fib(n)[0]);
    }
}
