import java.util.Arrays;

public class countingSort{

       // Counting Sort Big O  =  O of n - NOT STABLE & you are making assumptions about the data
       // More efficient with smaller rangers of numbers ( min & max )

    public static void main(String[] args) {
               int[] intArray = { 10, 7, 5, 2, 2, 7, 8, 8, 9, 2, 1, 1, 2, 1, 0, 10, 8, 7, 4, 5}; // good data to use counting on
      //   int[] intArray = { 20, 35, -15, 7, 55, 1, -22};  // not best data to use counting sort
        countingSort(intArray, 0, 10);
        System.out.println(Arrays.toString(intArray));
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
}