import java.util.Scanner;

public class WeeklySales2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("How many salespeople? ");
        int numSalespeople = scan.nextInt();
        scan.nextLine();

        Salesperson[] salesStaff = new Salesperson[numSalespeople];

        for (int i = 0; i < numSalespeople; i++) {
            System.out.print("Enter first name: ");
            String firstName = scan.nextLine();

            System.out.print("Enter last name: ");
            String lastName = scan.nextLine();

            System.out.print("Enter total sales: ");
            int totalSales = scan.nextInt();
            scan.nextLine();

            salesStaff[i] = new Salesperson(firstName, lastName, totalSales);
        }

        Sorting.insertionSort(salesStaff);

        System.out.println("Sales staff in order of sales:");
        for (Salesperson sp : salesStaff) {
            System.out.println(sp);
        }
    }
}
