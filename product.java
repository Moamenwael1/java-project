public class product {
    int productid;
    String name;
    float price;
    product(int productid, String name, float price){
        this.productid = productid;
        this.name = name;
        this.price = price;
        this.price = CheckPrice(price);
        this.productid = CheckProductID(productid);
    }
    product(){}
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getPrice() {
        return price;
    }

    public void setProductid(int productid) {
        this.productid = productid;
    }

    public int getProductid() {
        return productid;
    }
    public int CheckProductID(int productid){
        if (productid<0){
            productid = Math.abs(productid);
        }
        return productid;
    }
    public float CheckPrice(float price){
        if(price<0){
            price = Math.abs(price);
        }
        return price;
    }
}