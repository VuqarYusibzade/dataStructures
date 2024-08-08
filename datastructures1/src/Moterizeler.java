import java.util.Scanner;
import java.util.Stack;

public class Moterizeler {
    public static boolean isValid(String str) {
        Stack<Character> stack = new Stack<>();

        for (char bracket : str.toCharArray()) {
            if (bracket == '(' || bracket == '[' || bracket == '{') {
                stack.push(bracket);
            } else if (bracket == ')' || bracket == ']' || bracket == '}') {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    char openingBracket = stack.pop();
                    if ((bracket == ')' && openingBracket != '(') ||
                            (bracket == ']' && openingBracket != '[') ||
                            (bracket == '}' && openingBracket != '{')) {
                        return false;
                    }
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Mötərizələri daxil edin: ");
        String input = scanner.nextLine();

        System.out.println("Mötərizələrin düzgünlüyü: " + isValid(input));

        scanner.close();
    }
}
