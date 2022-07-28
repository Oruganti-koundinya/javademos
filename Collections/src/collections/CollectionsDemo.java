package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import setdemo.StringLengthComparator;

public class CollectionsDemo{
	public static void main(String[] args) {
		
		List<String> mylist = new ArrayList<>();
		mylist.add("M.S.Dhoni");
		mylist.add("Rishab Pant");
		mylist.add("Rohit Sharma");
		mylist.add("Virat Kohli");
		mylist.add("Bhuvaneshwar Kumar");
		mylist.add("Kane Williamson");
		mylist.add("Rashid Khan");
		mylist.add("Rahul Tripathi");
		mylist.add("Jasprit Bhumrah");
		mylist.add("Tangarasu Natarajan");
		
		System.out.println("Before Sort :" + mylist);
		
		Collections.sort(mylist);
		System.out.println("\nAfter Sort 1 :" + mylist);
		
		Collections.sort(mylist, new StringLengthComparator());
		System.out.println("\nAfter Sort 2 :" + mylist);
		
		Collections.sort(mylist, new StringReverseComparator());
		System.out.println("\nAfter Sort 3 :" + mylist);
		
		Collections.reverse(mylist);
		System.out.println("\nAfter Sort 4 :" + mylist);
	}
}
