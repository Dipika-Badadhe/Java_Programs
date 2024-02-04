import java.util.Vector;

public class RemoveFromVector {
    public static void main(String[] args) {
        
        Vector<String> stringVector = new Vector<>();

       
        stringVector.add("Element 1");
        stringVector.add("Element 2");
        stringVector.add("Element 3");
     
        System.out.println("Original Vector: " + stringVector);
       
        stringVector.remove("Element 2");
        System.out.println("Vector after removing 'Element 2': " + stringVector);

        
        stringVector.removeElementAt(0);
        System.out.println("Vector after removing element at index 0: " + stringVector);
    }
}
