package testcollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CollectionTest {

	public static void main(String[] args) {
		int a[] = new int[5];
		
		List<Integer> list = new ArrayList<>();
		list.add(23);
		list.add(12);
		list.add(14);
		list.add(9);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		
		
		Set<Integer> set = new TreeSet<>();
		set.add(23);
		set.add(12);
		set.add(14);
		set.add(9);
		set.add(9);
		System.out.println("---------------------------");
		System.out.println(set);
		
		
	}
	
}
