package Simplilearn_Projects;

import java.util.Scanner;

public class Validation_EmailId {
	
	public static void main(String[] args) {
		String email[] = {"toreyson.entity@gmail.com","linkson.kolison@hotmail"};
		
		System.out.println("Enter string of your choice :");
		Scanner sc = new Scanner(System.in);
		String str[] = (String) sc.next();
		
		if(str == email) {
			System.out.println("Email id is validated.");
		}
		

	}

}
