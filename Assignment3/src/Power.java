import java.util.Scanner;
public class Power {
    private static long calcPower(long x,int n){
        if(n==0)
            return 1;
        else return x*calcPower(x,n-1);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the number ");
        long x= sc.nextLong();
        System.out.println("Enter the indices power");

         n= sc.nextInt();

        if(n<0)
            throw new RuntimeException("Indices power can not be negative");
        System.out.println("Result :"+calcPower(x,n));


    }
}
