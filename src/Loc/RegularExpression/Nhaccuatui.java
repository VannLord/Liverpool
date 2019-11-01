package Loc.RegularExpression;

import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Nhaccuatui {
    public static void main(String[] args) throws IOException {
        String[] string = {"<a class=\"name_song\" href=\"nct.com/song2\">Chúng ta không thuộc về nhau - Loc</a>", "<a class=\"name_song\" href=\"nct.com/concobebe\">Con co be be - Dung</a>", "<a class=\"name_song\" href=\"nct.com/backimthang\">Bac kim thang - Dung</a>"};
        Pattern p = Pattern.compile("<a class=\"name_song\" href=\"nct.com\\/(.*?)\"\\>(.*?) - (.*?)<\\/a>");

        Matcher[] m = new Matcher[string.length];
        for (int i = 0; i < m.length ; i++) {
            m[i] = p.matcher(string[i]);
        }
        for (int i = 0; i < m.length ; i++) {
            boolean matches = m[i].matches();
            if (matches) {
                System.out.println("The name song: " + m[i].group(2));
                System.out.println("The name singer: " + m[i].group(3));
            }
        }


        try {
            URL url = new URL("https://www.nhaccuatui.com/bai-hat/nhac-tre-moi.html");
            Scanner scanner = new Scanner(new InputStream() {
                @Override
                public int read() throws IOException {
                    return 0;
                }
            });
            scanner.useDelimiter("\\Z");
            String content = scanner.next();
            scanner.close();
            content = content.replaceAll("\\n+","");
            Pattern pattern = Pattern.compile("name_song\">(.*?)</a>");
            Matcher matcher = pattern.matcher(content);
            while (matcher.find()){
                System.out.println(matcher.group(1));
            }

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    }


