package com.epam.myelizaryeu.task2.elements;

public class Word {

    private char[] letters;

    public Word(char[] letters) {
        this.letters = letters;
    }

    public Word(String word) {
        this.letters = word.toCharArray();
    }

    public char[] getLetters() {
        return letters;
    }

    public String getWord() {
        return String.valueOf(letters).replaceAll(" ", "");
    }

    @Override
    public String toString() {
        return "Word{" +
                "word='" + getWord() + '\'' +
                '}';
    }
}
