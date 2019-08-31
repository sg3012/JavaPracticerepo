
public class Singleton {
  private static Singleton ref = null; 
  public String s; 
   private Singleton()
   { 
	s="Singleton Design pattern";
   } 
   
   public static Singleton getInstance()
   {
	   if (ref==null)
	   ref = new Singleton();
	   return ref; 
   }
public static void main(String[] args) {
		// TODO Auto-generated method stub
	Singleton a = Singleton.getInstance();
	Singleton b = Singleton.getInstance();
	Singleton c = Singleton.getInstance();
	a.s=(a.s).toUpperCase();
	System.out.println("a.s: "+a.s);
	System.out.println("b.s: "+b.s);
	System.out.println("c.s: "+c.s);
	
	c.s=(c.s).toLowerCase();
	System.out.println();
	System.out.println("a.s: "+a.s);
	System.out.println("b.s: "+b.s);
	System.out.println("c.s: "+c.s);
	}

}
