public class Vehicle {
    private static int count = 0;  
    private int vehicleId;
    private String brandName;
    private double price;


    public Vehicle(String brandName, double price) {
        count++; 
        this.vehicleId = count; 
        this.brandName = brandName;
        this.price = price;
    }

    
    public void displayDetails() {
        System.out.println("Vehicle ID   : " + vehicleId);
        System.out.println("Brand Name   : " + brandName);
        System.out.println("Price        : " + price);
        System.out.println("-----------------------------");
    }

    
    public static int getVehicleCount() {
        return count;
    }

    
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Toyota", 25000.0);
        Vehicle v2 = new Vehicle("Honda", 22000.0);
        Vehicle v3 = new Vehicle("Ford", 28000.0);

        v1.displayDetails();
        v2.displayDetails();
        v3.displayDetails();

        System.out.println("Total number of vehicles created: " + Vehicle.getVehicleCount());
    }
}
