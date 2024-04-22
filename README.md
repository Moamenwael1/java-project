
1. **Product Class**:
   - Represents a generic product with attributes such as product ID, name, and price.
   - Provides methods to set and retrieve these attributes while ensuring non-negative values for product ID and price.

2. **ElectronicProduct Class**:
   - Extends the `Product` class to represent electronic products.
   - Adds additional attributes such as brand and warranty period.
   - Provides methods to set and retrieve these attributes while ensuring non-negative values for the warranty period.

3. **ClothingProduct Class**:
   - Extends the `Product` class to represent clothing products.
   - Adds additional attributes such as size and fabric.
   - Provides methods to set and retrieve these attributes.

4. **BookProduct Class**:
   - Extends the `Product` class to represent book products.
   - Adds additional attributes such as author and publisher.
   - Provides methods to set and retrieve these attributes.

5. **Customer Class**:
   - Represents a customer with attributes such as customer ID, name, and address.
   - Provides methods to set and retrieve these attributes while ensuring a non-negative value for the customer ID.

6. **Cart Class**:
   - Represents a shopping cart with attributes such as customer ID, number of products, and an array of products.
   - Provides methods to add and remove products from the cart, calculate the total price of all products, and place an order.

7. **Order Class**:
   - Represents an order in an e-commerce system.
   - Contains details such as customer ID, order ID, products, and total price.
   - Provides methods to retrieve order information, calculate total price, and display order details.

8. ** EcommerceSystem**:
   - Acts as the entry point of the program.
   - Initializes products, prompts the user to enter customer details, allows the user to select products and add them to the cart, and prompts the user to place the order.
   - Displays the order summary or cancellation message based on the user's choice.

