public class StringReverse {
    public static void main(String[] args) {
        String s1 = "pots&pans";
        String reversed = reverse(s1);
        System.out.println("The reverse of \"" + s1 + "\" is \"" + reversed + "\"");
    }public static String reverse(String s) {
        if (s.length() <= 1) {
            return s;
        } else {
            return reverse(s.substring(1)) + s.charAt(0);
        }
    }
}
