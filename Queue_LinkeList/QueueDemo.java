class QueueDemo
{
	public static void main(String[] args) 
	{
		//Creating object
		Queue q = new Queue();

		//Accessing queue methods
		int front=q.front();
		if(front!=-1)
		{
			System.out.println("Front of queue: "+q.front());
		}
		System.out.println("Size of the queue: "+q.size());
		System.out.println("Queue is empty? "+q.isEmpty());

		q.enqueue(10);
		front=q.front();
		if(front!=-1)
		{
			System.out.println("Front of queue: "+q.front());
		}
		System.out.println("Size of the queue: "+q.size());
		System.out.println("Queue is empty? "+q.isEmpty());

		q.enqueue(20);
		front=q.front();
		if(front!=-1)
		{
			System.out.println("Front of queue: "+q.front());
		}
		System.out.println("Size of the queue: "+q.size());
		System.out.println("Queue is empty? "+q.isEmpty());
		
		q.dequeue();
		front=q.front();
		if(front!=-1)
		{
			System.out.println("Front of queue: "+q.front());
		}
		System.out.println("Size of the queue: "+q.size());
		System.out.println("Queue is empty? "+q.isEmpty());

		q.dequeue();
		front=q.front();
		if(front!=-1)
		{
			System.out.println("Front of queue: "+q.front());
		}
		System.out.println("Size of the queue: "+q.size());
		System.out.println("Queue is empty? "+q.isEmpty());
	}	
}