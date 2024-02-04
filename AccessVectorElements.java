import java.util.Vector;

public class AccessVectorElements {
    public static void main(String[] args) {
        
        Vector<String> stringVector = new Vector<>();

       
        stringVector.add("Element 1");
        stringVector.add("Element 2");
        stringVector.add("Element 3");

       
        System.out.println("Element at index 0: " + stringVector.get(0));
        System.out.println("Element at index 1: " + stringVector.get(1));
        System.out.println("Element at index 2: " + stringVector.get(2));

       
        System.out.println("Element at index 0: " + stringVector.elementAt(0));
        System.out.println("Element at index 1: " + stringVector.elementAt(1));
        System.out.println("Element at index 2: " + stringVector.elementAt(2));

        
        System.out.println("Iterating through all elements:");
        for (String element : stringVector) {
            System.out.println(element);
        }
    }
}
