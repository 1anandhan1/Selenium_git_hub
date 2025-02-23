package basicprogram;

import java.util.Scanner;

public class capletter {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your name:");
		
		String name = scan.nextLine();
		int size =name.length();
		for(int i=size-1; i>=0; i--) {
			char c =name.charAt(i);
			char x = Character.toUpperCase(c);
			System.out.print(x);
		}

	}

}
