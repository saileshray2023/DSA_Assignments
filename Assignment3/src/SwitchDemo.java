import java.util.Scanner;

public class SwitchDemo {
    public static void main(String[] args) {
        int itemCode=new Scanner(System.in).nextInt() ;
        switch (itemCode) {
            case 1 -> System.out.println("It's a laptop!");
            case 2 -> System.out.println("It's a desktop!");
            case 3, 4 -> System.out.println("It's a mobile phone!");
        }
    }
}