package Loc;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class First {
    public static void main(String[] args) throws IOException {
        listOfFile("C:\\");


    }
    public static void listOfFile(String filePath) throws IOException {
        File file = new File(filePath);
        File[] files = file.listFiles();
        System.out.println("Noi dung th muc " + filePath);
        for (File file1:files) {
            System.out.println(file1.getCanonicalFile());

        }


    }
}
