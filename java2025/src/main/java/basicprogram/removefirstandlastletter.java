package basicprogram;

import java.util.Scanner;

public class removefirstandlastletter {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the name");
		String name = scan.nextLine();
		int size = name.length();
		for(int i=size-2; i>0; i--) {
			System.out.print(name.charAt(i));
		}
		
	}
}