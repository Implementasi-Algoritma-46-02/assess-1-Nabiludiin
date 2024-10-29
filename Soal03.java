import java.util.Scanner;
public class Soal03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan jam, menit, dan menit yang ditambahkan (H M V): ");
        int jam = input.nextInt(); 
        int menit = input.nextInt(); 
        int menitTambah = input.nextInt(); 

        int totalMenit = menit + menitTambah; 
        int jamTambahan = totalMenit / 60; 
        int menitAkhir = totalMenit % 60; 

        int jamAkhir = (jam + jamTambahan) % 24; 

        System.out.printf("%02d:%02d\n", jamAkhir, menitAkhir);
    }
}
