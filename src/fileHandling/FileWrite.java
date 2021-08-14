package com.java4rohit.fileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {
   public static void main(String[] args) throws IOException {
	 
	   String str = "file handling in java";
	   
	   FileWriter fw= new FileWriter("ouput.txt");
	  fw.write(str);
	   System.out.println("Writing successful");
	   
	   fw.close();
}
}
