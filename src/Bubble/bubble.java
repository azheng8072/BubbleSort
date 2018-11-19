package Bubble;

public class bubble {
    public static void bubbleSort(int[ ] arr)
    {
        for (int x = 0; x < arr.length; x++)
        {
            for (int i = 0; i < arr.length-1; i++)
            {
                if(arr[i] > arr[i+1])
                {
                    int temp = arr[i + 1];
                    arr[i+1] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
}
