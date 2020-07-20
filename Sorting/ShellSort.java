import java.util.Arrays;

public class ShellSort {

    public static void main(String[] args) {
        int[] intArray = { 875, 125, 20, 35, -15, 7, 55, 27544, 1, 0 ,1,
                          -47584, -22, 50, -85000,87, 92, -25, 125, 85,
                          -54632, };
        System.out.println(Arrays.toString(shellSort(intArray)));
        System.out.println(Arrays.toString(shellKunthSort(intArray)));
    }

    public static int[] shellSort (int[] array) {

        for (int gap = array.length/2; gap > 0; gap/=2){

            for(int i = gap; i < array.length; i++) {

                int newElement = array[i];
                int j = i;
                while (j >= gap && array[j - gap] > newElement) {

                    array[j] = array[j - gap];
                    j -= gap;
                }
                array[j] = newElement;
            }
        }
        return array;
    }


    public static int[] shellKunthSort(int[] array) {

        int gap = 1;
        for (gap = 3*gap+1; gap > 0; gap/=3){

            for(int i = gap; i < array.length; i++) {
                
                int newElement = array[i];
                int j = i;
                while (j >= gap && array[j - gap] > newElement) {
                    
                    array[j] = array[j - gap];
                    j -= gap;
                }
                array[j] = newElement;
            }
        }
        return array;
    }
}