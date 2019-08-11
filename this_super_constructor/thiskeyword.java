package this_super_constructor;

public class thiskeyword {
	static int j;
	int num1;
	int num2;

	public thiskeyword(int num1, int num2) {
		System.out.println("num1: " + num1 + "  " + "num2: " + num2);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thiskeyword obj = new thiskeyword(10, 10);
		System.out.println("num1: " + obj.num1 + "  " + "num2: " + obj.num2);

	}

}
