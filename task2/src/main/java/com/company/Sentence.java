package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Sentence {

    private Sentence() {
    }

    public static String getFirstSentence(List<String> text) {

        String result;

        StringBuilder stringText = new StringBuilder();
        for (String s : text) {
            stringText.append(s);
            stringText.append("\s");
        }

        Pattern pattern = Pattern.compile("[^?!.]+[.!?]\\s+");
        Matcher matcher = pattern.matcher(stringText);
        matcher.find();
        result = matcher.group();
        return result;
    }

    public static List<String> getWords(String sentence) {

        List<String> result = new ArrayList<>();
        Pattern pattern = Pattern.compile("[А-Яа-я]*[.!?]*\\s+");
        Matcher matcher = pattern.matcher(sentence);
        while (matcher.find()) {
            result.add(matcher.group().replaceAll("[.!?]", ""));
        }
        return result;
    }
}
