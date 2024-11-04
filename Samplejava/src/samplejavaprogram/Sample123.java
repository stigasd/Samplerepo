package samplejavaprogram;

class Testarray2 {
	int rollno;
	String name;
	float fees;

	// creating constructor
	Testarray2(int rollno, String name, float fees) {
		this.rollno = rollno;
		this.name = name;
		this.fees = fees;
	}

	void display() {
		System.out.println(fees + name + rollno);
	}

	public static void main(String args[]) {
		Testarray2 obj1 = new Testarray2(4137, "stig", 3400);
		obj1.display();
	}
}
