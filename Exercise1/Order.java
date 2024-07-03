package Exercise1;

import java.util.List;

public class Order { 

    private List<String> items;
    private double totalAmount;

    public Order(List<String> items) {
        this.items = items;
        this.totalAmount = new OrderCalculator().calculateTotal(this.items);
    }

    public List<String> getItems() {
        return items;
    }

    public double getTotalAmount() {
        return totalAmount;
    }
}
