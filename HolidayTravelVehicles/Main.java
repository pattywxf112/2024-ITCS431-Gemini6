import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Vehicle myVehicle = new Vehicle("MN1234B", "Isuzu D-Max", "V-Cross", 2023, "Isuzu Thailand", 1200000);
        Customer myCustomer = new Customer("C001", "Vichai Yut", "Phuket", "0812345678");
        DealerInstalledOption option1 = new DealerInstalledOption("D001", "Sunroof", 45000);
        DealerInstalledOption option2 = new DealerInstalledOption("D002", "Leather Seats", 23000);

        Invoice myInvoice = new Invoice("INV0001", myCustomer, myVehicle, Arrays.asList(option1, option2), 1268000);

        myInvoice.displayInfo();
    }
}
