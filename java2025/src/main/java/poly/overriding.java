package poly;
class dad4 {
	   void display(int age, int salary) {
		   System.out.println("dad age is" + age);
	   }
	}
	class son4 extends dad4{
		void display(int age, int salary) {
			   System.out.println(age);
			   super.display(55, 500000);
		   }
	}
public class overriding {
	public static void main(String[] args) {
		dad4 obj = new son4();
		obj.display(25, 30000);
	}
}
