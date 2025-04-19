package Order_Bucket;

public class Customer {

    private int cusId;
    private  String name;

    public Customer(int cusId, String name) {
        this.cusId = cusId;
        this.name = name;
    }

    public int getCusId() {
        return cusId;
    }

    public void setCusId(int cusId) {
        this.cusId = cusId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
