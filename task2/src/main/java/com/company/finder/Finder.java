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

    public static List<String> findUniqueWords(List<String> words, List<String> text) {

        List<String> result = words;

        for (int i = result.size() - 1; i >= 0; i--) {
            int numberOfAppearances = 0;
            Pattern pattern = Pattern.compile(words.get(i).replaceAll(" ", "") + "[.!?\\s]+");
            for (String line : text) {
                Matcher matcher = pattern.matcher(line + "\s");
                while (matcher.find()) {
                    numberOfAppearances++;
                }
            }
            if (numberOfAppearances > 1) {
                result.remove(i);
            }
        }
        return result;
    }
}
