public class GCD {
    public static int gcd(int m, int n) {
        if (n == 0) {
            return m;
        }
        return gcd(n, m % n);
    }

    public static void main(String[] args) {
        int m =98;
        int n = 56;
        int gcd = gcd(m, n);
        System.out.println("The GCD of " + m + " and " + n + " is " + gcd);
    }
}
