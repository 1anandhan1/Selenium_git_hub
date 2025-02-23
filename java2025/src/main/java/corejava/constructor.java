package corejava;
class main{
	main(){
		System.out.print("main funuction");
	}
	main(int a){
		System.out.print("constructor overloading funuction");
	}
}
public class constructor {
	public static void main(String[] args) {
		main obj = new main(2);
	}

}
