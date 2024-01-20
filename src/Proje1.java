import java.util.Scanner;
import java.util.Random;

public class Proje1 {
    public static void main(String[] args) throws Exception {
        int tutulansayi, girilensayi, tahmin = 1;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        tutulansayi = random.nextInt(100);
        System.out.println("Lütfen 0-100 arasında bir sayı tahmin ediniz");
        girilensayi = scanner.nextInt();

        while (girilensayi < 0 || girilensayi > 100) {
            System.out.println("Lütfen Oyunu 0-100 aralığında oynayınız");
            System.out.println();
            System.out.println("Lütfen 0-100 arasında bir sayı tahmin ediniz");
            girilensayi = scanner.nextInt();
        }

        while (girilensayi >= 0 && girilensayi < 101) {
            if (girilensayi == tutulansayi && tahmin == 1) {
                System.out.println("Tebrikler ilk seferde buldunuz");
                break;
            }
            if (girilensayi > tutulansayi) {
                tahmin++;
                System.out.println("Daha küçük sayı tahmin ediniz");
                System.out.println();
                System.out.println("Tekrar 1-100 arası sayı tahmin ediniz");
                girilensayi = scanner.nextInt();
            }
            if (girilensayi < tutulansayi) {
                tahmin++;
                System.out.println("Daha büyük sayı tahmin ediniz");
                System.out.println();
                System.out.println("Tekrar 1-100 arası sayı tahmin ediniz");
                girilensayi = scanner.nextInt();
            }
            if (girilensayi == tutulansayi) {
                System.out.println("Tebrikler oyunu " + tahmin + ". denemede kazandınız");
                break;
            }
        }
        scanner.close();
    }
}