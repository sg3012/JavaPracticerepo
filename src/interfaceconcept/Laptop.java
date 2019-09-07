package interfaceconcept;

public interface Laptop {
	final String Bodymaterial = "plastic"; // Final variables could be declared in the abstract class
	static int numberofUSBports = 4; // Static variables could be declared in the abstract class
	int handsfreeport = 1; // If we try to declare non-static variables in an interface they will be treated as static and final by default
public void takescreenshot();

public void minimize();

public void maximize();
}

class Mac implements Laptop {
	public void takescreenshot()
	
	{
	System.out.println("MAC -- Screenshot function");	
	}
	
	public void minimize()
	
    {
		System.out.println("MAC -- Minimize function");	
	}
	public void maximize()
	
    {
		System.out.println("MAC -- Maximize function");
	}
}

