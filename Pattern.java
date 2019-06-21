public boolean isCircular()
{
	Node<E> current=first;
	while(current!=null)
	{
		if(current.getNext()==first)
		{
			return true;
		}
		current=current.getNext();
	}
	return false;
}