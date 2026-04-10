package bonus;
import java.util.Arrays;
public class CountingSort {
    public static int[] countingSort(int[] arr) {
        int[] count = new int[11]; 

        for (int num : arr) {
            count[num]++;
        }

        
        int[] sorted = new int[arr.length];
        int idx = 0;
        for (int i = 0; i <= 10; i++) {
            while (count[i] > 0) {
                sorted[idx++] = i;
                count[i]--;
            }
        }
        return sorted;
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3};
        int[] sorted = countingSort(arr);
        System.out.println(Arrays.toString(sorted));
       
    }
}