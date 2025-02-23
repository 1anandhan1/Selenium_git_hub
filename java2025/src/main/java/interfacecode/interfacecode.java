package interfacecode;
interface a{
	void display() ;
}
	interface b{
		void get();
	}
	class c implements a,b{
		public void display() {
			System.out.println("display");
		}

		public void get() {
			System.out.println("get");
			
		}
	}

public class interfacecode {

	public static void main(String[] args) {
		 c obj = new c();
		 obj.display();

	}

}
