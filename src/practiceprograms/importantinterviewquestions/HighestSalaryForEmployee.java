package src.practiceprograms.importantinterviewquestions;

import java.util.*;

public class HighestSalaryForEmployee {

	// Given an Employee class with following properties:
	// String name;
	// int age;
	// int salary;
	// String location;

	// Now, there is a list of this employee class object(s) with
	// all these properties.

	// We have to write a JAVA program that find name(s) of all those
	// employees who have highest salary in Mumbai location
	// and age should be between 20-25.

	// NOTE: 2 or more employees can have highest salary on their name
	// So, we have to print name of all those employees.
	// For e.g.: If 100000 is the highest salary and it is being given to 2
	// employees
	// then we have to print names of both these employees.
	String name;
	int age;
	int salary;
	String location;

	public static void main(String[] args) {
		HighestSalaryForEmployee employee = new HighestSalaryForEmployee(); // Class having all the employees' objects
		List<HighestSalaryForEmployee> empList = new ArrayList<HighestSalaryForEmployee>(); // list of all the employees' objects

		// Employee 1 object(contains employee 1 details)
		employee.name = "Shubham";
		employee.age = 10;
		employee.salary = 15000;
		employee.location = "mumbai";

		empList.add(employee);

		// Employee 2 object(contains employee 2 details)
		HighestSalaryForEmployee employee2 = new HighestSalaryForEmployee();
		employee2.name = "Sagar";
		employee2.age = 15;
		employee2.salary = 15000;
		employee2.location = "mumbai";

		empList.add(employee2);

		// Employee 3 object(contains employee 3 details)
		HighestSalaryForEmployee employee3 = new HighestSalaryForEmployee();
		employee3.name = "Scott";
		employee3.age = 30;
		employee3.salary = 5000;
		employee3.location = "Gurugram";

		empList.add(employee3);

		List<String> empNamesWithMaxSalList = new ArrayList<String>();
		
		int highestSalary = empList.get(0).salary; // Assigning
		// first employee object's salary to the highestSalary
		
		// if 1st employee object's location in the list
		// is Mumbai then add that name in the final employee 
		// names list. The location is case-insensitive match
		if(empList.get(0).location.equalsIgnoreCase("Mumbai")) {
			empNamesWithMaxSalList.add(empList.get(0).name);
		}
		
		// Loop through the employees list starting from 2nd employee
		// object, filter out employee(s) object with max salary having
		// location as Mumbai and adding the name of all those employee(s)
		// in the empNamesWithMaxSalList
		
		for (int i = 1; i < empList.size(); i++) {
			HighestSalaryForEmployee e = empList.get(i);
			if (e.salary > highestSalary) {
				highestSalary = e.salary;
				empNamesWithMaxSalList.clear();
				if(e.location.equalsIgnoreCase("Mumbai")) {
					empNamesWithMaxSalList.add(e.name);
				}
			}
			
			// Handling the case where 2 or more employees can have the same
			// max. salary out of multiple employees and print those employee name on
			// console.
			// For e.g. the highest salary among 3 employees is 15000 with employee e2 and
			// e3 have same highest salary.
			// The output on the console should be e2 and e3 both.
			else if(e.salary == highestSalary) {
				if(e.location.equalsIgnoreCase("Mumbai")) {
					empNamesWithMaxSalList.add(e.name);
				}
			}
		}
		System.out.println("Highest salary: " + highestSalary);
		
		if(empNamesWithMaxSalList.isEmpty()) {
			System.out.println("No employee(s) with the highest salary in Mumbai!");
		}
		else {
			System.out.println("Employee(s) with the highest salary in Mumbai: "+empNamesWithMaxSalList);
		}
	}

}
