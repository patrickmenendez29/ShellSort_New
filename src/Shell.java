import java.util.ArrayList;

public class Shell {

    public static int[] sort(int[] arr)
    {

        shellSort(arr);

        return insertionSort(arr);

    }


    private static void shellSort(int[] arr){

        int gap = arr.length / 2;

        for (int i = 0; i < arr.length - 1; i++){

            if (arr[i] > arr[gap]){
                int temp = arr[i];
                arr[i] = arr[gap];
                arr[gap] = temp;

            }

        }

    }


    private static int[] insertionSort(int[] arr)
    {

        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;

            }

            arr[j + 1] = key;
        }

        return arr;

    }
}
