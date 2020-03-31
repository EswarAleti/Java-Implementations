import java.util.Scanner;
import java.util.Random;
public class SelectionSort
{
	//Implementation of selectionSort and it'll return the number of swaps
	public static int selectionSort(int[] arr)
	{
		int swap=0;
		for(int i=0;i<arr.length-1;i++)
		{
			int min=i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]<arr[min])
				{
					min=j;
				}
			}
			if(min!=i)
			{
				swap++;
				int temp=arr[min];
				arr[min]=arr[i];
				arr[i]=temp;
			}
		}
		return swap;
	}
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter number n: ");	
		int n = scanner.nextInt();
		Random rand=new Random();
		int range=n*10;
		long total_time=0;

		for(int i=0;i<1000;i++)
		{
			int[] arr=new int[n];
			for(int j=0;j<n;j++)
			{
				arr[j] = rand.nextInt(range);
			}
			long start_time=System.currentTimeMillis();
			selectionSort(arr);
			long end_time=System.currentTimeMillis();
			total_time+=(end_time-start_time);
		}
		System.out.println("\nNumber of items sorted: "+n);
		System.out.println("\nThe average running time for each array: "+total_time/1000.0+" milli seconds");
	}
}