import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicatesArrayList {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Grapes");

        
        System.out.println("Original ArrayList: " + arrayList);

        
        HashSet<String> uniqueSet = new HashSet<>(arrayList);

       
        arrayList.clear();

        
        arrayList.addAll(uniqueSet);

        
        System.out.println("ArrayList without duplicates: " + arrayList);
    }
}
