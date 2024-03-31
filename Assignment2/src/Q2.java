import java.util.*;
class Complex{
    double real,img;
    void setData () {
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter the real part:");
        real=sc.nextDouble();
        System.out.print("Enter the imaginary part:");
        img=sc.nextDouble();
    }
    void displayData() {
        System.out.println(real+"+"+img+"i");
    }
    public Complex add(Complex c1,Complex c2) {
        Complex c3=new Complex();
        c3.real=c1.real+c2.real;
        c3.img=img+c2.img;
        return c3;
    }

}public class Q2 {
    public static void main(String[] args) {
        Complex c1=new Complex();
        Complex c2=new Complex();
        System.out.println("For first complex number");
        c1.setData();
        System.out.println("For second complex number");
        c2.setData();
        Complex res=c1.add(c1, c2);
        System.out.print("First complex number is:");
        c1.displayData();
        System.out.print("Second complex number is:");
        c2.displayData();
        System.out.print("Sum is :");
        res.displayData();
    }

}
