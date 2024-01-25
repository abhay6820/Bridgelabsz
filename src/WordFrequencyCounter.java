import java.util.HashMap;
import java.util.Map;

public class WordFrequencyCounter {

    public static void main(String[] args) {
        String sampleString = "Apple Mango Orange Mango Guava Guava Mango";

        Map<String, Integer> wordFrequencyMap = new HashMap<>();

        String cleanedString = sampleString.replaceAll("[^a-zA-Z\\s]", "").toLowerCase();

        String[] words = cleanedString.split("\\s+");

        for (String word : words) {
            wordFrequencyMap.put(word, wordFrequencyMap.getOrDefault(word, 0) + 1);
        }

        System.out.println("Word frequencies:");
        for (Map.Entry<String, Integer> entry : wordFrequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " times");
        }
    }
}
