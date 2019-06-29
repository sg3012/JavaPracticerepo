package collectionsframework;
import java.util.ArrayList;
import java.util.Iterator;
public class arraylistiterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 machine laptop  = new machine(); 
		 machine tab  = new machine();
		 machine smartphone  = new machine();
		 laptop.laptop(001, "Laptop","Dell"); 
		 tab.tab(002, "Tab","Dell");
		 smartphone.smartphone(003, "smartphone","Dell");
		ArrayList<machine> hold = new ArrayList<machine>();  
		hold.add(laptop);
		hold.add(tab);
		hold.add(smartphone);
		
		/*below lines of code shows the use of Iterator class to traverse the values stored in this arraylist storing other 
		   machine's Objects. */
		Iterator<machine> a = hold.iterator(); 
		while (a.hasNext())
		{
			machine b =a.next();
			System.out.println(b.SKU);
			System.out.println(b.type);
			System.out.println(b.company);
			
		}
	}

}
