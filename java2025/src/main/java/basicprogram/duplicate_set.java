package basicprogram;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class duplicate_set {

	public static void main(String[] args) {
		Set<String> name = new LinkedHashSet<>();
		name.add("my");
		name.add("name");
		name.add("name");
		name.add("is");
		name.add("mythily");
		System.out.println(name);
for(String na :name) {
	System.out.print(na+" ");
}
	}

}
