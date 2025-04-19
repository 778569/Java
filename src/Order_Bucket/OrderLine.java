package Order_Bucket;

public class OrderLine {

    private int onOfunites;

    private Product product;

    public OrderLine(int onOfunites, Product product) {
        this.onOfunites = onOfunites;
        this.product = product;
    }

    public int getOnOfunites() {
        return onOfunites;
    }

    public void setOnOfunites(int onOfunites) {
        this.onOfunites = onOfunites;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public  double getSubTotal(){
        return this.onOfunites * this.product.getPrice();
    }
}
