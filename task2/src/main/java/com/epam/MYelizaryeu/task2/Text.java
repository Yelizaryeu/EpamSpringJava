package com.epam.MYelizaryeu.task2;

import java.util.List;

public class Text {

    private List<String> text;

    public Text(List<String> text) {
        this.text = text;
    }
    public static Text processText(Text text){
        List<String> result = text.getText();
        for (int i = 0; i < result.size(); i++) {
            result.set(i, result.get(i).replaceAll("\\s{2,}", " "));
            result.set(i, result.get(i).replaceAll("\\t+", " "));
        }
        return new Text(result);
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
