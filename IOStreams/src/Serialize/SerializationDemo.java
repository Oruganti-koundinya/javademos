package Serialize;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDemo {
	public static void main(String[] args) {

		try (FileOutputStream fos = new FileOutputStream("C:\\javafds\\Filehandling\\emp4.txt");
				ObjectOutputStream oos = new ObjectOutputStream(fos);) {
			
			Employee emp4 = new Employee(4, "OK", 60000, 56342);
			
			oos.writeObject(emp4);
			
			System.out.println("Serialized Employee object");
			

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
