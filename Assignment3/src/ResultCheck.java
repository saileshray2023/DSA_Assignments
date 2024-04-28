import java.util.Scanner;

class MarksOutOfBoundsException extends Exception{
    int marks;
    MarksOutOfBoundsException(int num){
        super("Marks Out of Bounds:"+num);
        marks=num;
    }
}
public class ResultCheck {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter marks of student:");
        try{
            int marks= sc.nextInt();
            if(marks<0||marks>100)
                throw new MarksOutOfBoundsException(marks);
        }
        catch ( MarksOutOfBoundsException e){
            System.out.println(e.toString());
            System.out.println(e.getMessage());//Prints the details of exception we provide in super() Line 5

        }
        finally {
            System.out.println("All resources closed in finally block");
        }
    }
}
