import java.util.Scanner;
import java.util.Random;
public class BubbleSort
{
	//Implementation of bubbleSort and it'll return the number of swaps
	public static int bubbleSort(int[] arr)
	{
		int swap=0;
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					swap++;
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
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
			bubbleSort(arr);
			long end_time=System.currentTimeMillis();
			total_time+=(end_time-start_time);
		}
		System.out.println("\nNumber of items sorted: "+n);
		System.out.println("\nThe average running time for each array: "+total_time/1000.0+" milli seconds");
	}
}