class LListDemo
{
    public static void main (String[] args) 
    {
        //Object creation and testing functionalities
        LList list=new LList();
        list.addFirst(40);
        list.addFirst(30);
        list.addFirst(20);
        list.addFirst(10);
        System.out.println("Elements of list: "+list.toString());
        System.out.println("Size of list: "+list.size());
        System.out.println("Element at index 2: "+list.get(2));
        list.addLast(50);
        System.out.println("Elements of list: "+list.toString());
        System.out.println("Size of list: "+list.size());
        System.out.println("Element at index 4: "+list.get(4));
        list.removeFirst();
        System.out.println("Elements of list: "+list.toString());
        System.out.println("Size of list: "+list.size());
        list.insert(2,10);
        System.out.println("Elements of list: "+list.toString());
        System.out.println("Size of list: "+list.size());
        list.insert(6,10);
    }
}
