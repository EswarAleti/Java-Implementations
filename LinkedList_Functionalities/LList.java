class LList
{
    Node head;
    //Constructor
    LList()
    {
        this.head=null;
    }
    public void addFirst(int value)
    {
        System.out.println("Adding "+value+" to the first of the list");
        //Creating a new node
        Node newNode=new Node(value);
        //Append head to next of it
        newNode.next=this.head;
        //make it as head
        this.head=newNode;
    }
    public int size()
    {
        Node temp=this.head;
        int counter=0;
        //Traverse entire list
        while(temp!=null)
        {
            //increment counter by 1
            counter++;
            //Move to next node
            temp=temp.next;
        }
        //return the counter
        return counter;
    }
    public int get(int index)
    {
        Node temp=this.head;
        int counter=0;
        while(temp!=null)
        {
            //If index found then return the value
            if(counter==index)
            {
                return temp.value;
            }
            counter++;
            temp=temp.next;
        }
        //We come here if index not found
        System.out.print("Index not found");
        return -9999;
    }
    public void removeFirst()
    {
        //If list is empty
        if(head==null)
        {
            System.out.println("List is empty, can't delete first");
            return;
        }
        System.out.println("Removing first...!");
        Node temp=this.head;
        //Move head to next
        this.head=this.head.next;
        //make temp to null i.e. freeing the space
        temp=null;
    }
    public String toString()
    {
        Node temp=this.head;
        String result="";
        while(temp!=null)
        {
            //add value to result string
            result+=temp.value+",";
            temp=temp.next;
        }
        //return result by eliminating last comma operator
        return result.substring(0,result.length()-1);
    }
    public void insert(int index, int value)
    {
        System.out.print("Inserting "+value+" at index "+index+": ");
        Node newNode=new Node(value);
        //index=0 means adding to first of list
        if(index==0)
        {
            addFirst(value);
            return;
        }
        int counter=1;
        Node temp=this.head;
        //Iterate until index found or list ends
        while(temp.next!=null && counter<index)
        {
            temp=temp.next;
            counter++;
        }
        //If index not found
        if(counter!=index)
        {
            System.out.println("Index not found!");
            return;
        }
        System.out.println("Success");
        //Append temp.next to the newNode.next
        newNode.next=temp.next;
        //Append newNode.next to the temp.next
        temp.next=newNode;
    }
    public void addLast(int value)
    {
        System.out.println("Adding "+value+" to the last of the list");
        Node newNode=new Node(value);
        //If list is empty then make it as head
        if(this.head==null)
        {
            head=newNode;
            return;
        }
        Node temp=this.head;
        //Find last node
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        //Add newNode next to the last node
        temp.next=newNode;
    }
}
