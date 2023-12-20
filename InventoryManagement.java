import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Product {
    private String name;
    private double price;
    private int qty;

    public Product(String name, double price, int qty) {
        this.name = name;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    public int getQty() {
        return this.qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
}

class InvOperations {
    private List<Product> products;

    public InvOperations() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public List<Product> getAllProducts() {
        return products;
    }
}

public class InventoryManagement {
    public static void main(String[] p) {
        InvOperations invOperations = new InvOperations();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nInv Mgmt System");
            System.out.println("1. Add Prod");
            System.out.println("2. Display Inv");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int userInput = sc.nextInt();

            switch (userInput) {
                case 1:
                    System.out.print("Enter prod name: ");
                    String prodName = sc.next();
                    System.out.print("Enter prod price: ");
                    double prodPrice = sc.nextDouble();
                    System.out.print("Enter prod qty: ");
                    int prodQty = sc.nextInt();

                    Product product = new Product(prodName, prodPrice, prodQty);
                    invOperations.addProduct(product);

                    System.out.println("Prod added successfully!");
                    break;

                case 2:
                    System.out.println("\nCurrent Inv:");
                    List<Product> products = invOperations.getAllProducts();
                    for (Product currentProduct : products) {
                        System.out.println("Name: " + currentProduct.getName() +
                                ", Price: $" + currentProduct.getPrice() +
                                ", Quantity: " + currentProduct.getQty());
                    }
                    break;

                case 3:
                    System.out.println("Exiting program. Goodbye!");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}