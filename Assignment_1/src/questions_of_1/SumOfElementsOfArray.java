package questions_of_1;

import java.util.Scanner;

public class SumOfElementsOfArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the dimensions of the array");
        int m= sc.nextInt();
        int n=sc.nextInt();
        if(m>0&& n>0){
            int s=0;
            System.out.println("Enter the array elements");
            int [][]arr=new int[m][n];
            for(int i=0;i<arr.length;i++){
                for(int j=-0;j<arr[i].length;j++){
                    arr[i][j]= sc.nextInt();
                    s+=arr[i][j];

                }
            }
            System.out.println("Sum:"+s);
            for(int []row:arr){
                for(int val:row)
                    System.out.print(val+" ");
                System.out.println();
            }


        }else System.out.println("Invalid Dimensions");

    }
}
