package project;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class Main {
  
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
	  
	new Calculator();
	

	BufferedReader reader = new BufferedReader(new FileReader(
			"C:\\Users\\adamc\\git\\calculator\\project\\history.txt"));
	String line = reader.readLine();
	while (line != null) {
		System.out.println(line);
		// read next line
		line = reader.readLine();
	

  }
}

}
