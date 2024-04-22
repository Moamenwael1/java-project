import java.util.Scanner;
public class Customer {
    int CustomerID;
    String name;
    String address;
    Scanner scanner = new Scanner(System.in);
    Customer(int CustomerID, String name, String address){
        this.CustomerID=CustomerID;
        this.name=name;
        this.address=address;
    }
    public int checkCustomerID(int CustomerID){
        if(CustomerID<0){
            CustomerID = Math.abs(CustomerID);
        }
        return CustomerID;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setCustomerID(int CustomerID) {
        this.CustomerID = CustomerID;
    }

    public int getCustomerID() {
        return CustomerID;
    }
    
}
