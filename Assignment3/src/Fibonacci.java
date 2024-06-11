import java.util.Scanner;

public class Fibonacci {
    public static long[] fib(int n){
        if(n<=1){
            long[] answer={n,0};
            return answer;
        }else {
            long[] temp=fib(n-1);
            long[] answer={temp[0]+temp[1],temp[0]};
            return answer;
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter n value:");
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
              System.out.println(fib(n)[0]);
    }
}
