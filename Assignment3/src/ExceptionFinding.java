import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionFinding {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter how many  colors:");
        try{
            int n= sc.nextInt();
            String []m=new String[n];
            for(int i=0;i<n;i++)
                m[i]=sc.next();
            System.out.println("Following are your favourite colors:");
            for(int i=0;i<n;i++)
                System.out.println(m[i]);
        }catch (InputMismatchException e){
            System.out.println("Please enter appropriate data input!! ");
            sc.nextLine();
            main(args);
        }
        catch (NegativeArraySizeException n){
            System.out.println("Array index can not be negative!!");
            main(args);
        }

    }
}
