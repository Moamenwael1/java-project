public class ClothingProduct extends product {
    String size;
    String fabric;
    ClothingProduct(String size, String fabric, int productid, float price, String name){
        super(productid, name, price);
        this.size = size;
        this.fabric = fabric;
    }

    public void setFabric(String fabric) {
        this.fabric = fabric;
    }

    public String getFabric() {
        return fabric;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getSize() {
        return size;
    }

}