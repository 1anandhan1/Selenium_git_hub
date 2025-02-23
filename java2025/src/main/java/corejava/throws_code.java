package corejava;
class main2{
	void display() throws ArithmeticException {
		int a =10/0;
		
	}
}
public class throws_code {
public static void main(String args[]) {
	main2 obj = new main2();
	try {
	obj.display();
	}
	catch(Exception e) {
		System.out.println(e);
	}
}
}
