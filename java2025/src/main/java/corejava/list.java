package corejava;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class list {
public static void main(String[] args) {
//list		
		List<Integer> l = new ArrayList<Integer>();
		l.add(2);
		l.add(1);
		System.out.println(l);



//set
    Set<Integer> s = new LinkedHashSet<Integer>() ;
    s.add(2);
    s.add(1);
    System.out.println(s);
}
}