import java.io.FileInputStream;

public class Main {

    /**
    * Write a program to demonstrate the use of a class FileInputStream. 
    * Accept the input file name at command line.
    * */
    public static void main(String[] args) {
        try{
            FileInputStream fis = new FileInputStream(args[0]); //args[0] = full path of the text file
            int END_OF_FILE = -1;
            int currentByte = fis.read();
            while (currentByte != END_OF_FILE) {
                System.out.print((char)currentByte);
                currentByte = fis.read();
            }
            fis.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
