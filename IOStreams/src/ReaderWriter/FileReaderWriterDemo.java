package ReaderWriter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriterDemo {

	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("c://javafds//Filehandling//Assist.txt");
		FileWriter fw = new FileWriter("c://javafds//Filehandling//WrIte.txt");
		System.out.println("file found" + fw +fr);
		int ch;
		while( (ch = fr.read()) != -1)
		{
			fw.write(ch);
		}
		fr.close();
		fw.close();
	}

}
