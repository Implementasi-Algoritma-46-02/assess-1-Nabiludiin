import java.util.Scanner;
public class Soal02 {

	public static void main(final String[] args) {
		// Kerjakan soalnya di sini
		Scanner input = new Scanner(System.in);
		System.out.println("Masukkan masa studi dan nilai IPK : ");
		double masaStudi = input.nextDouble();
		double IPK = input.nextDouble();
		System.out.println("Masukkan nilai EPRT, status HKI(Ada/tidak), dan lomba(Ada/tidak) : ");
		int EPRT = input.nextInt();
		input.nextLine();
		String statusHKI = input.nextLine();
		String lomba = input.nextLine();

		if (masaStudi == 3.0 && IPK >= 3.5 && EPRT >= 450 ) {
			if (statusHKI.equals("ada") || lomba.equals("ada")) {
				System.out.print("Cumlaude");
			}
		} else {
			System.out.println("Tidak cumlaude");
		}

	}
}
