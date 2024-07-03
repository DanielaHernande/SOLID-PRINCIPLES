package Exercise4;

public class Main {
    public static void main(String[] args) {
        
        DataStorage database = new Database();
        DataService dataService = new DataService(database);

        dataService.saveData("Sample data");
    }
}
