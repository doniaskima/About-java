
import java.io.FileInputStream;
import java.util.Scanner;

public class MainSystem {
    static String fileName = null;
    static Library lib = new Library();
    static Scanner in = new Scanner(System.in);
    static Boolean running = true;
    public static void main(String[] args) {
        while (running) {
            System.out.println("\nEnter 0 for load a library" + "\nEnter 1 for save and quit "
                    + "\n Enter 2 for list all Books in library" + "\nEnter 3 for add book to library");
            int answer = in.nextInt();
            switch (answer) {
                case 0:
                    System.out.println("Enter the file name to load");
                    fileName = in.next();

                    FileInputStream fis = null;
                    ObjectInputStream in = null;

                    File file = new File(fileName);
                    if (file.exists()) {
                        try {
                            fis = new FileInputStream(file);
                            in = new ObjectInputStream(fis);
                            lib = (Library) in.readObject();
                            fis.close();
                            in.close(); 
                        } catch (FileNotFoundException ex) {
                           e.printStackTrace();
                        }
                    } else {
                        System.out.println("The file does not exist "); 
                    }
                    break;
                case 1:
                System.out.println("Enter the file name to load");
                    break;
                case 2:
                System.out.println("Enter the file name to load");
                    break;
                case 3:
                System.out.println("Enter the file name to load");
                    break;
                
            }
        }
    }
}