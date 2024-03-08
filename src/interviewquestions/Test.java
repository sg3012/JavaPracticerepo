package src.interviewquestions;

// What will the O/P of the following code

class Derived
{
	public void getDetails(String temp)
	{
		System.out.println("Derived class " + temp);
	}
}

public class Test extends Derived
{
//	public int getDetails(String temp) // Compilation Error return type is incompatible 
//	                                   // with Derived.getDetails()
//	                                   // when we are overriding a method
//	                                   // the return type of both the methods should be same
//	{
//		System.out.println("Test class " + temp);
//		return 0;
//	}
	public static void main(String[] args)
	{
		Test obj = new Test();
		obj.getDetails("GFG");
	}
}

