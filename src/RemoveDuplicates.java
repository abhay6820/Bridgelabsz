public class RemoveDuplicates {
    public static void main(String[] args) {
        String input = "this is a great opportunity, opportunity like this never comes again";
        String result = removeDuplicates(input);
        System.out.println(result);
    }

    public static String removeDuplicates(String input) {
        String[] words = input.split("\\s+");
        StringBuilder resultBuilder = new StringBuilder();

        for (String word : words) {
            if (!resultBuilder.toString().contains(word)) {
                resultBuilder.append(word).append(" ");
            }
        }

        return resultBuilder.toString().trim();
    }
}
