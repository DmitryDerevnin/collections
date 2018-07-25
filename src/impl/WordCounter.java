package impl;

import services.TextFormatter;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class WordCounter {
    private Map<String, Long> countedWords = new HashMap<>();
    private String filePatch;

    public WordCounter(String filePatch) {
        this.filePatch = filePatch;
    }

    public void countWords() throws IOException {
        TextFormatter textFormatter = new TextFormatter();
        textFormatter.format(filePatch);
        for (String word : textFormatter.getFormattedText()) {
            countedWords.put(word, countedWords.containsKey(word) ?
                    countedWords.get(word) + 1 : 1);
        }
    }

    public Map<String, Long> getCountedWords() {
        return countedWords;
    }

    public void setCountedWords(Map<String, Long> countedWords) {
        this.countedWords = countedWords;
    }

}
