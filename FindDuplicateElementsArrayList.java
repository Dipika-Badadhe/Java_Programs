import java.util.ArrayList;
import java.util.HashSet;

public class FindDuplicateElements {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        
        
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> duplicates = new ArrayList<>();

        for (Integer element : arrayList) {
            if (!set.add(element)) {
                
                duplicates.add(element);
            }
        }

        System.out.println("Duplicate elements: " + duplicates);
    }
}
