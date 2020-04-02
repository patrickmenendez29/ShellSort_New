
public class Shell {
    public static String sort(int arr[])
    {
        int n = arr.length;


        for (int leap = n/2; leap > 0; leap /= 2)
        {

            for (int i = leap; i < n; i += 1)
            {

                int temp = arr[i];


                int j;
                for (j = i; j >= leap && arr[j - leap] > temp; j -= leap)
                    arr[j] = arr[j - leap];


                arr[j] = temp;
            }
        }

        String result = "[";

        for(int i = 0; i <arr.length; i++){
            result += String.format("%s",arr[i]);
            if (i < arr.length - 1){
                result += ",";
            }
        }
        result += "]";

        return result;

    }
}
