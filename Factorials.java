import java.util.Scanner;

public class Factorials {
    public static void main(String[] args) {
        String keepGoing = "y";
        Scanner scan = new Scanner(System.in);

        while (keepGoing.equals("y") || keepGoing.equals("Y")) {
            try {
                // Meminta pengguna memasukkan integer
                System.out.print("Enter an integer: ");
                int val = scan.nextInt();

                // Mencetak hasil faktorial
                System.out.println("Factorial(" + val + ") = " + MathUtils.factorial(val));

            } catch (IllegalArgumentException e) {
                // Menangkap exception dan menampilkan pesan kesalahan
                System.out.println(e.getMessage());
            }

            // Meminta pengguna untuk memasukkan faktorial lain atau berhenti
            System.out.print("Another factorial? (y/n) ");
            keepGoing = scan.next();
        }
    }
}
