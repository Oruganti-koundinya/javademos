package List;

import java.util.ArrayList;

public class ListDemo {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList<>();
		
		al.add(20);
		al.add(20.02f);
		al.add(30);
		al.add("Hey");
		al.add(20.23);
		al.add(null);
		System.out.println("Elelments of list are :" +al);
		
		ArrayList<String> mystring = new ArrayList<>();
		mystring.add("Hello");
		mystring.add("Koundinya");
		mystring.add("How Are You");
		mystring.add("Let's Print");
		System.out.println("Elements of list are :" +mystring);
		
	}

}
