public class ProductOf2Number {
    public static void main(String[] args) {
        System.out.println(product(12,-5));
    }
    public static int product(int a,int b){
        if (b == 0) {
            return 0;
        } else if (b > 0) {
            return a + product(a, b - 1);
        } else {
            return -product(a, -b);
        }
    }
}
