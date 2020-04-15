import java.util.ArrayList;

public class Shell {

    public static ArrayList<Integer> sort(int[] arr)
    {
        ArrayList<Integer> result = new ArrayList<>();

        int gap = result.size() / 2;

        while (gap > 1){

            shellSort(gap, arr);

            gap--;
        }

        insertionSort(arr);


        return result;

    }


    private static void shellSort(int gap, int[] arr){

        
    }


    private static void swap(Integer a, Integer b){
        Integer temp = a;
        a = b;
        b = temp;
    }

    private static void insertionSort(int arr[])
    {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}
