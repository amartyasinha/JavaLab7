import java.io.*;
import java.util.Scanner;

public class ReadSelectedLine {

    public static void main(String[] args) {

        try {
            FileReader fin = new FileReader("try.txt");
            Scanner sc = new Scanner(fin);


            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                if (line.startsWith("//", 0))
                    System.out.println(line);
                fin.close();
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found\n" + e);
        } catch (IOException e) {
            System.out.println("Not able to open/close file\n" + e);
        }
    }
}
