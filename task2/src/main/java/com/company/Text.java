package com.company;

import java.util.List;

public class Text {

    private List<String> text;

    public Text(List<String> text) {
        for (int i = 0; i < text.size(); i++) {
            text.set(i, text.get(i).replaceAll("\\s{2,}", " "));
            text.set(i, text.get(i).replaceAll("\\t+", " "));
        }
        this.text = text;
    }

    public List<String> getText() {
        return text;
    }

    @Override
    public String toString() {
        return "Text{" +
                "text=" + text +
                '}';
    }
}