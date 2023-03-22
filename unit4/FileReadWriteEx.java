import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    /**
    * Write a program to read and write contents of file using FileReader and FileWriter class.
    * */
    public static void main(String[] args) {
        try{
            String filePath = "C:\\Users\\Darwin\\Desktop\\text.txt";
            FileReader fileReader = new FileReader(filePath);

            //reading file
            int END_OF_FILE = -1;
            int currentByte = fileReader.read();
            while (currentByte != END_OF_FILE) {
                System.out.print((char)currentByte);
                currentByte = fileReader.read();
            }

            //writing to file
            FileWriter fileWriter = new FileWriter(filePath);
            fileWriter.write("writing to file");

            fileWriter.close();
            fileReader.close();

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
