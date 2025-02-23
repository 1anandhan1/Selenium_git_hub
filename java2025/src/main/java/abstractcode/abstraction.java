package abstractcode;
abstract class a{
	//int a=0;
	
	abstract void display();
	void get(){
		System.out.println("dad");
	}
	}
	class b extends a{
		void get(){
			System.out.println("child");
			super.get();
		}
		void display() {
			
			System.out.println("abstraction");
		}
		
	}
public class abstraction {
	public static void main(String[] args) {
		b obj = new b();
		obj.display();
		obj.get();
		
	}
}
