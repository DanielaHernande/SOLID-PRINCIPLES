package Exercise1;

public class SaveToDatabase {
    
    public void saveToDatabase(Order order) {
        
        // Lógica para guardar la orden en la base de datos
        System.out.println("Saving order to the database: " + order.getItems());
    }
}
