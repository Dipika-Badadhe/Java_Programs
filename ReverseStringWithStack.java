import java.util.Stack;

public class ReverseStringWithStack {
    public static String reverseString(String input) {
        char[] charArray = input.toCharArray();
        Stack<Character> stack = new Stack<>();

        
        for (char c : charArray) {
            stack.push(c);
        }

        
        for (int i = 0; i < charArray.length; i++) {
            charArray[i] = stack.pop();
        }

        return new String(charArray);
    }

    public static void main(String[] args) {
        String originalString = "Hello, World!";
        String reversedString = reverseString(originalString);

        System.out.println("Original String: " + originalString);
        System.out.println("Reversed String: " + reversedString);
    }
}
