package Fileproject;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Filehandling {

	public static void main(String[] args) throws IOException  //IOException is super class of all file i.o exceptions. 
	{ 	
		FileReader fr;
		FileInputStream fis;
		FileWriter fw;
		PrintWriter pw;
		
		File myfile = new File("c:\\javafds\\Filehandling//Assist.txt");
		fis = null;
		
		//fw,fr,pw throws fileNotfound Exception and i.o Exception related to file input output stream.
		fr = new FileReader("c://javafds//Filehandling//Assist.txt");
		fw = new FileWriter("c://javafds//Filehandling//Assist.txt", true);
		System.out.println("File Opened Successfully:" +"fw" + fr);
		fr.read();
		
		//We are Appending the Desired text in the file with the help of PrintWriter.
		pw = new PrintWriter(fw);
		pw.println("Hello Robert!");
		pw.println("You are performing FileHandling project");
		
		fis = new FileInputStream(myfile);
		System.out.println("File successfully opened");
		int i;
		while ( (i = fis.read()) != -1) 
			{
			System.out.print((char)i);
			}
		
		//It is a good practice to close the files to protect them to not get corrupted.
		pw.close();
		fw.close();
		fr.close();
		fis.close();
		System.out.println("File Closed Successfully:" +fw +fr);
	}

}

