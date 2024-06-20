package src.interviewquestions;

// What will the o/p of the following program

class Base
{
	public static String s = " Super Class ";
	public Base()
	{
		System.out.printf("1");
	}
}
public class Derived2 extends Base
{
	public Derived2()
	{
		System.out.printf("2");
		// super(); // COMPILATION ERROR AT THIS LINE THAT
		// CONSTRUCTOR CALL MUST BE THE FIRST CALL
		// IN A FUNCTION
	}

	public static void main(String[] args)
	{
		Derived2 obj = new Derived2();
		System.out.printf(s);
	}
}
