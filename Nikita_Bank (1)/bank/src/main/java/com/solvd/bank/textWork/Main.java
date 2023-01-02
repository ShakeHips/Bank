package com.solvd.bank.textWork;


import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        File initialFile = new File("bank/src/main/resources/text.txt");
        File outputFile = new File("bank/src/main/resources/output.txt");
        try {
            Map<String, Integer> matches = new HashMap<>();
            List<String> strings = Arrays.asList("Sea", "so", "when","ocean", "by", "Jules");
            String text = FileUtils.readFileToString(initialFile, Charset.defaultCharset());
            for (String s : strings) {
                matches.put(s, StringUtils.countMatches(text, s));
            }
            FileUtils.writeLines(outputFile, matches.entrySet());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
