import java.util.Scanner;

public class SimpleBMICalculator {

    public static void main(String[] args) {
        // Membuat objek Scanner untuk input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Input berat badan dalam kg
        System.out.print("Masukkan berat badan (kg): ");
        double beratBadan = scanner.nextDouble();

        // Input tinggi badan dalam meter
        System.out.print("Masukkan tinggi badan (m): ");
        double tinggiBadan = scanner.nextDouble();

        // Menghitung BMI
        double bmi = beratBadan / (tinggiBadan * tinggiBadan);

        // Menampilkan hasil BMI
        System.out.printf("BMI Anda adalah: %.2f\n", bmi);

        // Menentukan kategori BMI
        if (bmi < 18.5) {
            System.out.println("Kategori: Kekurangan Berat Badan");
        } else if (bmi >= 18.5 && bmi < 24.9) {
            System.out.println("Kategori: Normal (Ideal)");
        } else if (bmi >= 25 && bmi < 29.9) {
            System.out.println("Kategori: Kelebihan Berat Badan");
        } else {
            System.out.println("Kategori: Obesitas");
        }

        // Menutup scanner
        scanner.close();
    }
}
