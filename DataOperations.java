public class UserOperations {
    int intValue;
    double doubleValue;
    String strValue;

    public void add(int firstNumber, int secondNumber) {
        int result = firstNumber + secondNumber;
        System.out.println("Result: " + result);
    }

    public void displayUpperCase(String input) {
        strValue = input.toUpperCase();
        System.out.println("Updated String: " + strValue);
    }
}

public class DataOperations {
    public static void main(String[] args) {
        UserOperations userOperations = new UserOperations();
        userOperations.intValue = 10;
        userOperations.doubleValue = 20.5;
        userOperations.strValue = "hello";
        
        userOperations.add(userOperations.intValue, 5);
        userOperations.displayUpperCase("world");
    }
}