package questions_of_1;
import java.util.Scanner;
public class MatrixAddition {

    public static double[][] addMatrix(double[][] a, double[][] b){
        double [][] m=new double[a.length][a[0].length];
        for(int i=0;i<a.length;i++){
            for(int j=-0;j<a[i].length;j++){
                m[i][j]=a[i][j]+b[i][j];
            }
        }
        return m;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the dimensions of matrix ");
        int m= sc.nextInt();
        int n= sc.nextInt();
        double[][]arr1=new double[m][n];
        double [][]arr2=new double[m][n];
        System.out.println("Enter first matrix elements");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr1[i][j]= sc.nextDouble();
            }

        }
        System.out.println("Enter second  matrix elements");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr2[i][j]= sc.nextDouble();
            }

        }
        double [][]res=addMatrix(arr1,arr2);
        for (double[] re : res) {
            for (double v : re) {
                System.out.print(v + "\t ");
            }
            System.out.println();
        }
    }
}
