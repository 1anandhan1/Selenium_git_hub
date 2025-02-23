package corejava;
class main1{
	int a;
	main1(int a){
		a=a;
		System.out.println(a);
	}
	
}
public class thiskey {
	
	public static void main(String[] args) {
		main1 obj = new main1(5);
		System.out.println(obj.a);
}}
