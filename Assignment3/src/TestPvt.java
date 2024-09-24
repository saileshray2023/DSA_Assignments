import java.util.*;

public class TestPvt {
    public static void main(String[] args) {

        int retVal =1;
        try {
            retVal =m1();
        }
        catch (Exception e){
            System.out.print(1);
        }finally {
            System.out.print(retVal);
        }

    }
    static int m1(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int input= sc.nextInt();
        int []arr=new int[input];

        try {
            arr=new int[input];
            for (int i=0;i<input;i++){
                arr[i]+=arr[1];
            }
        }catch (Exception e){
            System.out.print(2);
        }
        finally {
            System.out.print(3);
            return arr[0];
        }
    }
}
