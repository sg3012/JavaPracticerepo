package this_super_constructor;

public class superwithmethodandvariables {

	int a = 10;

	public void method1() {
    System.out.println("------------------method1() of parent class---------------");
	}
}

class super_child1 extends superwithmethodandvariables {
	int a = 10;
	
	public void method1() {
	 System.out.println("------------------method1() of child class---------------");
    this.method1();	
	}
	
	public void method2() {
		System.out.println("parent class a: "+super.a);
		super.method1();
	}
	
 public static void main (String args[]) {
	super_child1 b1 = new super_child1();
    b1.method2(); 
 
 }
}
