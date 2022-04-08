package com.epam.MYelizaryeu.task2;

import com.epam.MYelizaryeu.task2.finder.Finder;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) throws IOException{

        Application app = new Application();
        InputStream is = app.getFileFromResourceAsStream("rawPage.txt");
        InputStreamReader streamReader = new InputStreamReader(is, StandardCharsets.UTF_8);
        BufferedReader br = new BufferedReader(streamReader);
        List<String> page = new ArrayList<>();
        String pageLine;
        while ((pageLine = br.readLine()) != null){
            page.add(pageLine);
        }

        Text rawText = new Text(page);
        Text processedText = Text.processText(rawText);
        System.out.println("Processed text:");
        for(String line: processedText.getText()){
            System.out.println(line);
        }

        String phoneNumberRegEx = ("\\+\\d{3}(\\(\\d\\d\\))\\d((\\d\\d-){2})\\d\\d");
        List<String> phoneNumbers = Finder.findSubstring(processedText.getText(), phoneNumberRegEx);
        System.out.println("\nFounded phone numbers:");
        for (String phoneNumber : phoneNumbers){
            System.out.println(phoneNumber);
        }

        String mailRegEx = ("(\\w+)@(\\w+)\\.\\w{2,3}");
        List<String> emails = Finder.findSubstring(processedText.getText(), mailRegEx);
        System.out.println("\nFounded emails:");
        for (String email : emails){
            System.out.println(email);
        }

        String firstSentence = Sentence.getFirstSentence(processedText.getText());
        List<String> firstSentenceWords = Sentence.getWords(firstSentence);
        List<String> uniqueWords = Finder.findUniqueWords(firstSentenceWords, processedText.getText());
        System.out.println("\nUnique words in the first sentence:");
        for (String uniqueWord : uniqueWords){
            System.out.println(uniqueWord);
        }

    }

    private InputStream getFileFromResourceAsStream(String fileName) {

        // The class loader that loaded the class
        ClassLoader classLoader = getClass().getClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream(fileName);

        // the stream holding the file content
        if (inputStream == null) {
            throw new IllegalArgumentException("file not found! " + fileName);
        } else {
            return inputStream;
        }

    }
}
