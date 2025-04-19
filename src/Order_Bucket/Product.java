package Order_Bucket;

public class Product {

    private int pCode;
    private String pName;
    private double price;

    public Product(int pCode, String pName, double price) {
        this.pCode = pCode;
        this.pName = pName;
        this.price = price;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public int getpCode() {
        return pCode;
    }

    public void setpCode(int pCode) {
        this.pCode = pCode;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
