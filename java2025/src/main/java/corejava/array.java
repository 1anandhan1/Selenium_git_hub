package corejava;
import java.util.Scanner;
public class array {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size:");
		int size = scan.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the array value:");
		int total=0;
		for(int i=0; i<size;i++) {
		arr[i] = scan.nextInt();
		total +=arr[i];
	
	}
		System.out.println(total);
}}
