package collectionsframework;
import java.util.LinkedList;
import java.util.Iterator;

public class Linkedlistsimple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*****************LinkedList accepting all types of elements**************");
    LinkedList l1 = new LinkedList();
    l1.add(1); //Index2
    l1.add("L"); //Index3
    l1.add("Collections Framework Linkedlist");//Index4
    l1.add(2.599); //Index5
    l1.add(true); //Index6
	l1.add(false);//Index7
	
	System.out.println("Elements in the linkedlist: " +l1);
	System.out.println("Size of this Linkedlist is: "+l1.size());
	System.out.println("**********************Adding elements from the start *************************");     
	l1.addFirst("QA"); //Index1
	l1.addFirst("Shubham"); //Index0
	System.out.println("Elements in the linkedlist: " +l1);
	System.out.println("**********************Adding elements from the last *************************");     
	l1.addLast("Element");////Index8
	l1.addLast("added");//Index9
	System.out.println("Elements in the linkedlist: " +l1);
	
	System.out.println("*****************Printing the element at a particular index *****************");
	System.out.println(l1.get(1));
	
	System.out.println("*****************Updating the element at a particular index *****************");
	l1.set(4,"has created a linkedlist"); 
	System.out.println(l1.get(4));
	System.out.println("Elements in the linkedlist: " +l1);
	
	System.out.println("**************Linkedlist accepting only integer elements*************************");
	LinkedList <Integer> l2 = new LinkedList<Integer>();        
	l2.add(20); // index 0
	//l2.add('A');  index 1 - the error at inserting the element at this index shows that this Linkedlist cannot store character values 
	//l2.add("Linkedlist"); index 2 - the error at inserting the element at this index shows that this Linkedlist cannot store string values
	System.out.println("Elements in the linkedlist: " +l2);
	
	System.out.println("**************Linkedlist accepting only character elements*************************");
	LinkedList <Character> l3 = new LinkedList<Character>();        
	l3.add('B'); // index 0
	//l3.add(10);  index 1 - the error at inserting the element at this index shows that this Linkedlist cannot store integer values 
	//l3.add("Linkedlist"); index 2 - the error at inserting the element at this index shows that this Linkedlist cannot store string values
	System.out.println("Elements in the linkedlist: " +l3);
    
	System.out.println("**************Linkedlist accepting only String elements*************************");
	LinkedList <String> l4 = new LinkedList<String>();        
	l4.add("Here"); // index 0 
	l4.add("Is"); // index 1
	l4.add("A"); // index 2
	l4.add("LinkedList"); // index 3
	l4.add("For"); // index 4
	l4.add("You");// index 5
	//l4.add(10);  index 1 - the error at inserting the element at this index shows that this arraylist cannot store integer values 
	//l4.add('A'); index 2 - the error at inserting the element at this index shows that this arraylist cannot store character values
	System.out.println("Elements in the linkedlist: " +l4);
	
	System.out.println("**************Removing elements from 0th Index*************************");
	l1.removeFirst(); 
	System.out.println("Elements in the linkedlist: " +l1);
	
	System.out.println("**************Removing elements from last Index*************************");
	l1.removeLast(); 
	System.out.println("Elements in the linkedlist: " +l1);
	
	System.out.println("**************PRINTING ELEMENTS USING FOR LOOP*************************");
	for (int i =0 ; i<l1.size(); i++)
	{
		System.out.print(l1.get(i) +"  ");	
	}
	System.out.println();
	
	System.out.println("**************PRINTING ELEMENTS USING ENHANCED FOR LOOP*************************");
	for (String s:l4)
	{
		System.out.print(s +" ");	
	}
	System.out.println();
	
	System.out.println("**************PRINTING ELEMENTS USING ITERATOR*************************");
	Iterator <String> ref = l4.iterator();  
	 while(ref.hasNext())
	 {
		 System.out.print(ref.next() +"  ");
	 }
	 System.out.println(); 
	
	System.out.println("**************PRINTING ELEMENTS USING WHILE LOOP*************************");
		int j =0; 
		while (l1.size()>j)
		{
			System.out.print(l1.get(j) +"  ");	
			j++; 
		} 

	}
	
   
}
