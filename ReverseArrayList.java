import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayList {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

       
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");
        arrayList.add("Grapes");

        
        System.out.println("Original ArrayList: " + arrayList);

        
        Collections.reverse(arrayList);

        
        System.out.println("Reversed ArrayList: " + arrayList);
    }
}
