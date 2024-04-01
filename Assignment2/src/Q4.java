import java.util.Scanner;

class Deposit {
    long principal;
    int time;
    double rate;
    double totalAmt;

    Deposit() {
        principal=5000;
        rate=5;
        time=2;
    }

    Deposit(long principal, int time, double rate) {
        this(principal, time);
        this.rate = rate;
    }

    Deposit(long principal, int time) {
        this.principal = principal;
        this.time = time;
    }

    Deposit(long principal, double rate) {
        this.principal = principal;
        this.rate = rate;
    }

    void display() {
        System.out.printf("%nPrincipal:%d\t Time:%d\t Rate:%f\t Total Amount:%f\t", principal, time, rate, totalAmt);
    }

    void calcAmt() {
        totalAmt = principal + (principal*rate*time)/100;
    }
}
public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Deposit[] arrObj = new Deposit[4];
        arrObj[0] = new Deposit();
        System.out.println("Enter principal,time and rate");
        arrObj[1] = new Deposit(sc.nextLong(), sc.nextInt(), sc.nextDouble());
        System.out.println("Enter principal,time");
        arrObj[2] = new Deposit(sc.nextLong(), sc.nextInt());
        System.out.println("Enter principal,rate");
        arrObj[3] = new Deposit(sc.nextLong(), sc.nextDouble());

        for(int i = 0; i < 4; ++i) {
            arrObj[i].calcAmt();
            arrObj[i].display();
        }

    }
}
