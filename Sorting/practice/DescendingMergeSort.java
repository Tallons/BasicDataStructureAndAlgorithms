import java.util.Arrays;

public class DescendingMergeSort {

    public static void main(String[] args) {
        int[] intArray = {875, 145, 85411124, 20, 35, -15, 7, 55, 27544, 1, 0, 1,
                -47584, -22, 50, -85000, 87, 92, -25, 135, 85,
                -54632, 8500, 1, 7548, -25448751, 45, -1, -7854, 12, 89, 1};
            descendingMergeSort(intArray, 0, intArray.length);
        System.out.println(Arrays.toString(intArray));
    }

    public static void descendingMergeSort(int[] array, int start, int end) {

        if (end - start < 2) {
            return;
        }

        int mid = (start + end) / 2;
        descendingMergeSort(array, start, mid);
        descendingMergeSort(array, mid, end);
        merge(array, start, mid, end);
    }

    public static void merge(int[] array, int start, int mid, int end) {
        if (array[mid-1] >= array[mid]) {
            return;
        }
        int i = start;
        int j = mid;
        int tempIndex = 0;
        int[] temp = new int[end - start];
        while ( i < mid && j < end) {
            temp[tempIndex++] = array[i] >= array[j] ? array[i++] : array[j++];
        }

        System.arraycopy(array, i, array, start + tempIndex, mid - i);
        System.arraycopy(temp, 0, array, start, tempIndex);
    }
}
