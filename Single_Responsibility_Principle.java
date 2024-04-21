/** Name : Alakananda Chakrabartty
 * Student ID : 220206
 * This program demonstrates the Single Responsibility Principle (SRP) by separating
 * the concerns of handling data and displaying data into separate classes.
 */

// Data handling class
class DataManager {
    private String data;

    /**
     * Constructor to initialize DataManager with data.
     * @param data The data to be managed.
     */
    public DataManager(String data) {
        this.data = data;
    }

    /**
     * Retrieves the stored data.
     * @return The stored data.
     */
    public String getData() {
        return data;
    }
}

// Display class
class DataDisplayer {
    private DataManager dataManager;

    /**
     * Constructor to initialize DataDisplayer with a DataManager.
     * @param dataManager The DataManager instance to be used for displaying data.
     */
    public DataDisplayer(DataManager dataManager) {
        this.dataManager = dataManager;
    }

    /**
     * Displays the data managed by the DataManager.
     */
    public void displayData() {
        String data = dataManager.getData();
        System.out.println("Data: " + data);
    }
}

// Main class
public class SRPDemo {
    public static void main(String[] args) {
        // Create DataManager instance
        DataManager dataManager = new DataManager("Sample Data");

        // Create DataDisplayer instance with DataManager
        DataDisplayer dataDisplayer = new DataDisplayer(dataManager);

        // Display data
        dataDisplayer.displayData();
    }
}
