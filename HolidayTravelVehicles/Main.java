import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Vehicle myVehicle = new Vehicle("MN1234B", "Isuzu D-Max", "V-Cross", 2023, "Isuzu Thailand", 1200000);
        Customer myCustomer = new Customer("C001", "Vichai Yut", "Phuket", "0812345678");
        DealerInstalledOption option1 = new DealerInstalledOption("D001", "Sunroof", 45000);
        DealerInstalledOption option2 = new DealerInstalledOption("D002", "Leather Seats", 23000);
        Invoice myInvoice = new Invoice("INV0001", myCustomer, myVehicle, Arrays.asList(option1, option2));

        System.out.println("=== Vehicle Information ===");
        System.out.println("Name: " + myVehicle.getName());
        System.out.println("Model: " + myVehicle.getModel());
        System.out.println("Year: " + myVehicle.getYear());
        System.out.println("Manufacturer: " + myVehicle.getManufacturer());
        System.out.println("Serial Number: " + myVehicle.getSerialNumber());
        System.out.println("Base Cost: " + myVehicle.getBaseCost() + "฿");
    }
}
