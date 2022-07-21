package CheckedExceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CompileTimeException {

	public static void main(String[] args) throws FileNotFoundException {
		// Compile time exception also called as Checked exception.
		CompileTimeException obj = new CompileTimeException();
		obj.readFromFile();
	}
	
	void readFromFile() throws FileNotFoundException {
		FileInputStream fis = new FileInputStream("c:\\javafds\\PAT.txt");
}
}
