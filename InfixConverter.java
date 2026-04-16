import java.util.Stack;
import java.util.Scanner;

public class InfixConverter {

    // Function to check precedence
    static int precedence(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }

    // Function to convert infix to postfix
    static String infixToPostfix(String exp) {
        StringBuilder result = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);

            // If operand, add to result
            if (Character.isLetterOrDigit(ch)) {
                result.append(ch);
            }
            // If '(', push to stack
            else if (ch == '(') {
                stack.push(ch);
            }
            // If ')', pop until '('
            else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result.append(stack.pop());
                }
                stack.pop();
            }
            // If operator
            else {
                while (!stack.isEmpty() && precedence(ch) <= precedence(stack.peek())) {
                    result.append(stack.pop());
                }
                stack.push(ch);
            }
        }

        // Pop remaining operators
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        return result.toString();
    }

    // Reverse string
    static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    // Infix to Prefix
    static String infixToPrefix(String exp) {
        // Reverse
        exp = reverse(exp);

        // Swap brackets
        StringBuilder modified = new StringBuilder();
        for (char ch : exp.toCharArray()) {
            if (ch == '(')
                modified.append(')');
            else if (ch == ')')
                modified.append('(');
            else
                modified.append(ch);
        }

        // Convert to postfix
        String postfix = infixToPostfix(modified.toString());

        // Reverse postfix → prefix
        return reverse(postfix);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Infix Expression: ");
        String infix = scanner.nextLine();

        String postfix = infixToPostfix(infix);
        String prefix = infixToPrefix(infix);

        System.out.println("\nInfix  : " + infix);
        System.out.println("Postfix: " + postfix);
        System.out.println("Prefix : " + prefix);

        scanner.close();
    }
}