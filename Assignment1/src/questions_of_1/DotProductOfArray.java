package questions_of_1;

import java.util.Scanner;

public class DotProductOfArray {
    private  static  void displayArray(int []m){
        for(int val:m)
            System.out.print(val+" ");
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array length");
        int n= sc.nextInt();
        if(n>0){
            int[] a =new int[n];
            int[] b =new int[n];
            int[] c =new int[n];
            System.out.println("Enter first array");
            for(int i=0;i<n;i++){

                a[i]= sc.nextInt();
            }
            System.out.println("Enter second array");
            for(int i=0;i<n;i++){
                b[i]= sc.nextInt();
                c[i]=a[i]*b[i];

            }
            System.out.print("First array is:");displayArray(a);
            System.out.print("\nSecond array is:");displayArray(b);
            System.out.print("\nDot product array is :");displayArray(c);

        }else System.out.println("Array length invalid");
    }
}
