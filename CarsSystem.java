import java.util.Scanner;

public class CarsSystem {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter First Model: ");
        String firstModel = scanner.nextLine();
        System.out.println("Enter First Car Years: ");
        int firstYears = scanner.nextInt();
        System.out.println("Enter First Car Price: ");
        Double firstPrice = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Enter Second Model: ");
        String secondModel = scanner.nextLine();
        System.out.println("Enter Second Car Years: ");
        int secondYears = scanner.nextInt();
        System.out.println("Enter Second Car Price: ");
        Double secondPrice = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Enter Third Model: ");
        String thirdModel = scanner.nextLine();
        System.out.println("Enter Third Car Years: ");
        int thirdYears = scanner.nextInt();
        System.out.println("Enter Third Cars Price: ");
        Double thirdPrice = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("car first model:"+firstModel+" Year:"+firstYears+" Price: RM"+firstPrice);
        System.out.println("car second model:"+secondModel+" Year:"+secondYears+" Price: RM"+secondPrice);
        System.out.println("car third model:"+thirdModel+" Year:"+thirdYears+" Price: RM"+thirdPrice);
        Double avgPrice = (firstPrice+secondPrice+thirdPrice)/3;

        System.out.println("Average Price: RM"+String.format("%.2f",avgPrice));

    }
}
