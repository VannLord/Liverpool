package Loc.File;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.zip.GZIPInputStream;

public class FileBinary {
    private static void copyFileUsingJava7File(File source, File dest) throws IOException {
        Files.copy(source.toPath(),dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }
    private static void copyFileUsingStream(File source, File dest) throws IOException{
        InputStream inputStream = null;
        OutputStream outputStream = null;
        try{
            inputStream = new FileInputStream(source);
            outputStream = new FileOutputStream(dest);
            byte[] bytes = new byte[1024];
            int length;
            while((length=inputStream.read(bytes))>0){
                outputStream.write(bytes,0,length);
            }
        }finally {
            inputStream.close();
            outputStream.close();
        }
    }

    public static void main(String[] args) {
        String sourcePath = "C:\\Users\\PC\\Documents\\File.txt";
        String destPath = "C:\\Users\\PC\\Documents\\File1.txt";
        File sourceFile = new File(sourcePath);
        File destFile = new File(destPath);
        try{
            copyFileUsingJava7File(sourceFile,destFile);
            System.out.println("Copy completed");
        }
        catch(IOException e){
            System.out.println("Can't copy this file");
            System.out.println(e.getMessage());
        }
    }
}
