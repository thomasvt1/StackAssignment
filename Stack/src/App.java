
public class App {
	
	/*	studnr.	naam			leeftijd	geslacht
		01		Janice			25			v
		02 		Kermit 			18 			m
		03 		Gonzo 			8 			m
		04 		Swedish Chef 	35 			m
		05	 	Miss Piggy 		28 			v
	*/
	
	/*
	• pop()
	• Print de stack.
	• Print alle vrouwen in de stack.
	• Push achtereenvolgens Janice, Kermit, Gonzo, Swedish Chef en Miss Piggy op de stack.
	• Print alle mannelijke studenten.
	• Print alle vrouwelijke studenten.
	• Push Kermit nogmaals op de stack.
	• Print de stack.
	 */
	
	public static void main(String[] args) {
		Stack stack = new Stack();
		
		Student pop = stack.pop();
		
		if (pop == null)
			System.out.println("pop succesvol aangezien er nog niks op de stack zit!");
		else
			System.out.println("Er is iets misgegaan met het programmeren van deze opdracht :(");
		
		stack.printStack();
		
		stack.printWomen();
		
		Student s1 = new Student(1, 25, "Janice", "v");
		Student s2 = new Student(2, 18, "Kermit", "m");
		Student s3 = new Student(3, 8, "Gonzo", "m");
		Student s4 = new Student(4, 35, "Swedish Chef", "m");
		Student s5 = new Student(5, 28, "Miss Piggy", "v");
		
		stack.push(s1);
		stack.push(s2);
		stack.push(s3);
		stack.push(s4);
		stack.push(s5);
		
		System.out.println("~ ~ ~ PRINTING MEN ~ ~ ~");
		stack.printMen();
		
		System.out.println("~ ~ ~ PRINTING WOMEN ~ ~ ~");
		stack.printWomen();
		
		stack.push(s2);
		
		stack.printStack();
	}
}