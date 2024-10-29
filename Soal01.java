import java.util.Scanner;

public class Soal01 {

    public static boolean cekValid(String input) {
        return input.length() == 3 &&
            input.matches("[0-9]+") &&
            input.charAt(0) < input.charAt(1) &&
            input.charAt(1) < input.charAt(2) &&
            (input.charAt(2) - '0') % 2 != 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan lima angka dari tiga digit:");

        for (int i = 1; i <= 5; i++) {
            System.out.print( "Masukkan angka "+ i + ": ");
            String input = scanner.nextLine();

            String hasil = cekValid(input) ? "valid" : "tidak valid";
            System.out.println(input + " " + hasil);
        }

    }
}