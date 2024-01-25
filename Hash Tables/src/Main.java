import java.util.HashMap;
import java.util.LinkedList;

class MyMapNode {
    String key;
    int value;

    public MyMapNode(String key, int value) {
        this.key = key;
        this.value = value;
    }
}

 class WordFrequencyProcessor {

    public static void main(String[] args) {
        // UC 1: Ability to find frequency of words in a sentence
        String sentence = "To be or not to be";
        processWordFrequency(sentence);

        // UC 2: Ability to find frequency of words in a large paragraph
        String paragraph = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
        processWordFrequency(paragraph);

        // UC 3: Remove avoidable word from the phrase
        String modifiedParagraph = removeWord(paragraph, "avoidable");
        processWordFrequency(modifiedParagraph);
    }

    private static void processWordFrequency(String input) {
        HashMap<String, LinkedList<MyMapNode>> wordFrequencyMap = new HashMap<>();
        String[] words = input.split(" ");

        for (String word : words) {
            LinkedList<MyMapNode> list = wordFrequencyMap.getOrDefault(word, new LinkedList<>());

            if (list.isEmpty()) {
                list.add(new MyMapNode(word, 1));
            } else {
                MyMapNode node = list.getFirst();
                node.value++;
            }

            wordFrequencyMap.put(word, list);
        }

        // Print word frequencies
        System.out.println("Word Frequencies:");
        for (String word : wordFrequencyMap.keySet()) {
            System.out.println(word + ": " + wordFrequencyMap.get(word).getFirst().value);
        }

        System.out.println("-----------");
    }

    private static String removeWord(String input, String wordToRemove) {
        StringBuilder modifiedParagraph = new StringBuilder();
        String[] words = input.split(" ");

        for (String word : words) {
            if (!word.equals(wordToRemove)) {
                modifiedParagraph.append(word).append(" ");
            }
        }

        return modifiedParagraph.toString().trim();
    }
}
