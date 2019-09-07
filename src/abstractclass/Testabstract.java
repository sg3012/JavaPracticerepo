package abstractclass;

abstract class Animal {
	String type;     // Non-static variables could be declared in the abstract class
	final int legs = 4; // Final variables could be declared in the abstract class
	static boolean canthink = false; //Static variables could be declared in the abstract class

public abstract void color(); 

public void eat () {
	System.out.println("Animal eats");
   }

public void run () {
	System.out.println("Animal runs");
   }

}

class Tiger extends Animal {
	
	public void color()     /*Definition of the abstract method color is 
	                           is given in the child class. */
	{
		System.out.println("Tiger's color Yellow");
	}
	
}


public class Testabstract {
	public static void main (String args[])
	{
		Tiger tg = new Tiger();
		tg.color();
		tg.eat();
		tg.run();
		
		Animal an = new Tiger();
		an.color();
		an.eat();
		an.run();
		
				
		
	}
}