import java.util.Scanner;

public class Soal01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Masukkan lima angka yang terdiri dari tiga digit bilangan bulat : ");
        int id1 = scanner.nextInt();
        int id2 = scanner.nextInt();
        int id3 = scanner.nextInt();
        int id4 = scanner.nextInt();
        int id5 = scanner.nextInt();

        System.out.println(id1 + " " + (isValidId(id1) ? "Valid" : "Tidak Valid"));
        System.out.println(id2 + " " + (isValidId(id2) ? "Valid" : "Tidak Valid"));
        System.out.println(id3 + " " + (isValidId(id3) ? "Valid" : "Tidak Valid"));
        System.out.println(id4 + " " + (isValidId(id4) ? "Valid" : "Tidak Valid"));
        System.out.println(id5 + " " + (isValidId(id5) ? "Valid" : "Tidak Valid"));
    }
    public static boolean isValidId(int id) {
        String idString = Integer.toString(id);
        if (idString.length() != 3) {
            return false;
        }
        int digit1 = Character.getNumericValue(idString.charAt(0));
        int digit2 = Character.getNumericValue(idString.charAt(1));
        int digit3 = Character.getNumericValue(idString.charAt(2));

        if (digit1 == digit2 || digit2 == digit3 || digit1 == digit3) {
            return false;
        }
        return (digit1 <= digit2 && digit2 <= digit3 && digit3 % 2 != 0);
    }
}
