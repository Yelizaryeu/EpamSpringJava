package com.company.finder;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Finder {

    private Finder() {
    }

    public static List<String> findSubstring(List<String> page, String RegEx) {
        List<String> result = new ArrayList<>();
        Pattern pattern = Pattern.compile(RegEx);
        for (String line : page) {
            Matcher matcher = pattern.matcher(line);
            while (matcher.find()) {
                result.add(matcher.group());
            }
        }
        return result;
    }
}
