package List;

import java.util.ArrayList;

public class ListDemo1 {

	public static void main(String[] args) {
		
		ArrayList<Integer>list = new ArrayList<>();
		for (int i = 0; i < 100; i += 10) {
			list.add(i);
		}
		System.out.println(list);
		
		list.add(23);
		list.add(2, 26);
		list.set(3, 60);
		System.out.println(list);
	}

}
