package collectionsframework;
import java.util.ArrayList; 
public class arraylistsimple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		ArrayList a = new ArrayList();
		System.out.println("Arraylist accepting all types of elements"); 
		a.add(10); // index 0
		a.add('A'); // // index 1
		a.add("Arraylist"); // index 2
		a.add(5.25); // index 3
		System.out.println("Size of the arraylist "+a.size());
		a.add(true); // index 4
		a.add(false); // index 5
		System.out.println("Size of the arraylist "+a.size());
		for (int i=0; i<a.size();i++)
		{
			System.out.print("Element at index " +i +": ");
			System.out.println(a.get(i));
		}
		
		System.out.println("**************Arraylist accepting only integer elements*************************");
		ArrayList <Integer> b = new ArrayList<Integer>();        
		b.add(20); // index 0
		//b.add('A');  index 1 - the error at inserting the element at this index shows that this arraylist cannot store character values 
		//b.add("Arraylist"); index 2 - the error at inserting the element at this index shows that this arraylist cannot store string values
		
		System.out.println("**************Arraylist accepting only character elements*************************");
		ArrayList <Character> c = new ArrayList<Character>();        
		c.add('B'); // index 0
		//c.add(10);  index 1 - the error at inserting the element at this index shows that this arraylist cannot store integer values 
		//b.add("Arraylist"); index 2 - the error at inserting the element at this index shows that this arraylist cannot store string values
        
		System.out.println("**************Arraylist accepting only string elements*************************");
		ArrayList <String> d = new ArrayList<String>();        
		d.add("Arraylist"); // index 0
		//d.add(10);  index 1 - the error at inserting the element at this index shows that this arraylist cannot store integer values 
		//d.add('A'); index 2 - the error at inserting the element at this index shows that this arraylist cannot store character values

		System.out.println("**************USE OF addALL() method*************************");
		a.addAll(b);
		for (int i=0; i<a.size();i++)
		{
			System.out.print("Element at index " +i +": ");
			System.out.println(a.get(i));
		}
		
		System.out.println("**************USE OF removeALL() method*************************");
		a.removeAll(b);
		for (int i=0; i<a.size();i++)
		{
			System.out.print("Element at index " +i +": ");
			System.out.println(a.get(i)); 
		}
	    
		System.out.println("**************USE OF retainALL() method*************************");
		a.retainAll(d); 
		for (int i=0; i<a.size();i++)
		{
			System.out.print("Element at index " +i +": ");
			System.out.println(a.get(i)); 
		}
	}

}
