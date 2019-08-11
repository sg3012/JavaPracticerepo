package this_super_constructor;

public class Superwithconstructor {

	public Superwithconstructor() {
		System.out.println("---------Default const of parent class-----------------");
	}
	
	public Superwithconstructor(int i) {
		System.out.println("---------single param const of parent class-----------------"); 
		System.out.println("i: "+i);
	}
	
	
}

class Super_child extends Superwithconstructor {

	public Super_child(int i) {
		System.out.println("---------single param const of child class-----------------");
		System.out.println("i: " + i);
	}

	public Super_child() {
		super(10);
		System.out.println("---------default const of child class-----------------");
	}
	public static void main(String args[]) {
		Super_child a1 = new Super_child(10);
		Super_child a2 = new Super_child();
	}	
}
