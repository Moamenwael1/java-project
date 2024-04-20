public class Order {
    private int customerID;
    private int orderID;
    private product[] products;
    private float totalPrice;

    public Order(int customerId, product[] products, float totalPrice) {
        this.customerID = Math.abs(customerId);
        this.products = products;
        this.totalPrice = calculateTotalPrice();
        this.orderID = (int) (Math.random() * 1000);

    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setProducts(product[] products) {
        this.products = products;
    }

    public product[] getProducts() {
        return products;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public int getOrderID() {
        return orderID;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void printOrderInfo() {
        System.out.println("Here is Your Order");
        System.out.println("Order ID: " + orderID);
        System.out.println("Customer ID: " + customerID);
        System.out.println("Products: ");
        for (product product : products) {
            if (product != null) {
                System.out.println("- " + product.getName() + " $" + product.getPrice());
            }
        }
        System.out.println("Total Price: $" + totalPrice);
    }

    private float calculateTotalPrice() {
        float totalPrice = 0;
        for (product product : products) {
            if (product != null) {
                totalPrice += product.getPrice();
            }
        }
        return totalPrice;
    }
}