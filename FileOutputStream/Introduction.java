
import java.io.*;
public class Introduction {
  public static void main(String[] args) throws IOException{
     FileOutputStream fileOutputStream = new FileOutputStream("output.txt");
     String outputText = "I hate Isimm";
     //use write() to write the translated bytes to your FileOutputStream object
      fileOutputStream.write(outputText.getBytes());
      FileOutputStream.close();
  }
}