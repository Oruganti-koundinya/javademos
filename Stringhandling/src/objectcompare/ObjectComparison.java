package objectcompare;

import Stringpool.User;

public class ObjectComparison {

	public static void main(String[] args) {
			User user1 = new User(1, "Jonathan");
			User user2 = new User(1, "Jonathan");
			System.out.println(user1 == user2);
			System.out.println(user1.equals(user2));
	}

}
