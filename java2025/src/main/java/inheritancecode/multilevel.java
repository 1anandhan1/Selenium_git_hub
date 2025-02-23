package inheritancecode;
class dad1{
	void food() {
		System.out.println("amount 2000");
	}
}
class mom extends dad1{
	void food() {
		System.out.println("food is ready");
	}
}
//class child1 extends mom{
//	void homework() {
//		System.out.println("homework is done");
//	}
//}
public class multilevel {
	public static void main(String[] args) {
//		child1 obj = new child1();      // reference child /obj child
//		obj.amount();
//		obj.food();
//	    obj.homework();
		dad1 obj1 = new mom();    //reference dad1 /obj mom
		obj1.food();
	}
}
