package questions_of_1;
import java.util.Scanner;

public class Qh2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of lines of text");
        int n= sc.nextInt();
        sc.nextLine();//for consuming the  left over new line character in buffer  while inputting the n
        String []ar=new String[n];
        System.out.println("Enter the lines of text ");
        int i=0;
        do {
            ar[i]=sc.nextLine();
            i++;
        }while (i<n);
        for(int j=ar.length-1;j>=0;j--){
            System.out.println(ar[j]);
        }
    }
}
