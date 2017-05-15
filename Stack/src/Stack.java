public class Stack {
	
	private Student start;
	private int size = 0;
	
	
	public void push(Student s) {
		size++;
		if (start == null) {
			start = s;
			return;
		}
		
		Student last = start;
		
		while (last.getNext() != null) {
			last = last.getNext();
		}
		
		//System.out.println("Got studid as last id: " + last.getStudentnummer());
		last.setNext(s);
	}
	
	public int size() {
		return size;
	}
	
	public Student pop() {
		Student last = start;
		
		if (last == null)
			return null;
		
		while (last.getNext() != null) {
			last = last.getNext();
		}
		
		Student newlast = start;
		
		while (newlast.getNext() != last) {
			newlast = newlast.getNext();
		}
		
		newlast.setNext(null);
		size--;
		return last;
	}
	
	public boolean peek(Student s) {
		Student next = start;
		
		while (next != null) {
			if (next.getStudentnummer() == s.getStudentnummer())
				return true;
			
			next = next.getNext();
		}
		
		return false;
	}
	
	public void printStack() {
		Student next = start;
		
		for (int i = 0; i < size; i++) {
			next.printStudent();
			
			next = next.getNext();
		}
	}
	
	public void printMen() {
		Student next = start;
		
		for (int i = 0; i < size; i++) {
			if (next.getGeslacht().equalsIgnoreCase("M"))
				next.printStudent();
			
			next = next.getNext();
		}
	}
	
	public void printWomen() {
		Student next = start;
		
		for (int i = 0; i < size; i++) {
			if (next.getGeslacht().equalsIgnoreCase("V"))
				next.printStudent();
			
			next = next.getNext();
		}
	}

}