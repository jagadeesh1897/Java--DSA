import java.util.*;
class arraylastzeros
{
	public static void main(String[] args)
	{
		int[] arr={1,2,0,3,0,0,5,6,8};
		int[] arr1=new int[arr.length];
		int count=0;
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]!=0)
			{
				 arr1[count]=arr[i];
				count++;
			}
		}
		System.out.println(Arrays.toString(arr1));
	}
}
		