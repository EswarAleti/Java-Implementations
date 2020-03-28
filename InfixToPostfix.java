import java.util.ArrayList;
import java.util.Stack;

/** * An algebraic expression class that has operations such as conversion from infix
* expression to postfix expression,
* and evaluation of a postfix expression
*/
public class InfixToPostfix 
{

	/** * The infix of this expression
	*/
	private String infix;

	/** * Constructs an expression using an infix.
	*/
	public Expression(String infix)
	{
		this.infix = infix;
	}

	/** * Converts an infix expression into a postfix expression.
	* Tokens of the postfix expression are stored in order in an
	* array list. The array list is returned.
	* return An array list of tokens of the postfix expression */
	public ArrayList<String> infixToPostfix()
	{

		Stack<String> stack = new Stack<>();
		ArrayList postFixString = new ArrayList<String>();
		for(int i = 0; i <infix.length();i++)
		{
			char ch = infix.charAt(i);

			// If the character is an empty space, skip the iteration.
			if(ch==' ')
				continue;

			// If the character is an operand, add it to arraylist.
			if((ch>=65 && ch<=90)||(ch>=97 && ch<=122))
				postFixString.add(ch);

			// If the character is an '(', push it to the stack.
			else if(ch == '(')
				stack.push(ch+"");

			//If the character is an ')', pop and output from the stack until an '(' is encountered.
			else if(ch == ')')
			{
				while (!stack.isEmpty() && !stack.peek().equals("("))
					postFixString.add(stack.pop());

				if (!stack.isEmpty() && !stack.peek().equals("("))
				{
					System.out.println("Invalid Expression");
					System.exit(0);
				} 
				else
					stack.pop();
			}
			// the character is an operator
			else 
			{
				while (!stack.isEmpty() && precedence(ch)<=precedence(stack.peek().charAt(0)))
				{
					if(stack.peek() == "(" )
					{
						System.out.println("Invalid Expression");
						System.exit(0);
					}
					postFixString.add(stack.pop());
				}
				stack.push(ch+"");
			}
		}
		//Pop all operators from stack
		while(!stack.isEmpty())
		{
			//Error entry
			if(stack.peek() == "(" )
			{
				System.out.println("Invalid Expression");
				System.exit(0);
			}
			postFixString.add(stack.pop());
		}
		//return the converted post fix expression after conversion.
		return postFixString;
	}

	//Method to determine the precedence while calculating the precedence of operators
	public int precedence(char ch)
	{
		switch(ch)
		{
			case '^': return 3;
			case '/':
			case '*': return 2;
			case '+':
			case '-': return 1;
		}
		return -1;
	}

	//Method to print the post fix expression
	public static void printPostfix(ArrayList arrayList)
	{
		for(Object object : arrayList)
			System.out.print(object.toString()+" ");
		System.out.println();
	}

	public static void main(String[] args) 
	{
		Expression expression = new Expression("A + B * C + D");
		printPostfix(expression.infixToPostfix());

		expression = new Expression("(A + B) * (C + D)");
		printPostfix(expression.infixToPostfix());

		expression = new Expression("A * B + C * D");
		printPostfix(expression.infixToPostfix());

		expression = new Expression("A * B + C * D");
		printPostfix(expression.infixToPostfix());
	}
}