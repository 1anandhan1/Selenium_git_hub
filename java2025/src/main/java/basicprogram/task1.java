package basicprogram;

import java.util.Scanner;

public class task1 {

	public static void main(String[] args) {
		String chara = "";
		String num = "" ;
		int n =0;
		Scanner scan =new Scanner(System.in);
		String name = scan.nextLine();
		for(int i=0;i<name.length();i++) {
			char a = name.charAt(i);
			if(Character.isLetter(a)) {
				chara = chara +a;
			}
			else {
				num = num +a;
				n = n+(a -'0');
			}
			
		}System.out.println("characters :"+ chara);
		System.out.println("numbers:"+num);
		System.out.println(n);
	}

}
