import java.util.Arrays;

public class BubbleSort {

   // Bubble Sort Big O  =  O of n squared - Quadratic time complexity

    public static void main(String[] args) {

        int[] intArray = { 20, 35, -15, 7, 55, 1, -22};

        System.out.println(Arrays.toString(bubbleSort(intArray)));   // O of n squared - Quadratic time complexity

    }


    public static int[] bubbleSort(int[] array) {
        for (int lastUnsortedIndex = array.length - 1; lastUnsortedIndex > 0;
        lastUnsortedIndex--) {
            for (int i = 0; i < lastUnsortedIndex; i++){
                if (array[i] > array[i + 1]){
                    swap(array, i, i + 1);
                }
            }
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