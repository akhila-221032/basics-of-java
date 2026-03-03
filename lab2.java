//.............Capitalizing the first word ................
/*import java.util.Scanner;
 class Lab2{
     public static void main(String[] args){
         Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a sentence:");
         String input=scanner.nextLine();
         scanner.close();




         char[] charArray=new char[input.length()];
       for(int i=0;i<input.length();i++){
            charArray[i]=input.charAt(i);         }
         for(int i=0;i<charArray.length;i++){
             if(i==0 || charArray[i-1]==' '){
                if(charArray[i]>='a' && charArray[i]<='z'){
                     charArray[i]=(char)(charArray[i]-32);
                 }
 
            }
        }
        System.out.println("Capitalized Sentence:");
        for(char c:charArray) {
            System.out.println(c);        }
        System.out.println();
    }
}*/
/*//checking whether substring is present or not
import java .util.Scanner;
 public class SubstringSearch{
    public static void main(String[] args){
         Scanner sc=new Scanner(System.in);
      System.out.println("Enter the main string:");
         String mainStr=sc.nextLine();
        System.out.println("Enter the substring to search:");
        String subStr=sc.nextLine();
        sc.close();
       int mainLength=mainStr.length();
         int subLength=subStr.length();
         int index=-1;
         for(int i=0;i<=mainLength-subLength;i++ ){
             int j;
           for(j=0;j<subLength;j++){
                if(mainStr.charAt(i+j)!=subStr.charAt(j)){
                    break;
               }
            }
            if(j==subLength){
                 index=i;
                break;
	}
        }
       if(index!=-1){
           System.out.println("Substring found at index  "+index);
        }
        else{
            System.out.println("Substring not found");
         }
    }
}*/
//Conveting text file into tokens
 import java.util.Scanner;
 import java.io.File;
 import java.io.FileNotFoundException;
 class Lab2 {
     public static void main(String[] args){
         try{
            File file=new File("input.txt");
             Scanner scanner=new Scanner(System.in);
            StringBuilder word=new StringBuilder();
            System.out.println("Tokens from file");
           while(Scanner.hasNextLine()){
              String line=Scanner.nextLine();
                 for(int i=0;i<line.length();i++){                    char ch=line.charAt(i);
                     if(ch='A'&& ch>='z' || (ch>='a' && ch<='z') || (ch>='o' && ch<='9')){
                        word.append(ch);
                     }
                    else{
                        if(word.length()>0){
                             System.out.prinln(word.toString());
                            word.setLength(0);
                         }
                     }
                    scanner.close();
                }
             }


       }
         catch(FileNotFoundException ){
             System.out.println("File not found");
         }
     }
 }