package practiceFileHandling;

import java.io.*;
import java.util.Properties;

public class PracticeFileHandlingClass {
	
	//reading a file
	public static void readFile() throws Exception {
		
		System.out.println("\nFile Handling");
		//File f = new File("/Users/adithiathreya/Desktop/practiceFile.rft"); //file connection
		
		File f1 = new File("./TestData/PracticeReadFileInEclipse.txt");
		
		FileReader fR = new FileReader(f1); //file reader reads characters and thus have to to be parsed by character ascii key
		BufferedReader bR = new BufferedReader(fR); //buffer reader handles strings
		System.out.println(bR.readLine());
		
		String s = bR.readLine();
		while (s != null) {
			System.out.println(s);
			s = bR.readLine();
		}
		fR.close();
		System.out.println("reading from the file completed");
	}
	
	//writing to a file
	public static void writeFile() throws Exception {
		File f2 = new File("./TestData/PracticeWriteFileInEclipse.txt");
		
		FileWriter fW = new FileWriter(f2);
		fW.write("this is first line to be written");
		fW.write("this is second line to be written");
		fW.write("\nthis is third line to be written");
		/*FileWriter fW = new FileWriter(f2, true);  -> if you want to write to the same file after every run with existing text
		fW.write("this is first line to be written");
		fW.write("this is second line to be written");
		fW.write("\nthis is third line to be written");
		fW.flush();
		fW.close();*/
		
		File nF = new File("./TestData/PracticeReadFileInEclipse.txt");
		FileReader nFR = new FileReader(nF);
		try (BufferedReader nBR = new BufferedReader(nFR)) {
			String s = nBR.readLine();
			while (s != null) {
				fW.write("\n" + s);
				s = nBR.readLine();
			}
		}
		fW.flush();
		fW.close();
		
		System.out.println("\nwriting to the file complete");
	}
	
	//reading properties file
	public static void readPropertiesFile() throws Exception {
		FileReader fR = new FileReader(new File("./TestData/file.properties"));
		
		Properties prop = new Properties();
		
		prop.load(fR); //load entire data into memory
		System.out.println("\nreading from properties file");
		System.out.println(prop.get("tool"));
		System.out.println(prop.get("url"));
	}
}
