import java.util.*;


public class LuckyNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter lucky number");
        try {
            int n=sc.nextInt();
            if(n<0)
                throw new NumberFormatException("Lucky Number can not be zero!!😒");
        }
        catch (NumberFormatException e){
            System.out.println(e.getMessage());
           /*
           * If we try to print an object
           * it's toString() method gets called.
           * And the toString() method prints
           * name of Exception class:getMessage() */
            System.out.println(e);
        }

    }

}
