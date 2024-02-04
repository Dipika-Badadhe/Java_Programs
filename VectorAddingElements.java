import java.util.Vector;

public class VectorAddingElements {
    public static void main(String[] args) {
        
        Vector<String> stringVector = new Vector<>();

        
        stringVector.add("Element 1");
        stringVector.add("Element 2");
        stringVector.add("Element 3");

       
        System.out.println("Elements in the Vector: " + stringVector);

        
        stringVector.add(1, "Inserted Element");

        
        System.out.println("Updated Vector: " + stringVector);
    }
}
