public class ElectronicProduct extends product {
    String brand;
    int WarrantyPeriod;
    ElectronicProduct(String brand, int WarrantyPeriod, int productid, float price, String name ){
        super(productid, name, price);
        this.brand=brand;
        this.WarrantyPeriod=WarrantyPeriod;
        this.WarrantyPeriod = CheckWarrantyPeriod(WarrantyPeriod);
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setWarrantyPeriod(int warrantyPeriod) {
        WarrantyPeriod = warrantyPeriod;
    }

    public int getWarrantyPeriod() {
        return WarrantyPeriod;
    }
    public int CheckWarrantyPeriod(int WarrantyPeriod){
        if(WarrantyPeriod<0){
            WarrantyPeriod= Math.abs(WarrantyPeriod);
        }
        return WarrantyPeriod;
    }
}