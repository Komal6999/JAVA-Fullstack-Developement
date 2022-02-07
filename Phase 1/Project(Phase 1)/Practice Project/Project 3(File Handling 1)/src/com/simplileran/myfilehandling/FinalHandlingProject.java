package com.simplileran.myfilehandling;

import java.io.File; //Import the File Class
import java.io.FileNotFoundException;
import java.io.IOException; //Import the IOException class to handle errors
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter; //Import the FileWriter class
public class FinalHandlingProject {
	public static void main(String[] args) {
		try {
			File myObj =new File("D:\\Mphasis\\File\\Student.txt");
			if(myObj.createNewFile()) {
				System.out.println("File Created: " + myObj.getName());
			}else {
				System.out.println("File already exists ");
			}
		}catch (IOException e) {
			System.out.println("An error occurred");
			e.printStackTrace();
		}
	}
	public class FileInformation{
		public static void main(String[] args) {
			File myObj = new File("D:\\Mphasis\\File\\Student.txt");
			if(myObj.exists()) {
				System.out.println("File name: "+myObj.getName());
				System.out.println("Absolute path: "+myObj.getAbsolutePath());
				System.out.println("Writable: "+myObj.canWrite());
				System.out.println("Readable: "+myObj.canRead());
				System.out.println("File size in bytes: "+myObj.length());
				}else {
					System.out.println("The file does not exist");
				}
		}
	}
	public class WritetToFile{
		public static void main(String[] args) {
			try {
				FileWriter myWriter = new FileWriter("D:\\Mphasis\\File\\Student.txt");
				myWriter.write("JAVA is the programming language of the millenium");
				myWriter.close();
				System.out.println("Successfully wrote to the file");
			}catch (IOException e) {
				System.out.println("An error occurred");
				e.printStackTrace();
			}
		}
	}
	public class ReadFromFile{
		public static void main(String[] args) {
			try {
				File myObj = new File("D:\\Mphasis\\File\\NewFile.txt");
				Scanner myReader = new Scanner(myObj);
				while (myReader.hasNextLine()) {
					String data = myReader.nextLine();
					System.out.println(data);
				}
				myReader.close();
			}catch (FileNotFoundException e) {
			      System.out.println("An error occurred.");
			      e.printStackTrace();
				
			}
		}
	}
	public void appendToFile(String text, String path) {
		FileWriter writer;
		PrintWriter pwriter;
		try {
			writer = new FileWriter(path, true);
			pwriter = new PrintWriter(writer);
			pwriter.println(text);
			pwriter.close();
		}
		catch (IOException e) {
			System.err.println("Error");
		}
	}

}
