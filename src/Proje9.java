import java.util.Scanner;

public class Proje9 {
    public static void main(String[] args) {
        int sayi,uzunluk = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı girin");
        sayi = scanner.nextInt();

        int sayilar[] = new int[20];

        while (sayi > 0) {
            sayilar[uzunluk++] = sayi % 2;
            sayi = sayi / 2;
        }
        System.out.print("binary'deki karşılığı: ");
        for (int i = uzunluk - 1; i >= 0; i--) {
            System.out.print(sayilar[i]);
        }
      scanner.close();
    }
}