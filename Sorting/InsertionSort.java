import java.util.Arrays;

public class InsertionSort{

       // Insertion Sort Big O  =  O of n squared - Quadratic time complexity

    public static void main(String[] args) {
        int[] intArray = { 20, 35, -15, 7, 55, 1, -22};
        System.out.println(Arrays.toString(insertionSort(intArray)));
    }

    public static int[] insertionSort(int[] array) {
        for (int firstUnsortedIndex = 1; firstUnsortedIndex < array.length;
             firstUnsortedIndex++) {
            int newElement = array[firstUnsortedIndex];
            int i;
            for (i = firstUnsortedIndex; i > 0 && array[i - 1] > newElement; i--) {
                array[i] = array[i - 1];
            }
            array[i] = newElement;
        }
        return array;
    }
}