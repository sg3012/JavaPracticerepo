package src.practiceprograms;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeNumber {
	public int i = 0, j = 0;

	public String checknum; // this is declared to apply various checks using string operations.

	public int originalnum;// this is the actual number that has to be checked for prime

	// Method 1 - Using Arraylist
	public void isPrime(String mynumber) {

		boolean flag1 = false;

		boolean flag2 = false;

		char digit;

		// Checking if the number is 1 or 0 or a -ve number
		if (mynumber.equals("1") || mynumber.equals("0") || mynumber.contains("-")) {

			System.out.println("Number not prime");

			return;

		}

		// Checking if the number is a decimal number. If yes then it's not prime.
		else {

			for (i = 0; i < mynumber.length(); i++) {

				digit = mynumber.charAt(i);

				if (digit == '.') {

					flag1 = true;

					break;
				}
			}

			if (flag1) {

				System.out.println("Decimal Numbers are not prime");

				return;
			}

			// if we reach this if statement then the entered number can be validated by
			// applying other checks.
			if (!flag1) {

				this.originalnum = Integer.parseInt(mynumber);

				// Checking if the entered prime number is 2 or not.
				if (this.originalnum / 2 == 1 && this.originalnum % 2 == 0) {

					System.out.println(this.originalnum + " " + "is prime no.");

					return;
				}

				// Checking if the entered prime number is other than 2 or not i.e, the number
				// is odd.
				else if ((this.originalnum % 2) != 0) {

					// Creating an ArrayList of factors of the number

					ArrayList<Integer> arr1 = new ArrayList<>();

					int mod;

					// Adding 1 to the arraylist as 1 will always be a factor of the number
					arr1.add(1);

					// J is 3 as we know at this point that the number is odd. So we start dividing
					// by
					// odd numbers, smallest being 3.
					j = 3;

					while (j <= this.originalnum) {

						mod = this.originalnum % j;

						// If the remainder after dividing the odd number by J
						// is 0 then we update the Array list of factors by adding J
						// and check if the size of the list becomes > 2. If
						// the size of the list of factors becomes > 2 then
						// the entered number is not prime as Prime numbers have only
						// 2 factors : 1 and the number itself.
						if (mod == 0) {

							arr1.add(j);

							if (arr1.size() > 2) {

								flag2 = true;

								System.out.println("array length: " + arr1.size());

								break;
							}

						}
						j++;

					}

					if (flag2) {
						System.out.println(this.originalnum + " " + "is not a prime no.");
					} else if (!flag2) {
						System.out.println(this.originalnum + " " + "is a prime no.");
					}

				}

				// If we reach this point then the entered number is even but not prime.
				else {

					System.out.println(this.originalnum + " " + "is not a prime no.");
				}

			}
		}
	}

	// Method 2 - Using Simple loops (Quick Logic for interview)

	public void isPrime(int mynumber) {

		boolean flag = true; // considering the number is Prime initially

		for (int i = 1; i <= mynumber; i++) {

			if (mynumber % i == 0 && i != mynumber && i != 1) {

				flag = false;

				break;
			}

		}

		if (flag) {

			System.out.println(mynumber + " is a Prime Number");
		}

		else {

			System.out.println(mynumber + " is not a Prime Number");
		}

	}

	// Method 3 - More Optimised approach

	public void checkPrime(int number) {

		if (number <= 1) {

			System.out.println(number + " is neither Prime nor Composite");

		}

		else {

			int divisor = 2;

			while (divisor * divisor <= number) {

				if (number % divisor == 0) {

					System.out.println(number + " is not Prime");

					return;  // This return will take the control out of if and loop and the method itself
					            // as we don't want any statement in this method further once we are aware
					            // that the number  is not Prime

				}

				else {
					divisor += 1;
				}
			}

			System.out.println(number + " is Prime"); // If we reach this point then we know that either
			                                                            // the divisor became equal to the number itself and loop condition was not met
			                                                            // or at some point the square of any divisor became greater than
			                                                            // the number itself and loop condition was not met.

		}

	}

	public static void main(String[] args) {

		PrimeNumber p = new PrimeNumber();

		System.out.println("Enter the number: ");

		Scanner sc = new Scanner(System.in);

//		p.checknum = sc.nextLine();

		p.originalnum = sc.nextInt();

//		p.isPrime(p.checknum); // Method-1

//		p.isPrime(p.originalnum); // Method-2

		p.checkPrime(p.originalnum);

		sc.close();
	}

}
