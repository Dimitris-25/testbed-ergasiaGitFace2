package gr.aueb.cf.ch6;

/**
 * Βρισκουμε τον μεγιστο αριθμο σε εναν πινακα
 * και τη θεση που βρισκεται ο αριθμος αυτος.
 */

public class MaxPositionApp {
    public static void main(String[] args) {
        int arr[] = {2,5,8,9,11,14};
        int maxPosition;

        maxPosition = getMaxPosition(arr,0, arr.length -1);
        if (maxPosition == -1) {
            System.out.println("No such element");
            System.exit(1);
        }
        System.out.println(arr[maxPosition]);


    }

    public static int getMaxPosition(int[] arr, int low, int high) {
        int maxPos = 0;
        int maxValue;

        if ((arr == null) || (arr.length < 1)) return -1;
        if ((low < 0) || (high > arr.length -1) || (low > high)) {
            return -1;
        }
        maxValue = arr[low];
        for (int i = low +1; i <= high; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
                maxPos = i;
            }
        }
        return maxPos;
    }


}
