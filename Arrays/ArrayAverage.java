public class ArrayAverage 
{
    public static void main(String[] args)
	{

        int[] arr = {10, 20, 30, 40, 50}; // sample array
        int sum = 0;

        // Calculate sum
        for (int i = 0; i < arr.length; i++) 
		{
            sum += arr[i];
        }

        // Calculate average
        double average =  sum / arr.length;

        // Print the result
        System.out.println("Average of array = " + average);
    }
}
