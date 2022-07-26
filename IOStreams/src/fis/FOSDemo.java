package fis;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FOSDemo {
	
public static void main(String[] args) {
		
		File myfile = new File("c:\\javafds\\Filehandling\\Write.txt");
		FileOutputStream fos = null;
			try {
				fos = new FileOutputStream(myfile);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			System.out.println("File successfully opened");
			String data = "Hey How are you?";
			try {
				fos.write(data.getBytes());
			} catch (IOException e) {
				e.printStackTrace();
			}
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			System.out.println("File closed");
				
	}
}
