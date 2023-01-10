package ex00;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MyWriteFile {
    private String path;
    private Map<String, String> signatyreMap = new HashMap<>();

    MyWriteFile(String path, Map<String,String> signatyreMap, ArrayList<Character> fileCheck) {
        this.path = path;
        this.signatyreMap = signatyreMap;
    }

//    private void CheckSignature(check) {
//
//    }


}
