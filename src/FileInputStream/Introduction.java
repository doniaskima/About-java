//FileOutputStream and FileInputStream are two of Java’s built-in classes and can be extremely useful when your program is working with external files. FileInputStream is used to read data from a file into a program. Both these classes
// read and write in bytes and then convert to the variables a program or file requires accordingly.
import java.io.*;

public class Introduction {
  public static void main(String[] args) throws IOException {
    String path = "./input.txt";
       FileInputStream inputFile = new FileInputStream(path);
           int i = 0;  
         while((i = inputFile.read()) != -1) {  
          System.out.print((char)i);    
       }
       inputFile.close();
  }
}