package Serialize;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {
public static void main(String[] args) {
		
		try (FileInputStream fis = new FileInputStream("C:\\javafds\\Filehandling\\emp4.txt");
				ObjectInputStream ois = new ObjectInputStream(fis);) {
			
			Employee emp4 = (Employee) ois.readObject();
			
			System.out.println("Employee object Deserialized");
			
			System.out.println(emp4);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}
