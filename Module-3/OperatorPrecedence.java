public class OperatorPrecedence {
    public static void main(String[] args) {
        int result = 10 + 5 * 2; // multiplication has higher precedence than addition

        System.out.println("Result of 10 + 5 * 2 is: " + result);

        int result2 = (10 + 5) * 2; // parentheses change precedence
        System.out.println("Result of (10 + 5) * 2 is: " + result2);
    }
}
