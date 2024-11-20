public class CarMatrix {

    private String [][] carModel = {
        {"Saga", "Myvi", "Audi TT"},
        {"Bezza", "Axia", "BMW M8"},
        {"Kenari", "Kancil", "GTR R34"}
    };

    private int [][] carPrice = {
        {45000, 49000, 200000},
        {30000, 35000, 800000},
        {29000, 25000, 500000}
    };

    public void result() {

        System.out.println("\n ***** WELCOME TO CAR MATRIX SDN BHD *****\n");
        for (int row=0; row<carPrice.length; row++) {
            for (int col=0; col<carPrice[row].length; col++) {
                if(carPrice[row][col] > 50000) {
                    System.out.print("Car Model: "+carModel[row][col]+"  |  Car Price: RM"+carPrice[row][col]+"\n");
                }

            }
            
        }

    }
    public static void main(String[] args) {

        CarMatrix cm = new CarMatrix();
        cm.result();

    }
}