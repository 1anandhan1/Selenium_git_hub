package inheritancecode;

class dad {
	void display() {
		System.out.println("saving 2000");
	}
}

class child extends dad {

}

public class inheritance_simple {

	public static void main(String[] args) {
		child obj = new child();
		obj.display();

	}

}
