
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordsChecker {
    Set<String> setWords;

    public WordsChecker(String text) {
        //this.text = text;
        this.setWords = new HashSet<>(List.of(text.split("\\P{IsAlphabetic}+")));
    }

    public boolean hasWord(String word) {
        setWords.contains(word);
        return true;
    }
}
