package Loc.File;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadCountry {
    public static void main(String[] args) {
        String filepath ="C:\\Users\\PC\\Documents\\File.txt";
        BufferedReader  bufferedReader = null;
        String line="";
        try{
            bufferedReader = new BufferedReader(new FileReader(filepath));
            while((line = bufferedReader.readLine()) != null){
                    String[] country = line.split(",");
                System.out.println("Country [code= " + country[4] + " , name=" + country[5] + "]");
            }
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally{
            if(bufferedReader != null){
                try{
                    bufferedReader.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }

    }
}
