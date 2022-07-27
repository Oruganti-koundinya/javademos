package Linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		Object[] objects = new Object[1000000];
		for(int i=0; i<objects.length;i++)
		{
			objects[i] = new Object();
		}
		List<Object>linklist = new LinkedList<>();
		long start = System.currentTimeMillis();
		for (Object object : objects) {
			linklist.add(object);
		}
		long end = System.currentTimeMillis();
		System.out.println("Time Taken for adding to Linked List :" + (end-start) + "ms");
		
		List<Object> arraylist = new ArrayList<>();
		start = System.currentTimeMillis();
		for (Object object : objects) {
			arraylist.add(object);
		}
		end = System.currentTimeMillis();
		System.out.println("Time Taken for adding to Array List :" + (end-start) + "ms");
	}

}
