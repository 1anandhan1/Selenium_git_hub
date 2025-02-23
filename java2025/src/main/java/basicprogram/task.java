package basicprogram;

import java.util.Scanner;

public class task {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();
		for(int i=0; i<=name.length()-1; i-- ) {
			char a =name.charAt(i);
			System.out.println(a);
			char b = Character.toUpperCase(a);
			
		}
		for(int j=1; j<name.length()-1; j++ ) {
			char c = name.charAt(j);
			System.out.println(c);
		}
	}

}
