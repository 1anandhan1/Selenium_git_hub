package basicprogram;

import java.util.Scanner;

public class Stringreverse {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your name:");
		String ch ="";
		String name = scan.nextLine();
		int size =name.length();
		for(int i=size-1; i>=0; i--) {
			System.out.print(name.charAt(i));
		}
	}

	
	}
