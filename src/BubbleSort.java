public class BubbleSort
{
    public static void sort(int [] array)
    {
        for (int i = 0; i < array.length-1; i++)
        {
            for (int j = 0; j < array.length-1; j++) {

            }
         if(array[i]>array[i+1])
         {
           swap(array,i);
         }
        }
    }

    private static void swap(int [] array , int i)
    {
        int temp = array[i];
        array[i]=array[i+1];
        array[i+1]=temp;
    }
}
