package basicprogram;

public class int_reverse {

	public static void main(String[] args) {
		int n = 1234;
		
		String num = Integer.toString(n);
		for(int i =num.length()-1; i>=0; i--) {
			char ch = num.charAt(i);
			
			System.out.print(ch);
		}
       
	}

}
