import java.util.*;
public class ArrayRearrange {
    public static void rearrange(int[] A, int k) {
        rearrange(A, 0, k, A.length - 1);
    }

    private static void rearrange(int[] A, int start, int k, int end) {
        if (start >= end) {
            return;
        }

        int pivotIndex = partition(A, start, end);
        int pivotValue = A[pivotIndex];

        if (pivotValue <= k) {
            start = pivotIndex + 1;
        } else {
            end = pivotIndex - 1;
        }

        rearrange(A, start, k, end);
    }

    private static int partition(int[] A, int start, int end) {
        int pivot = A[end];
        int i = start;

        for (int j = start; j < end; j++) {
            if (A[j] <= pivot) {
                swap(A, i, j);
                i++;
            }
        }

        swap(A, i, end);
        return i;
    }

    private static void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }

    public static void main(String[] args) {
        int[] A = {-1, -1, 6, 1, 9, 3, 2, -1, 4, -1};
        int k = 3;
        rearrange(A, k);
        System.out.println(Arrays.toString(A));
    }
}

