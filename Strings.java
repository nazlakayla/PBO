import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("How many strings do you want to sort? ");
        int n = scan.nextInt();
        scan.nextLine();

        String[] strings = new String[n];

        System.out.println("Enter the strings:");
        for (int i = 0; i < n; i++) {
            strings[i] = scan.nextLine();
        }

        Sorting.insertionSort(strings);

        System.out.println("Sorted strings:");
        for (String str : strings) {
            System.out.println(str);
        }
    }
}
