package poly;
public class overloading{
	public int display(int age, int salary) {
		return age;
	}
	public int display(int age, int salary, int id) {
		return id;
	}



	public static void main(String[] args) {
		overloading obj= new overloading();
		int a = obj.display(25, 50000, 1);
		System.out.println(a);
	}
}