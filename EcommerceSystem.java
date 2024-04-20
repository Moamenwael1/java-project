import java.util.Scanner;

public class EcommerceSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the E-Commerce System!");
        ElectronicProduct electronicProduct = new ElectronicProduct("Samsung", 1, 1, 599.9f, "smartphone");
        ClothingProduct clothingProduct = new ClothingProduct("Medium", "Cotton", 2, 19.99f, "T-Shirt");
        BookProduct bookProduct = new BookProduct("O'Reilly", "X Publications", 3, 39.99f, "OOP");


        System.out.println("Enter your customer ID: ");
        int customerId = Math.abs(scanner.nextInt());
        System.out.println("Enter your name: ");
        String customerName = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Enter your address: ");
        String customerAddress = scanner.nextLine();
        Customer customer = new Customer(customerId, customerName, customerAddress);
        Customer Customer = new Customer(0 , "", ""); // Initializing it with default values


        System.out.println("How many products do you want to order?");
        int nProducts = scanner.nextInt();
        Cart cart = new Cart(customer.getCustomerID(), nProducts);

        for (int i = 0; i < nProducts; i++) {
            System.out.println("Which product would you like to add? (1: Electronic, 2: Clothing, 3: Book):");
            int productType = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            switch (productType) {
                case 1:
                    cart.addProduct(electronicProduct, i);
                    break;
                case 2:
                    cart.addProduct(clothingProduct, i);
                    break;
                case 3:
                    cart.addProduct(bookProduct, i);
                    break;
                default:
                    System.out.println("Invalid product type.");
            }
        }

        System.out.println("Would you like to place the order? 1- Yes 2- No");
        int choice = scanner.nextInt();
        if (choice == 1) {
            System.out.println("Here is your orders summary:");

            // Placing the order
            Order order = cart.placeOrder();
            // Printing order info
            order.printOrderInfo();
        } else if (choice == 2) {
            System.out.println("Order placement cancelled.");
        } else {
            System.out.println("Invalid choice.");
        }
    }
}
