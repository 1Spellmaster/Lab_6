import java.util.HashMap;

public class Translator {
    private final HashMap<String, String> dictionary = new HashMap<>();

    public void addWord(String english, String ukrainian) {
        dictionary.put(english.toLowerCase(), ukrainian.toLowerCase());
    }

    public String translate(String phrase) {
        String[] words = phrase.toLowerCase().split("[^a-z']+");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (word.isEmpty()) {
                continue;
            }
            String translation = dictionary.getOrDefault(word, "[" + word + "]");
            result.append(translation).append(" ");
        }

        return result.toString().trim();
    }
}
