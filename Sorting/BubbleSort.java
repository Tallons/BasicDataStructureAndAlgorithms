import java.util.Arrays;

public class BubbleSort {

   // Bubble Sort Big O  =  O of n squared - Quadratic time complexity

    public static void main(String[] args) {

//        int[] intArray = new int[7];
//
//        intArray[0] = 20;
//        intArray[1] = 35;
//        intArray[2] = -15;
//        intArray[3] = 7;
//        intArray[4] = 55;
//        intArray[5] = 1;
//        intArray[6] = -22;

        int[] intArray = { 20, 35, -15, 7, 55, 1, -22};

        System.out.println(findIndex(intArray, 7));      // O (n)

        System.out.println(Arrays.toString(bubbleSort(intArray)));   // O of n squared - Quadratic time complexity

    }

    public static int findIndex(int[] array, int num)  {
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                index = i;
                break;
            }
        }
        return index;
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