package inheritancecode;

class dad2 {
	void display() {
		int amount = 2000;
		System.out.println(amount);
	}}

class son1 extends dad2 {
	}

class son2 extends dad2 {

	}

public class hierarchy {
	public static void main(String args[]) {
		son2 obj = new son2();
		obj.display();
		son1 obj1 = new son1();
		obj1.display();
	}
}
