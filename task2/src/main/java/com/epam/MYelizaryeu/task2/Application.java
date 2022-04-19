package com.epam.myelizaryeu.task2;

import com.epam.myelizaryeu.task2.elements.Sentence;
import com.epam.myelizaryeu.task2.elements.Text;
import com.epam.myelizaryeu.task2.elements.Word;
import com.epam.myelizaryeu.task2.finder.Finder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) throws IOException {

        Application app = new Application();
        InputStream is = app.getFileFromResourceAsStream("rawPage.txt");
        InputStreamReader streamReader = new InputStreamReader(is, StandardCharsets.UTF_8);
        BufferedReader br = new BufferedReader(streamReader);
        List<String> page = new ArrayList<>();
        String pageLine;
        while ((pageLine = br.readLine()) != null) {
            page.add(pageLine);
        }

        Text rawText = new Text(page);
        Text processedText = Text.processText(rawText);
        System.out.println("Processed text:");
        for (String line : processedText.asList()) {
            System.out.println(line);
        }

        Sentence firstSentence = Text.getSentences(processedText.asList()).get(0);
        System.out.println("\nWords in the first sentence: ");
        for (Word word : firstSentence.getWords()) {
            System.out.println(word.getWord());
        }

        List<Word> uniqueWords = Finder.findUniqueWords(firstSentence.getWords(), processedText.asList());
        System.out.println("\nUnique words in the first sentence:");
        for (Word uniqueWord : uniqueWords) {
            System.out.println(uniqueWord.getWord());
        }
    }

    private InputStream getFileFromResourceAsStream(String fileName) {

        ClassLoader classLoader = getClass().getClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream(fileName);

        if (inputStream == null) {
            throw new IllegalArgumentException("file not found! " + fileName);
        } else {
            return inputStream;
        }
    }
}
