public class Meeting {
    public static void main(String[] args) {
        
        // Instructions for this workbook are on Learn the Part (see the Udemy Video: Workbook 2.4 to access the link).

        double sales = 24309.65;
        int totalSales = (int)sales;
        double profit = 18562.18;
        int totalProfit = (int)profit; 
        double refunds = 688.78;
        int refundTotal = (int)refunds;
        double shipping = 1233.57;
        int totalShipping = (int)shipping; 

        System.out.println("This month, we made $" + totalSales + " in sales");
        System.out.println("Factoring in costs, we made $" + totalProfit + " in profit");
        System.out.println("The refunds are at a low $" + refundTotal + ". This is a good sign!");
        System.out.println("Shipping costs were high. We paid $" + totalShipping + " in shipping");

        //06/01/2023
    }
}
