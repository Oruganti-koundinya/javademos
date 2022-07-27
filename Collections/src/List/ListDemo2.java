package List;

import java.util.ArrayList;
import java.util.List;

public class ListDemo2 {

	public static void main(String[] args) {

		ArrayList<Integer>list = new ArrayList<>();
		for (int i = 0; i < 100; i += 12) {
			list.add(i);
	}
		System.out.println("First List :" +list);
		List<Integer> secondlist = new ArrayList<>();
		secondlist.add(111);
		secondlist.add(222);
		secondlist.add(333);
		System.out.println("Second List :" +secondlist);
		
		list.addAll(4,secondlist);
		System.out.println(list);
		
		secondlist.addAll(list);
		System.out.println(secondlist);
	}
}