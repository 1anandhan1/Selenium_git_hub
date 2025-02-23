package basicprogram;

public class duplicate_remove {
public static void main(String[] args) {
	String name = "december";
	String result = "";
//	char c = name.charAt(0);
//	result = result+c;
	
	 for (int i = 0; i < name.length(); i++) {
         char d = name.charAt(i);
         // Check if the character is already in the result string
         if (result.indexOf(d) ==-1) {
             result += d;
				
			}
		
	}System.out.println(result);
}

}