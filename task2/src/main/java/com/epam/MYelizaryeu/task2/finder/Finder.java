package com.epam.myelizaryeu.task2.finder;

import com.epam.myelizaryeu.task2.elements.Word;

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

    public static List<Word> findUniqueWords(List<Word> words, List<String> text) {
        List<Word> result = words;

        for (int i = result.size() - 1; i >= 0; i--) {
            Pattern pattern;
            int numberOfAppearances = 0;
            if (words.get(i).getWord().charAt(0) != '+') {
                pattern = Pattern.compile(words.get(i).getWord() + "[.!?\\s]+");
            } else pattern = Pattern.compile(("\\+" + words.get(i).getWord().replaceAll("\\+", "") + "[.!?\\s]+"));
            for (String line : text) {
                Matcher matcher = pattern.matcher(line + " ");
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
