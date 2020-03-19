class Sort
{
	//Function to swap the i,j index value of array
	public static void swap(int a[],int i,int j)
	{
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}

	public static void sort(int a[], int low, int high)
	{
		if(low<high)
		{
			int pivot = division(a,low,high);
			//In algorithm it was given as pivot but it should be pivot-1
			sort(a,low,pivot-1);
			sort(a,pivot+1,high);
		}
	}

	public static int division(int a[], int low, int high)
	{
		int pivot=a[low];
		int wall=low;
		for(int i=low+1;i<=high;i++)
		{
			if(a[i]<pivot)
			{
				swap(a,i,wall);
				wall++;
			}
		}
		//In algorithm it was given as swap(a,low,wall) but it should be a[wall]=pivot; 
		a[wall]=pivot;
		return wall;
	}

	//display() function is to display the content of array a
	public static void display(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) 
	{
		int[] a={15,2,6,18,42,23,45,12,16,19};
		System.out.print("Before sorting: ");
		display(a);
		//Call sort() function to sort the elements of array a
		sort(a,0,a.length-1);
		System.out.print("After sorting: ");
		display(a);	
	}
}