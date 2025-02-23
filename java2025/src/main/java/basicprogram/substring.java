package basicprogram;

public class substring {

	public static void main(String[] args) {
		String name1 = "mythily";
		String name2 = "coimbotore";
		String name = name1+name2;
		System.out.println(name);
        String n1 =name.substring(7, 17);
        //System.out.println(n1);
        name1 =n1;
        System.out.println("name1:"+name1);
	}

}
