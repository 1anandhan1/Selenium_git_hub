package encapsulationcode;

public class encap {
private int age ;
private String name;
public String geter() 
{
	return name; 
}
public void seter(String name) 
{ 
	this.name = name; 
}
	public static void main(String[] args) {
    encap obj = new encap();
    obj.seter("mythily");
System.out.println(obj.geter());
	}

}
