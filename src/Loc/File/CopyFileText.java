package Loc.File;

import java.io.*;

public class CopyFileText {
    public static void main(String[] args) {
        String filepath = "C:\\Users\\PC\\Documents\\File.txt";
        String filepath1 = "C:\\Users\\PC\\Documents\\File1.txt";
        try{
            BufferedReader bufferedReader = new BufferedReader(new FileReader(filepath));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filepath1));
            String line="";
            while((line = bufferedReader.readLine())!= null){
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
            bufferedReader.close();
            bufferedWriter.close();

        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){

        }


    }
}
