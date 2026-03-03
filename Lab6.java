//LAB-6
/*
import java.io.File;
import java.io.IOException;

class Lab6{
public static void main(String[] args)
{
File myobj=new File("filename.txt");
try{
 
if(myobj.createNewFile())
{
System.out.println("file created"+myobj.getName());
}
}
catch(IOException e)
{
System.out.println("An error occurred");
}
if(myobj.exists())
	{
	System.out.println("Is File:"+myobj.isFile());
	System.out.println("is directory:"+myobj.isDirectory());
	System.out.println("filename:"+myobj.getName());
	System.out.println("absolute path:"+myobj.getAbsolutePath());
	System.out.println("writeable:"+myobj.canWrite());
	System.out.println("readable:"+myobj.canRead());
	System.out.println("Executable:"+myobj.canExecute());
	System.out.println("file size in bytes:"+myobj.length());
	}
	else
	{
	System.out.println("The file was not exist");
	}
}
}

*/
//....................................................................................................

/*
import java.io.*;
class Lab6{
public static void main(String[] args) throws Exception{
	File file=new File("string.txt");
	String longest= " " ;
	int i,max=0;
	BufferedReader r=new BufferedReader(new FileReader("example.txt"));
	String line;
	while((line=r.readLine())!=null){
		String[] word=line.split(" ");
		for(i=1;i<word.length;i++){
		if(word[i].length()>longest){
			longest=word[i];
			max=longest.length();
			}
		}
	}
	//file.close();
	System.out.println("Longest word:"+longest);
	System.out.println("size of longest word:"+max);
	}
}

*/
//...............................................................................................

/*

//3

import java.io.*;

class Lab6{
    public static void main(String[] args) {
	
	String filename="filename.txt";
	analyzeFile(filename);
}

    public static void analyzeFile(String filename) {
        int charCount = 0, wordCount = 0, lineCount = 0;

        try {
	BufferedReader reader = new BufferedReader(new FileReader("filename.txt")) ;
            String line;
            while ((line = reader.readLine()) != null)
	   {
                lineCount++;  
                charCount += line.length(); 
                wordCount += line.split("\\s+").length; 
            }

          
            System.out.println("\nFile Analysis:");
            System.out.println("Number of Characters: " + charCount);
            System.out.println("Number of Words: " + wordCount);
            System.out.println("Number of Lines: " + lineCount);

        } 
	catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}

*/

//........................................................................................................



//4

import java.io.File;
import java.util.Scanner;

class Lab6{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        System.out.print("Enter the directory path: ");
        String dirPath = scanner.nextLine();
        
        File directory = new File(dirPath);
        
        if (directory.exists() && directory.isDirectory())
	 {
            String[] contents = directory.list();
            
            if (contents != null && contents.length > 0)
	     {
                System.out.println("Contents of the directory:");
                for (String file : contents) {
                    System.out.println(file);
                }
            } 
	else {
                System.out.println("The directory is empty.");
            }
        } 
	else {
            System.out.println("Invalid directory! Please enter a valid directory path.");
             }
        
        scanner.close();
    }
}

//''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''