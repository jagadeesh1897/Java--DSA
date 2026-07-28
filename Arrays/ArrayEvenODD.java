public class ArrayEvenODD 
{
    public static void main(String[] args)
	{
		int[] arr={1,2,3,4,5,6,7,8,9,10};
		int even=0;
		int odd=0;
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]%2==0)
			{
				even++;
			}
			else
			{
				odd++;
			}
		}
		System.out.println(even);
		System.out.println(odd);
	}
}

