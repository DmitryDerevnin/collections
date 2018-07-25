package test;

import impl.UniqueWords;
import impl.WordCounter;

import java.io.IOException;
import java.util.TreeMap;

public class TestCollections {
    private final String FILE_PATCH = "\\Test\\Collections\\src\\file\\file";

    public void start() throws IOException {
        WordCounter wordCounter = new WordCounter(FILE_PATCH);
        UniqueWords uniqueWords = new UniqueWords(FILE_PATCH);

        wordCounter.countWords();
        uniqueWords.findUniqueWords(wordCounter.getCountedWords());

        System.out.println("Подсчет повторений для каждого слова: " +
                wordCounter.getCountedWords());
        System.out.println("Уникальные слова: " +
                uniqueWords.getUniqueWords());
        System.out.println("Сортированные слова: " +
                new TreeMap<String, Object>(wordCounter.getCountedWords()));

    }
}
