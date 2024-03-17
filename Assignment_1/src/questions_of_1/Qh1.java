package questions_of_1;

public class Qh1 {
    public static void main(String[] args) {
        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);
        int c=Integer.parseInt(args[2]);
        if(a*b==c||a+b==c||a==b-c)
            System.out.println("Yes  they can be put in arithmetic formula");
        else System.out.println("Nope!!!");
    }
}
