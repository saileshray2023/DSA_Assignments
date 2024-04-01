package questions_of_1;

import java.util.Scanner;

public class SumOfMajorDiagonal {
    public static double sumMajorDiagonal(double[][] m){
        double sum=0;
        for(int i=0;i<m.length;i++){
            sum+=m[i][i];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the dimension of square matrix");
        int n= sc.nextInt();
        if(n>0){
            System.out.println("Enter matrix elements");
        double [][]m=new double[n][n];
        for (int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                m[i][j]=sc.nextDouble();

            }
        }
        System.out.println("Sum of elements in major diagonal is  "+sumMajorDiagonal(m));

        }
        else System.out.println("Array dimensions are invalid");
    }
}
