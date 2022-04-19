package com.epam.myelizaryeu.task2.elements;

import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Text {

    private List<String> text;

    public Text(List<String> text) {
        this.text = text;
    }

    public static Text processText(Text text) {
        List<String> result = text.asList();
        for (int i = 0; i < result.size(); i++) {
            result.set(i, result.get(i).replaceAll("\\s{2,}", " "));
            result.set(i, result.get(i).replaceAll("\\t+", " "));
        }
        return new Text(result);
    }

    public static List<Sentence> getSentences(List<String> text) {
        List<Sentence> result = new ArrayList<>();
        List<Word> words;
        BreakIterator iterator = BreakIterator.getSentenceInstance(Locale.ENGLISH);
        PunctuationMark endMark;

        StringBuilder sbText = new StringBuilder();
        for (String s : text) {
            sbText.append(s);
            sbText.append(" ");
        }

        String stringText = String.valueOf(sbText);
        iterator.setText(String.valueOf(stringText));
        int start = iterator.first();
        for (int end = iterator.next(); end != BreakIterator.DONE; start = end, end = iterator.next()) {
            words = Sentence.getWords(stringText.substring(start, end));
            endMark = PunctuationMark.getEndMark(stringText.substring(start, end));

            result.add(new Sentence(words, endMark));
        }
        return result;
    }

    public List<String> asList() {
        return text;
    }

    @Override
    public String toString() {
        return "Text{" +
                "text=" + text +
                '}';
    }
}
