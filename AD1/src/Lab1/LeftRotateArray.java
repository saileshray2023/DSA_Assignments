package Lab1;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class LeftRotateArray {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array length");
        int n = sc.nextInt();
        System.out.println("Enter how many rotations");
        int k = sc.nextInt();

        try {
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = r.nextInt(100);
            }

            System.out.print("Original array: ");
            for (int val : arr) {
                System.out.print(val + " ");
            }
            System.out.println();

            // Improved logic for left rotation
            k = k % n; // to handle cases where k > n
            int[] rotatedArr = new int[n];
            for (int i = 0; i < n; i++) {
                rotatedArr[i] = arr[(i + k) % n];
            }

            System.out.print("Rotated array: ");
            for (int val : rotatedArr) {
                System.out.print(val + " ");
            }
            System.out.println();
        } catch (ArrayIndexOutOfBoundsException | InputMismatchException e) {
            System.out.println(e.getMessage());
        }
    }
}

