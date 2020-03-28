public class SumRecursiveDemo 
{
	public static int sum(int m , int n) 
	{
		if(n==0)
			return m;
		else if(n<0)
		{
			return sum(m,n+1)-1;
		}
		return sum(m, n - 1)+1;
	}
	public static void main(String[] args) 
	{
		System.out.println("sum(11, 5) : " + sum(11, 5));
		System.out.println("sum(42, -4) : " + sum(42, -4));
		System.out.println("sum(11, 0) : " + sum(11, 0));
	}
}