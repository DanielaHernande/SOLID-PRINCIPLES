package Exercise4;

public class Database implements DataStorage {

    @Override
    public void save(String data) {
        
        // Lógica para guardar datos en la base de datos
        System.out.println("Saving data to the database: " + data);
    }
}
