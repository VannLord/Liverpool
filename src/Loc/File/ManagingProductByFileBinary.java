package Loc.File;

import javax.swing.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class ManagingProductByFileBinary {
    private static void copyFileUsingJaveFiles(File source,File dest) throws IOException {
        Files.copy(source.toPath(),dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }
    private static void copyFileUsingStream(File source,File dest) throws IOException{
        InputStream inputStream = null;
        OutputStream outputStream =null;
        try{
            inputStream = new FileInputStream(source);
            outputStream = new FileOutputStream(dest);
            byte[] bytes = new byte[1024];
            int length;
            while((length = inputStream.read(bytes))>0){
                outputStream.write(bytes,0,length);
            }
        }finally {
            inputStream.close();
            outputStream.close();
        }
    }

    public static void main(String[] args) throws IOException {
        BinaryProduct binaryProduct = new BinaryProduct("10A3","milktea","gongme",3);
        ObjectOutputStream out = null;
        ObjectInputStream in = null;
        try{
            out = new ObjectOutputStream(new FileOutputStream("C:\\Users\\PC\\IdeaProjects\\Liverpool\\src\\Loc\\File1"));
            out.writeObject(binaryProduct);
            in = new ObjectInputStream(new FileInputStream("C:\\Users\\PC\\IdeaProjects\\Liverpool\\src\\Loc\\File1"));
            System.out.println(in.readObject());
        }catch (IOException e){
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            if (out != null)
            out.close();
            if (in != null)
            in.close();
        }
    }
}
