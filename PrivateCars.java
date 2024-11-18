import java.util.Scanner; // Import the Scanner class

public class PrivateCars {
    private String model;
    private String make;
    private double price;

    public PrivateCars(String model, String make, double price) {
        this.model = model;
        this.make = make;
        this.price = price;

    }

    public void displayCars() {
        String modelShow = "Model: ";
        String makerShow = "Maker: ";
        System.out.println(modelShow + model);
        System.out.println(makerShow + make);
        System.out.println("Price: RM" + price);
    }

    public static void main(String[] args) {
        PrivateCars pc = new PrivateCars("BMW", "2018", 500000.00);
        PrivateCars pc1 = new PrivateCars("Mercedes", "2020", 800000.00);
        PrivateCars pc2 = new PrivateCars("Lambogini", "2022", 1000000.00);

        pc.displayCars();
        pc1.displayCars();
        pc2.displayCars();

        Double avgPrice = (pc.price + pc1.price + pc2.price)/3;
        System.out.println("The Average of Car Price: RM" + avgPrice);
    }
}
