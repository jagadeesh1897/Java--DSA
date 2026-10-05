class ArraySecondLargest
{
  public static void main(String[] args)
  {
	  int[] arr={1,2,3,4,5,6,7,8};
	  int largest=arr[0];
	  int secondLargest=arr[0];
	  
	  for(int i=0;i<arr.length;i++)
	  {
		  if(arr[i]>largest)
		  {
			 secondLargest=largest;
			 largest=arr[i]; 
		  }
	  }
	  System.out.println("Largest number in array "+largest);
	  System.out.println("secondLargest number in array "+secondLargest);
  }
}