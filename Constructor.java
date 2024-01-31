public class MyClass {
    // Fields or instance variables
    private int myNumber;
    private String myText;

    // Constructor with parameters
    public MyClass(int number, String text) {
        this.myNumber = number;
        this.myText = text;
    }

    // Another constructor with default values
    public MyClass() {
        this.myNumber = 0;
        this.myText = "Default";
    }

    // Methods (other than constructors)
    public void displayValues() {
        System.out.println("Number: " + myNumber);
        System.out.println("Text: " + myText);
    }

    public static void main(String[] args) {
        // Creating objects using constructors
        MyClass obj1 = new MyClass(42, "Hello");
        MyClass obj2 = new MyClass();

        // Calling a method to display values
        obj1.displayValues();
        System.out.println(); // Separating output
        obj2.displayValues();
    }
}