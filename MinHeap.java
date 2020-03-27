class MinHeap
{
	//heapify
	public static void heapify(int[] heap, int i, int heapSize)
	{
		int left=3*i+1;
		int mid=3*i+2;
		int right=3*i+3;
		int smallest = i;

		//find index of smalles node aomng parent and its children
		if(left<heapSize && heap[left]<heap[i])
		{
			smallest=left;
		}
		if(mid<heapSize && heap[mid]<heap[smallest])
		{
			smallest=mid;
		}
		if(right<heapSize && heap[right]<heap[smallest])
		{
			smallest=right;
		}
		//If one of its children is smalles than parent
		if(smallest!=i)
		{
			//swap parent node with smallest
			int temp=heap[i];
			heap[i]=heap[smallest];
			heap[smallest]=temp;
			heapify(heap,smallest,heapSize);
		}
	}

	public static void buildHeap(int[] heap,int heapSize)
	{
		//first non leaf node exist at heapSize/3
		//heapify from first non leaf node to root
		for(int i=heapSize/3;i>=0;i--)
		{
			heapify(heap,i,heapSize);
		}
	}

	public static void displayHeap(int[] heap,int heapSize)
	{
		//printing heap
		for(int i=0;i<heapSize;i++)
		{
			System.out.print(heap[i]+" ");
		}
	}

	public static int deleteMin(int[] heap,int heapSize)
	{
		//if heap is empty
		if(heapSize==0)
		{
			return 0;
		}
		//replace root with last node
		System.out.println("\nDeleting min...!");
		heap[0]=heap[heapSize-1];
		//decrease heap size]
		heapSize--;
		//call heapify on root
		heapify(heap,0,heapSize);
		return heapSize;
	}

	public static void main(String[] args) 
	{
		//random heap
		int[] heap = {21,25,28,14,9,6,2,8,4,5,1,3,10,7,11,16,13,17,18};
		int heapSize=heap.length;
		//call build heap
		buildHeap(heap,heapSize);
		System.out.print("\nHeap is: ");
		displayHeap(heap,heapSize);
		System.out.println("\nSize of heap: "+heapSize);
		//call deleteMin() and update heapSize
		heapSize = deleteMin(heap,heapSize);
		System.out.print("\nHeap is: ");
		//display heap after deleting min
		displayHeap(heap,heapSize);
		System.out.println("\nSize of heap: "+heapSize);
	}
}