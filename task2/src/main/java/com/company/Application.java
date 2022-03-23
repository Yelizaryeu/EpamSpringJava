package com.company;

import com.company.finder.Finder;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {

        List<String> page = new ArrayList<>();
        Path rawPagePath = Paths.get("src\\main\\java\\com\\company\\txtFiles\\rawPage.txt");
        try (BufferedReader reader =
                     Files.newBufferedReader(rawPagePath, StandardCharsets.UTF_8)) {
            String line;
            while ((line = reader.readLine()) != null) {
                page.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        Text text = new Text(page);

        String phoneNumberRegEx = ("\\+\\d{3}(\\(\\d\\d\\))\\d((\\d\\d-){2})\\d\\d");
        List<String> phoneNumbers = Finder.findSubstring(text.getText(), phoneNumberRegEx);

        String mailRegEx = ("(\\w+)@(\\w+)\\.\\w{2,3}");
        List<String> emails = Finder.findSubstring(text.getText(), mailRegEx);

        Path processedPagePath = Paths.get("src\\main\\java\\com\\company\\txtFiles\\processedPage.txt");
        try (BufferedWriter writer =
                     Files.newBufferedWriter(processedPagePath, StandardCharsets.UTF_8,
                             StandardOpenOption.WRITE)) {
            for (String line : text.getText())
                writer.write(line + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }

        Path foundedNumbersPath = Paths.get("src\\main\\java\\com\\company\\txtFiles\\foundedNumbers.txt");
        try (BufferedWriter writer =
                     Files.newBufferedWriter(foundedNumbersPath, StandardCharsets.UTF_8,
                             StandardOpenOption.WRITE)) {
            for (String phoneNumber : phoneNumbers)
                writer.write(phoneNumber);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Path foundedEmails = Paths.get("src\\main\\java\\com\\company\\txtFiles\\foundedEmails.txt");
        try (BufferedWriter writer =
                     Files.newBufferedWriter(foundedEmails, StandardCharsets.UTF_8,
                             StandardOpenOption.WRITE)) {
            for (String email : emails)
                writer.write(email);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
