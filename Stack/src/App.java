
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
		
		stack.printStack();
		
		
		stack.printWomen();
		
		stack.push(new Student(1, 25, "Janice", "v"));
		stack.push(new Student(2, 18, "Kermit", "m"));
		stack.push(new Student(3, 8, "Gonzo", "m"));
		stack.push(new Student(4, 35, "Swedish Chef", "m"));
		stack.push(new Student(5, 28, "Miss Piggy", "v"));
		
		System.out.println("~ ~ ~ PRINTING MEN ~ ~ ~");
		stack.printMen();
		
		System.out.println("~ ~ ~ PRINTING WOMEN ~ ~ ~");
		stack.printWomen();
		
		stack.push(new Student(2, 18, "Kermit", "m"));
		
		stack.printStack();
	}
}