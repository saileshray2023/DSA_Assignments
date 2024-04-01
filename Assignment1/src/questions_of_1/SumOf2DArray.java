package questions_of_1;

import java.util.Scanner;

public class SumOf2DArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the dimensions of matrix");
        int m=sc.nextInt();
        int n= sc.nextInt();
        if(m>0&&n>0){
            int sum=0;
            int[][] arr=new int[m][n];
            System.out.println("Enter array elements");
            for (int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    arr[i][j]= sc.nextInt();
                }
            }
            for (int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    sum+=arr[i][j];
                    System.out.print(arr[i][j]+"  ");
                }
                System.out.println();
            }

            System.out.println("Sum:"+sum);

        }
        else System.out.println("Dimensions are invalid");
    }
}
