package ex00;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MyFileReader {
    private Map<String, String> myMap = new HashMap<String,String>();
    ArrayList<Character> checkFile = new ArrayList<>();
    private String separator = File.separator;
    private String configFilePath;
    private String checkFilePath;

    MyFileReader() {
        configFilePath = "." + separator + "day02" + separator + "src" + separator + "ex00" + separator + "signatyre.txt";
    }

    public MyFileReader(String configFilePath, String checkFilePath) {
        this.configFilePath = configFilePath;
        this.checkFilePath = checkFilePath;
    }

    public Map<String, String> getMyMap() {
        return myMap;
    }

    MyFileReader(String path) {
        this.configFilePath = path;
    }

    private void addMap(ArrayList<Character> format) {
        String extentionName = "";
        String extentionFormat = "" ;
        boolean comma = false;
        boolean nextLineCheck = false;

        for (Character ch: format) {
            if (ch.charValue() == '\n') {
                comma = false;
                myMap.put(extentionName, extentionFormat);
//                System.out.println("Key: " + extentionName + "\nZnachenie: " + extentionFormat + "\n");
                extentionName = "";
                extentionFormat = "";

                continue;
            }
            if(ch.charValue() == ',') {
                comma = true;
                continue;
            } else if (comma == false) {
                extentionName += ch.toString();
            } else {
                extentionFormat += ch.toString();
            }
        }



    }

    public void readFile() {
        int codeAscii = -1;

        Character ch;


        try (FileInputStream fileInputStreamCfg = new FileInputStream(configFilePath)) {
            ArrayList<Character> format = new ArrayList<Character>();
            while((codeAscii = fileInputStreamCfg.read()) != -1) {
                ch = (char) codeAscii;
                format.add(ch);
//                System.out.print((char) i);
            }
            addMap(format);
        } catch (IOException err) {
            err.printStackTrace();
        }

        try (FileInputStream fileInputStreamCheck = new FileInputStream(configFilePath)) {
            ArrayList<Character> deteminTypeFile = new ArrayList<Character>();
            boolean flagCome = false;

            while((codeAscii = fileInputStreamCheck.read()) != '\n') {
                ch = (char) codeAscii;
                if (ch == ',') {
                    flagCome = true;
                    continue;
                }
                if (flagCome == true) {
                    deteminTypeFile.add(ch);
                }
//                System.out.print((char) i);
            }
        } catch (IOException err) {
            err.printStackTrace();
        }




    }
}
