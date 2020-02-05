class Queue
{
	private Node front, rear;
	private int size;
	//Constructor
	Queue()
	{
		this.front=null;
		this.rear=null;
		this.size=0;
	}

	void enqueue(int data)
	{
		//Increment size by 1
		size++;

		//Create new Node
		Node newNode=new Node(data);
		//If Queue is empty then newNode is the front and rear
		if(isEmpty())
		{
			this.front=newNode;
			this.rear=newNode;
			return;
		}
		//If Queue is not empty, then append newNode to the rear and make it as rear
		this.rear.next=newNode;
		this.rear=newNode;
	}

	void dequeue()
	{
		//If Queue is empty dequeue is not possible
		if(isEmpty())
		{
			System.out.println("Queue is empty");
			return;
		}
		//Decrement size by 1
		size--;
		Node dummy=this.front;
		//Move front to next
		this.front=this.front.next;
		//Deleting the node
		dummy=null;
		//If Queue becomes empty then change rear to null
		if(this.front==null)
		{
			this.rear=null;
		}
	}

	int front()
	{
		//If Queue is empty then there is not front
		if(isEmpty())
		{
			System.out.println("Queue is empty");
			return -1;
		}
		//Else return data of front
		return this.front.data;
	}

	boolean isEmpty()
	{
		//Return true if Empty, false otherwise
		return this.rear==null;
	}

	int size()
	{
		//Return size
		return this.size;
	}
}