public class BinaryEquivalent {
    public static void main(String[] args) {
        int k=100;
        System.out.println(binary(k));

    }
    public static String  binary(int num){

        if (num==1)
           return "1";
        else return binary(num/2)+ num % 2;



    }
}
