package Loc;

import java.io.*;

public class CopyFile {
    public static void main(String[] args) {
        File file = new File("image/us.gif");
        System.out.println(file.exists());
        System.out.println(file.length());
        System.out.println(file.canRead());
        System.out.println(file.canWrite());
        System.out.println(file.isDirectory());
        File dir = new File("Books");
        dir.mkdir();
        String[] dirContents = dir.list();
        for (int i = 0; i < dirContents.length; i++) {
            System.out.println(dirContents[i]);
        }
        String csvFile = "/Users/mkyong/csv/country.csv";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";

        try {

            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] country = line.split(cvsSplitBy);

                System.out.println("Country [code= " + country[4] + " , name=" + country[5] + "]");

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

}

