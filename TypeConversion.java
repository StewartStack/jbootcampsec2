public class TypeConversion {

    public static void main(String[] args) {

        int ants = 2000;
        int purchasedBlocksOfCheese = 1;

        System.out.println("There are " + ants + " ants, and " + purchasedBlocksOfCheese + " block of cheese.");
        System.out.println("Each ant carried " + ((double)purchasedBlocksOfCheese / ants) + " from the total cheese amount"); 

        //converting double to an int
        double salary = 5423.94;
        int roundedSalary = (int)salary;
        System.out.println("Mortgage Broker: What is your monthly salary in dollars?");
        System.out.println("My monthly salary is: " + roundedSalary);

        //Reversed Converting int to double.
        int buses = 656;
        double totalBuses = (double)buses;
        System.out.println("How many buses are available?");
        System.out.println("There are " + totalBuses + " available");

    }

}
