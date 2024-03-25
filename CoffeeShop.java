package quizes.q2.luka_khelashvili_2.drums;

public class CoffeeShop {

    public static void main(String[] args) {
        int pricePerCoffee = 250; // tetri
        int numCoffeeSold = 100;
        int totalCostOfBeans = 15000; // tetri
        int Tax = 9000;
        int Water = 57;
        int Gas = 253;
        int Electricity = 5400;
        int Parking = 8300;
        int totalExpenses;

        // TODO 1
        // include all the expences that are provided in the expences.txt file

        double profit = calculateProfit(pricePerCoffee, numCoffeeSold, totalCostOfBeans, Tax, Water, Gas, Electricity, Parking);
    }

    public static double calculateProfit(int pricePerCoffee, int numCoffeeSold, int totalCostOfBeans, int Tax, int Water, int Gas, int Electricity, int Parking) {

        // TODO 2
        // Finish this function
        System.out.println(((pricePerCoffee*numCoffeeSold) - Tax - Water - Gas - Electricity - Parking - totalCostOfBeans) / 100);
        return ((pricePerCoffee*numCoffeeSold) - Tax - Water - Gas - Electricity - Parking - totalCostOfBeans) / 100;
    }
}
