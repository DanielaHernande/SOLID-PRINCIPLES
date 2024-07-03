package Exercise1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        
        Order order = new Order(Arrays.asList("item1", "item2", "item3"));
        
        PrintOrder printer = new PrintOrder();
        printer.printOrder(order);
        
        SaveToDatabase repository = new SaveToDatabase();
        repository.saveToDatabase(order);
    }
}

