package Exercise1;

public class PrintOrder {
    
    public void printOrder(Order order) {
        
        // Lógica para imprimir la orden
        System.out.println("Order Items: " + order.getItems());
        System.out.println("Total Amount: " + order.getTotalAmount());
    }
}
