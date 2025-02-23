package basicprogram;

public class vowals {

	public static void main(String[] args) {
		String name = "mythae";
		for(int i=0;i<name.length(); i++) {
			char a = name.charAt(i);
			if(a=='a'|| a=='e') {
				System.out.println(a +"is a vowals");
			}
		}

	}

}
