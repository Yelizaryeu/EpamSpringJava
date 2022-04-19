package com.epam.myelizaryeu.task2.elements;

import java.util.ArrayList;
import java.util.List;

public class Sentence {

    private List<Word> words;
    private PunctuationMark endMark;

    public Sentence(List<Word> words, PunctuationMark endMark) {
        this.words = words;
        this.endMark = endMark;
    }

    public static List<Word> getWords(String sentence) {
        List<Word> result = new ArrayList<>();
        String[] words = sentence.split(" ");
        char[] letters;
        for (String word : words) {
            letters = word.replaceAll("[,.!?]+$", "").toCharArray();
            result.add(new Word(letters));
        }
        /*Pattern pattern = Pattern.compile("[a-zA-Z0-9@.+()-]*[,.!?]*\\s+");
        Matcher matcher = pattern.matcher(sentence);
        while (matcher.find()) {
            char[] letters = matcher.group().replaceAll("[,.!?]\\s+", "").toCharArray();
            result.add(new Word(letters));
        }*/
        return result;
    }

    public List<Word> getWords() {
        return words;
    }

    @Override
    public String toString() {
        return "Sentence{" +
                "words=" + words +
                ", endMark=" + endMark +
                '}';
    }
}
