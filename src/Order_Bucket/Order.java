package Order_Bucket;

import java.util.ArrayList;

public class Order {

    private Customer customer;

    private ArrayList<OrderLine> lineList;

    public Order(Customer customer) {
        this.customer = customer;
        lineList = new ArrayList<OrderLine>();
    }

    public double getTotal(){
        double tot =0.0;
        for (OrderLine ol : lineList){
            tot = tot + ol.getSubTotal();
        }
        return tot;
    }

    public ArrayList<OrderLine> getLineList() { 
        return lineList;
    }
}
