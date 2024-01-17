import java.util.*;

public class RemoveRepeatingNumbers {
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 4, 2, 3, 1, 5, 6, 7, 8, 6, 7, 8, 9, 9, 9};

        System.out.println("Original Array: " + Arrays.toString(array));

        int[] resultArray = removeRepeatingThreeTimes(array);

        System.out.println("Array after removing numbers repeating 3 times: " + Arrays.toString(resultArray));
    }

    private static int[] removeRepeatingThreeTimes(int[] array) {
        // Step 1: Create a HashMap to store the frequency of each number
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Step 2: Iterate through the array and update the frequency in the HashMap
        for (int num : array) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Step 3: Create a new array with the remaining numbers
        List<Integer> result = new ArrayList<>();
        for (int num : array) {
            if (frequencyMap.get(num) != 3) {
                result.add(num);
            }
        }

        // Convert the List to an array
        int[] resultArray = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            resultArray[i] = result.get(i);
        }

        return resultArray;
    }
}
