public class ArrayFindIndex 
{
    public static void main(String[] args)
	{

        int[] arr = {10, 20, 30, 40, 50}; // sample array
        int target = 30;                 // element to search
        int index = -1;                  // default value if not found

        // Linear search
        for (int i = 0; i < arr.length; i++)
			{
            if (arr[i] == target) 
			{
                index = i;
                break;
            }
        }

        if (index != -1) 
		{
            System.out.println("Element found at index: " + index);
        } else 
		{
            System.out.println("Element not found in the array.");
        }
    }
}
