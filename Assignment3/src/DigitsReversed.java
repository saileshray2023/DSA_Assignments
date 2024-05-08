import java.util.Scanner;

public class DigitsReversed {
    public  static void digitRev(int n){
        if(n<10)
            System.out.print(n);
        else{
            System.out.print(n%10);
            digitRev(n/10);

    }   }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        digitRev(n);

    }
}
