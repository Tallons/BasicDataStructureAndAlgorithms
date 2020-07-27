import java.util.Arrays;

   // Selection Sort Big O  =  O (n log n)  - logarithmic time complexity 
   // This sort method is UNSTABLE
   // In-place Algorithm

public class QuickSort {

    public static void main(String[] args) {
        int[] intArray = { 875, 145, 85411124, 20, 35, -15, 7, 55, 27544, 1, 0 ,1,
                -47584, -22, 50, -85000,87, 92, -25, 135, 85,
                -54632, 8500, 1, 7548, -25448751, 45, -1, -7854, 12, 89, 1 };
        quickSort(intArray, 0, intArray.length);
        System.out.println(Arrays.toString(intArray));
    }

    public static void quickSort(int[] array, int start, int end) {
        if (end - start < 2) {
            return;
        }
        int pivotIndex = partition(array, start, end);
        quickSort(array, start, pivotIndex);
        quickSort(array, pivotIndex + 1, end);
    }

    public static int partition (int[] array, int start, int end) {
       int pivot = array[start];
       int i = start;
       int j = end;

       while (i < j) {

           while (i < j && array[--j] >= pivot);
           if (i < j) {
               array[i] = array[j];
           }

           while (i < j && array[++i] <= pivot);
           if (i < j) {
               array[j] = array[i];
           }
       }
            array[j] = pivot;
           return j;
    }

}