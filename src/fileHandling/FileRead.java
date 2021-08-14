package com.java4rohit.fileHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {

	public static void main(String[] args) throws IOException {
	
		
		int ch;
		 FileReader fr=null;
		 try {
			 fr=new FileReader("ouput.txt");
		 }
        catch(FileNotFoundException fe){
        	System.out.println("file not found");
        	
        	
        }
		 while ((ch=fr.read())!=-1) 
	            System.out.print((char)ch); 
		 fr.close();
	  
		 }
	
	}




