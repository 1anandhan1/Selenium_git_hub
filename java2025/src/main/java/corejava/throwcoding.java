package corejava;

import java.util.Scanner;

public class throwcoding {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("please enter your age:");
		int age = scan.nextInt();
		if(age<18) {
			throw new ArithmeticException("you not eligiable");
		}
	}
}
