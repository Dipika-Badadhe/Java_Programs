import java.util.*;

public class AnagramGroups {

    public static List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) {
            return new ArrayList<>();
        }

        Map<String, List<String>> anagramGroups = new HashMap<>();

        for (String str : strs) {
            // Sort the characters of the string to create a key
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String key = new String(charArray);

            // If the key is not present in the map, add a new list for the key
            anagramGroups.putIfAbsent(key, new ArrayList<>());

            // Add the current string to the list associated with the key
            anagramGroups.get(key).add(str);
        }

        // Convert the values of the map to a list to get the final result
        return new ArrayList<>(anagramGroups.values());
    }

    public static void main(String[] args) {
        String[] inputArray = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = groupAnagrams(inputArray);

        // Print the result
        for (List<String> group : result) {
            System.out.println(group);
        }
    }
}
