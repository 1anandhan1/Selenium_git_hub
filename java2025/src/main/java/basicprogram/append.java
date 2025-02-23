package basicprogram;

public class append {

	public static void main(String[] args) {
		String name = "mythilya";
		String name2="kavi";
		String name3="";
		int n = name.length();
		for(int i=0;i<n/2; i++) {
			char a = name.charAt(i);
			name3 = name3+a;
		}
//System.out.println(name3);
		int n2 = n/2;
System.out.print(name3 + name2);
for(int j=n2-1; j<n;j++) {
	char b = name.charAt(j);
	System.out.print(b);
}
	}

}
