public class FormatPrint {
    public  void printLine(){
        System.out.println("hello");
    }
    public static void main(String[] args) {
       FormatPrint t1 =new FormatPrint();
        t1.printLine();
         System.out.printf("%5d %d",1,2);
         System.out.printf("%5d %f",1,3.3);
         System.out.printf("%5d %f",1,2.0);
        System.out.printf("amount is %f %e\n", 32.32, 32.32);
         System.out.printf("amount is %5.2f%% %5.4e\n", 32.327, 32.32);
         System.out.printf("%6b\n", (1 > 2));
         System.out.printf("%6s\n", "Java");
         System.out.printf("%-6b%s\n", true, "Java");
         System.out.printf("%6b%-8s\n",(1 > 2), "Java");
    }
}
