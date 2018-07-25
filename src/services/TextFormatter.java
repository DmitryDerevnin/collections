package services;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class TextFormatter {

    private List<String> formattedText = new ArrayList<>();

    public void format(String filePath) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(filePath);
        BufferedReader reader = new BufferedReader(new InputStreamReader(fileInputStream));

        String[] textReader = reader.readLine().split("\\s");


        for (String word : textReader) {
            formattedText.add(word.toLowerCase().
                    replaceAll("[^a-zа-я]", ""));
        }

    }

    public void setFormattedText(List<String> formattedText) {
        this.formattedText = formattedText;
    }

    public List<String> getFormattedText() {
        return formattedText;
    }
}
