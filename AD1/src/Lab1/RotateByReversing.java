package Lab1;

public class RotateByReversing {


        public static void main (String[] args) {
            int[] arr = {1, 2, 3, 4, 5};
            int d = 2;
            leftRotate(arr, d);
            System.out.println("Array after left rotation:");
            for (int j : arr) {
                System.out.print(j + " ");
            }
        }

        // Function to left rotate array elements by d positions
        public static void leftRotate(int []arr, int d) {
            int n = arr.length;
            // To handle case when d >= n
            d = d % n;

            // Reverse the first d elements
            reverse(arr, 0, d - 1);
            // Reverse the remaining elements
            reverse(arr, d, n - 1);
            // Reverse the whole array
            reverse(arr, 0, n - 1);
        }

        public static void reverse(int[] arr, int start, int end) {
            while (start < end) {
                // swapping of two numbers
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
}
