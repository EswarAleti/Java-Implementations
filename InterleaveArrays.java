class Homework3Methods
{
	public static void main(String[] args) 
	{
		int[] arr=interleaveArrays(new int[]{2,3,4,5}, new int[]{10},1,10);
		if(arr==null)
		{
			System.out.println("null");
		}
		else
		{
			int i;
			System.out.print("[");
			for(i=0;i<arr.length-1;i++)
			{
				System.out.print(arr[i]+", ");
			}
			System.out.print(arr[i]+"]");
		}
	}
	public static int[] interleaveArrays(int[] array1,int[] array2,int stride, int maxElements)
	{
		if(stride<=0 || maxElements<=0)
			return null;
		//Initialize arr with minimum of (maxElements, total number of elements in both the arrays) 
		int[] arr;
		if((array1.length + array2.length)<maxElements)
			arr=new int[array1.length + array2.length];
		else
			arr=new int[maxElements];
		//index refers the index of arr
		//i refers index of array1
		//j refers index of array2
		//turn refers which array gets turn initially we take values from array1 so turn=1
		int index=0,turn=1,i=0,j=0;
		//Iterate untill maxElements found or both the arrays became empty
		while(index<maxElements && (i<array1.length || j<array2.length))
		{
			if(turn==1)
			{
				int temp=stride;
				//iterate untill stride number of elements collected or array became empty
				while(temp!=0 && i<array1.length)
				{
					//assign elements and increment both the indices
					arr[index++]=array1[i++];
					//decrement temp
					temp--;
				}
				//make turn=2
				turn=2;
			}
			else
			{
				int temp=stride;
				//iterate untill stride number of elements collected or array became empty
				while(temp!=0 && j<array2.length)
				{
					//assign elements and increment both the indices
					arr[index++]=array2[j++];
					//decrement temp
					temp--;
				}
				//make turn=1
				turn=1;
			}
		}
		//return arr
		return arr;
	}
}