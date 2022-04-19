package com.epam.myelizaryeu.task2.elements;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PunctuationMark {

    private char punctuationMark;

    public PunctuationMark(char punctuationMark) {
        this.punctuationMark = punctuationMark;
    }

    public static PunctuationMark getEndMark(String sentence) {
        Pattern pattern = Pattern.compile("[.?!]\\s+$");
        Matcher matcher = pattern.matcher(sentence);
        matcher.find();
        return new PunctuationMark(matcher.group().charAt(0));
    }

    public char getPunctuationMark() {
        return punctuationMark;
    }

    @Override
    public String toString() {
        return "PunctuationMark{" +
                "punctuationMark=" + punctuationMark +
                '}';
    }
}
