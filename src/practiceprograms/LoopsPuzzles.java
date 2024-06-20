package src.practiceprograms;

public class LoopsPuzzles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 1, j;

		// Puzzle 1:
		System.out.println("******** PUZZLE 1 **********");
		for (; i <= 10; i++) {
			;
		}
		// What will be the O/P of below statement
		System.out.println("i:" + i);// O/P is 11. Why? because when we put
		// a semicolon right after a for loop
		// it is considered a empty/blank statement
		// so it will be executed 10 times until i becomes 11

		// Puzzle 2:
		System.out.println("******** PUZZLE 2 **********");
		for (i = 1, j = 2; i <= 10; i++, j++) {
			;
		}
		// what will be the O/P of the below statement
		System.out.println("i:" + i); // O/P is 11. Same reason as provided in puzzle 1
		System.out.println("j:" + j); // O/P is 12 because j's values are controlled
										// based on the conditions for i.

		// Puzzle 3:
		System.out.println("******** PUZZLE 3 **********");
		for (i = 1, j = 2; i <= 10; i++, j--) {
			;
		}
		// what will be the O/P of the below statement
		System.out.println("i:" + i); // O/P is 11. Same reason as provided in puzzle 1
		System.out.println("j:" + j); // O/P is -8 because j's values are controlled
										// based on the conditions for i.
		// Puzzle 4:
		System.out.println("******** PUZZLE 4 **********");
		// what will be the O/P of the below statement
		for (;;)
		 {
			; // This will result in an infinite loop
			            // as the loop has none of it's 3 components defined
			            // i.e, initialisation, condition, update. Hence, the
			            // empty statement after it continues to execute
		}


	}

}
