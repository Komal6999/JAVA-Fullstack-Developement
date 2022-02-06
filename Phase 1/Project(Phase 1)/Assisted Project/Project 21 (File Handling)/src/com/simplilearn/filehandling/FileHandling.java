package com.simplilearn.filehandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class FileHandling {
	
	public static List<String> readFile(String filename)
	{
		
		List<String> list= Collections.emptyList();
		try {
			
			list=Files.readAllLines(Paths.get(filename),StandardCharsets.UTF_8);
		}
		
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return list;
	}
		
	public static void main(String[] args) throws IOException {
		//List<String> result = readFile("D:\\Mphasis\\File\\new.txt");
		
		Scanner sc=new Scanner(System.in);
		String choice;
	
		System.out.println("File Handling");
		System.out.println("1.Read");
		System.out.println("2.Write");
		System.out.println("3.Append");
		
		System.out.println("Enter your choice: ");
		choice=sc.nextLine();
		
		if(choice.equals("1"))
		{
			/*System.out.println("Enter your file name");
			String fname=sc.next();
			List result=readFile("D:\\Mphasis\\File\\New.txt");
			Iterator<String> it =result.iterator();
			while(it.hasNext());
			{
				System.out.println(it.next());
			}*/
			List<String> list= Collections.emptyList();
			Path path= Paths.get("D:\\Mphasis\\File\\New.txt");
			list= Files.readAllLines(path,StandardCharsets.UTF_8);
			
			Iterator<String> it=list.iterator();
			while(it.hasNext())
			{
				System.out.println(it.next());
			}
		}
		else if(choice.equals("2"))
		{
			try {
				System.out.println("Enter the text");
				String fname=sc.next();
				
				FileWriter fw = new FileWriter("D:\\Mphasis\\File\\New.txt");
				fw.write(fname);
				fw.close();
				System.out.println("File Write done");
			}
			catch (Exception e)
			{
				System.out.println("There are some Exception");
			}
		}
		else if(choice.equals("3"))
		{
			try {
				String data = "Tutorials Point is a best website in the world";
				File f=new File("D:\\Mphasis\\File\\New.txt");
				if(f.exists()) {
					f.createNewFile();
				}
				FileWriter fileWriter = new FileWriter(f.getName(),true);
				BufferedWriter bw = new BufferedWriter(fileWriter);
				bw.write(data);
				bw.close();
				System.out.println("Done");
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
	}

}
