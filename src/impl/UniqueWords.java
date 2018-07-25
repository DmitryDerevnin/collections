package impl;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueWords {
    private Set<String> uniqueWords = new HashSet<>();
    private String filePatch;

    public UniqueWords(String filePatch) {
        this.filePatch = filePatch;
    }

    public void findUniqueWords(Map<String, Long> mapWords) {
        for (String word : mapWords.keySet()) {
            if (mapWords.get(word) == 1) {
                uniqueWords.add(word);
            }
        }
    }

    public void setUniqueWords(Set<String> uniqueWords) {
        this.uniqueWords = uniqueWords;
    }

    public Set<String> getUniqueWords() {
        return uniqueWords;
    }
}
