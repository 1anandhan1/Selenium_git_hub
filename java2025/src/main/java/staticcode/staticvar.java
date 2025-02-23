package staticcode;

public class staticvar {
 static int a =40;
 int b = 20;
void display() {
	a =20;
}
static void get() {
	a=30;
	staticvar obj = new staticvar();
	System.out.println(a +" "+" "+obj.b);
}
public static void main(String[] args) {
	staticvar obj = new staticvar();
	obj.display();
		get();
	System.out.print(a);
	
}
}
