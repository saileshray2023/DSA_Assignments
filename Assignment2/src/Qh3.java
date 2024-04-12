import java.util.Scanner;

public class Qh3 {
    public static void main(String[] args) {
        Bank[] p =new Bank[5];

        for(int i=0;i<5;i++) {
            p[i]=new Bank();
            p[i].setBankName();
            p[i].setAmount();

        }
        for(int i=0;i<5;i++) {
            p[i].showData();
            System.out.println();
        }
        System.out.println();
        System.out.println("Total amount is = "+Bank.totalAmount);
        Bank.minDepositBanks(p);
    }


}
class Bank{
    String BankName;
    double depositAmount;
    static double totalAmount;
    Scanner sc=new Scanner(System.in);
    void setBankName() {
        System.out.println("Enter the Bank name ");
        BankName=sc.next();
    }
    void setAmount() {
        System.out.print("Enter the deposit amount ");
        depositAmount=sc.nextDouble();
        if(depositAmount>=1000)
            totalAmount+=depositAmount;
        else
            System.out.println("Minimum deposit amount should be 1000");
    }
    void showData() {
        System.out.println("Bank name is = "+BankName);
        System.out.print("My deposit Amount is = "+depositAmount);
    }
    public static void minDepositBanks(Bank[] p) {
        double minDeposit =p[0].depositAmount;
        String minDepositBankName =p[0].BankName;
        for(int i=1;i<5;i++) {
            if(p[i].depositAmount< minDeposit) {
                minDeposit =p[i].depositAmount;
                minDepositBankName =p[i].BankName;
            }
        }
        System.out.println("This "+ minDepositBankName + " bank has minimum amount: "+ minDeposit);
    }


}
