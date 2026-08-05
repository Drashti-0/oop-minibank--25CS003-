class Thermostat {

    private String location;
    private int temperature;

    private static final int MIN = 16;
    private static final int MAX = 30;

    private static int activeCount = 0;


    // Constructor
    public Thermostat(String location, int startTemp) {
        this.location = location;

        // Check temperature range
        if (startTemp >= MIN && startTemp <= MAX) {
            this.temperature = startTemp;
        } else {
            this.temperature = MIN;
        }

        activeCount++;
    }


    // Increase temperature
    public void increaseTemperature() {
        if (temperature < MAX) {
            temperature++;
        }
    }


    // Decrease temperature
    public void decreaseTemperature() {
        if (temperature > MIN) {
            temperature--;
        }
    }


    // Set temperature manually
    public void setTemperature(int temp) {
        if (temp >= MIN && temp <= MAX) {
            temperature = temp;
        }
    }


    // Display thermostat details
    public void display() {
        System.out.println("Location: " + location);
        System.out.println("Temperature: " + temperature);
    }


    // Static method
    public static int getActiveCount() {
        return activeCount;
    }


    // Main method
    public static void main(String[] args) {

        Thermostat t1 = new Thermostat("Bedroom", 22);
        Thermostat t2 = new Thermostat("Living Room", 25);

        t1.display();
        t2.display();

        t1.increaseTemperature();
        t2.decreaseTemperature();

        System.out.println("\nAfter Change:");

        t1.display();
        t2.display();

        System.out.println("Active Thermostats: " + Thermostat.getActiveCount());
    }
}