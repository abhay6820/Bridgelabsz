 class MaxFinder<T extends Comparable<T>> {

    public T findMax(T[] array) {
        if (array == null || array.length == 0) {
            return null; // Handle empty array or null input
        }

        T max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(max) > 0) {
                max = array[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {
        // Example with integers
        Integer[] intArray = { 3, 7, 1, 9, 4, 6 };
        MaxFinder<Integer> intMaxFinder = new MaxFinder<>();
        System.out.println("Maximum Integer: " + intMaxFinder.findMax(intArray));

        // Example with doubles
        Double[] doubleArray = { 3.5, 7.2, 1.8, 9.6, 4.0, 6.1 };
        MaxFinder<Double> doubleMaxFinder = new MaxFinder<>();
        System.out.println("Maximum Double: " + doubleMaxFinder.findMax(doubleArray));

        // Example with strings
        String[] stringArray = { "apple", "orange", "banana", "grape" };
        MaxFinder<String> stringMaxFinder = new MaxFinder<>();
        System.out.println("Maximum String: " + stringMaxFinder.findMax(stringArray));
    }
}
