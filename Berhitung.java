import java.util.Scanner;

public class Berhitung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membaca input
        int A = scanner.nextInt();
        char operator = scanner.next().charAt(0);
        int B = scanner.nextInt();

        // Inisialisasi hasil
        int result = 0;

        // Melakukan operasi sesuai operator yang diberikan
        switch (operator) {
            case '+':
                result = A + B;
                break;
            case '-':
                result = A - B;
                break;
            case '*':
                result = A * B;
                break;
            case '/':
                result = A / B;
                break;
            case '%':
                result = A % B;
                break;
        }

        // Mencetak hasil
        System.out.println(result);

        scanner.close();
    }
}