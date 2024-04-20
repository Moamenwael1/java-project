public class Cart {
    int customerID;
    int nProducts;
    product[] products;
    float totalPrice;
    public Cart(int customerID, int nProducts) {
        this.customerID = customerID;
        this.nProducts = nProducts;
        this.products = new product[nProducts]; //initialized with the size nProducts
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setnProducts(int nProducts) {
        this.nProducts = nProducts;
    }

    public int getnProducts() {
        return nProducts;
    }

    public void setProducts(product[] products) {
        this.products = products;
    }

    public product[] getProducts() {
        return products;
    }

    public void addProduct(product product, int index) {
        if (index >= 0 && index < products.length) {
            products[index] = product;
            if (index >= nProducts) {
                nProducts = index + 1; // Adjust nProducts if the index is beyond the current count
            }
        }
    }

    public void removeProduct(int index) {
        if (index >= 0 && index < nProducts) {
            for (int i = index; i < nProducts - 1; i++) {
                products[i] = products[i + 1];
            }
            // Making the last element as null is removing it from the list
            products[nProducts - 1] = null;
            // then lowering the count to effectively remove it
            nProducts--;
        }
    }

    public void calculatePrice() {
        totalPrice = 0;
        for (product product : products) {
            if (product != null) {
                totalPrice += product.getPrice();
            }
        }
    }


    public Order placeOrder() {
        calculatePrice();
        return new Order(customerID, products, totalPrice);
    }
}