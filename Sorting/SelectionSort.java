import java.util.Arrays;

public class SelectionSort {

   // Selection Sort Big O  =  O of n squared - Quadratic time complexity 
   // This sort method is UNSTABLE

    public static void main(String[] args) {

        int[] intArray = { 20, 35, -15, 7, 55, 1, -22};

        System.out.println(Arrays.toString(selectionSort(intArray)));

    }


    public static int[] selectionSort(int[] array) {
        for (int lastUnsortedIndex = array.length - 1; lastUnsortedIndex > 0;
        lastUnsortedIndex--) {
            int indexOfLargestNum = 0;
            for (int i = 1; i <= lastUnsortedIndex; i++){
                if (array[i] > array[indexOfLargestNum]){
                    indexOfLargestNum = i;
                }
            }
            swap(array, indexOfLargestNum, lastUnsortedIndex);
        }
        return array;
    }

    public static void swap(int[] array, int i, int j ){
        if (i == j) {
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}