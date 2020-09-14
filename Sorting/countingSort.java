import java.util.Arrays;

public class countingSort{

       // Counting Sort Big O  =  O of n - NOT STABLE & you are making assumptions about the data

    public static void main(String[] args) {
        int[] intArray = { 20, 35, -15, 7, 55, 1, -22};
        countingSort(intArray, -22, 55);
        System.out.println(Arrays.toString(insertionSort(intArray)));
    }

    public static void countingSort(int[] input, int min, int max) {
        int [] countArray = new int[(max-min) + 1];


        for (int i = 0; i < input.length; i++) {
            countArray[input[i] - min]++;
        }

        int j = 0;
        for (int i = min; i <= max; i++) {
            while (countArray[i - min] > 0) {
                input[j++] = i;
                countArray[i - min]--;
            }
        }

}