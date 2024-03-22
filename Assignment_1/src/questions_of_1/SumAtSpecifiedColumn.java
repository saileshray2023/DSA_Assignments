package questions_of_1;
import java.util.Scanner;
public class SumAtSpecifiedColumn {
    public static double sumColumn(double[][] m, int columnIndex){
        double sum=0;
        for (double[] x : m)
            sum += x[columnIndex];
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double [][]m= new double[3][4];
        System.out.println("Enter elements of matrix");
        for(int i=0;i<m.length;i++)
            for(int j=0;j<m[0].length;j++)
                m[i][j]=sc.nextDouble();
        for(int j=0;j<m[0].length;j++)
           System.out.printf("Sum of column %d is %5.2f%n",j+1,sumColumn(m,j));
    }
}
