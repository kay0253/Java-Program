import java.util.Scanner;

public class VipSystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int carPrice = 0;

        System.out.println("Enter the number of Your Car Model:\n 1.BMW \n 2.Audi \n 3.Produa");
        int cars = sc.nextInt();

        switch (cars) {
            case 1:
                carPrice = 150000;
                break;
            case 2:
                carPrice = 100000;
                break;
            case 3:
                carPrice = 40000;
                break;
            default:
            System.out.println("Invalid 404");
            System.exit(0);
        }

        if (cars<4) {
            System.out.println("The price of your car model is RM"+ carPrice);
        }

        if (carPrice>=100000){ 
            System.out.println("You are the VIP");      
        } else {
            System.out.println("You Are Not the VIP");
        }

    }
    
}
