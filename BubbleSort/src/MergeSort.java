
import java.util.Arrays;
import java.util.Random;

public class MergeSort {

    public static void main(String[] args) {
        Random rand = new Random();
        int[] list;
        for (int i = 1; i <= 1000; i *= 10) {
            list = new int[i];
            //populate the list
            for (int j = 0; j < i; j++) {
                list[j] = rand.nextInt();
            }
            //print before sort
            System.out.print("[" + list[0]);
            for (int j = 1; j < i; j++) {
                System.out.print(", " + list[j]);
            }
            System.out.println("]");
            //sort list
            sort(list);
            //print after sort
            System.out.print("[" + list[0]);
            for (int j = 1; j < i; j++) {
                System.out.print(", " + list[j]);
            }
            System.out.println("]");
        }
    }

    static void sort(int[] a) {
        if (a.length > 1) {
            //split into left and right
            int[] left = Arrays.copyOfRange(a, 0, a.length / 2);
            int[] right = Arrays.copyOfRange(a, a.length / 2, a.length);

            //sort each subarray
            sort(left);
            sort(right);

            //merge the two subarrays
            merge(a, left, right);
        }
    }

    static void merge(int a[], int[] left, int[] right) {
        int il = 0;
        int ir = 0;

        for (int i = 0; i < a.length; i++) {
            //if the left array is used up
            if (il >= left.length) {
                a[i] = right[ir];
                ir++;
                //if the right array is used up
            } else if (ir >= right.length) {
                a[i] = left[il];
                il++;
                //if the left header is smaller
            } else if (left[il] <= right[ir]) {
                a[i] = left[il];
                il++;
                //if the right header is smaller
            } else {
                a[i] = right[ir];
                ir++;
            }
        }
    }
}
