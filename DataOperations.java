public class UserOperations {
    int firstNumber;
    double secondNumber;
    String text;

    public void add(int firstNumber, int secondNumber) {
        int result = firstNumber + secondNumber;
        System.out.println("Result: " + result);
    }

    public void displayUpperCase(String input) {
        text = input.toUpperCase();
        System.out.println("Updated String: " + text);
    }
}

public class DataOperations {
    public static void main(String[] args) {
        UserOperations userOperations = new UserOperations();
        userOperations.firstNumber = 10;
        userOperations.secondNumber = 20.5;
        userOperations.text = "hello";
        
        userOperations.add(userOperations.firstNumber, 5);
        userOperations.displayUpperCase("world");
    }
}