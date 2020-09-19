import java.util.Arrays;

   // Selection Sort Big O  =  O (n log n)  - logarithmic time complexity 
   // This sort method is Stable
   // NOT In-place Algorithm (requires more memory)

public class MergeSort {

    public static void main(String[] args) {
        int[] intArray = { 875, 125, 20, 35, -15, 7, 55, 27544, 1, 0 ,1,
                -47584, -22, 50, -85000,87, 92, -25, 125, 85,
                -54632, };
        mergeSort(intArray, 0, intArray.length);
        System.out.println(Arrays.toString(intArray));
    }

    public static void mergeSort(int[] array, int start, int end) {

        if (end - start < 2){
            return;
        }
        int mid = (start + end) / 2;
        mergeSort(array, start, mid);
        mergeSort(array, mid, end);
        merge(array, start, mid, end);
    }

    public static void merge(int[] array, int start, int mid, int end){

        if (array[mid - 1] <= array[mid]){
            return;
        }

        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] temp = new int[end - start];
        while (i < mid && j < end){
            temp[tempIndex++] = array[i] <= array[j] ? array[i++]: array[j++];
        }

        System.arraycopy(array, i, array, start + tempIndex, mid - i);
        System.arraycopy(temp, 0, array, start, tempIndex);

    }
}
