package Loc.File;

import java.io.*;

public class CovertingIntoBinaryFile {
    public static void main(String[] args) throws IOException {
        BinaryStudent student1 = new BinaryStudent("Lord",19,false);
        ObjectOutputStream objectOutputStream = null;
        try{
            objectOutputStream = new ObjectOutputStream(new FileOutputStream("C:\\Users\\PC\\Documents\\File.txt"));
            objectOutputStream.writeObject(student1);
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }finally {
            objectOutputStream.close();
        }

    }
}
