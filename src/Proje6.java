import java.util.Scanner;

public class Proje6 {
    public static void main(String[] args) {
        int sayilar[] = new int[10];
        int enbuyuk,enbuyukindex;
        enbuyuk = sayilar[0];
        enbuyukindex=0;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < sayilar.length; i++) {
            System.out.println((i + 1) + ". Sayıyı giriniz");
            sayilar[i] = scanner.nextInt();
        }
        for (int j = 0; j < sayilar.length; j++) {
            if (sayilar[j] > enbuyuk) {
                enbuyuk = sayilar[j];
                enbuyukindex = j+1;
            }
        }
        System.out.println("Girdiğiniz sayıların en büyüğü " + enbuyuk + " ve girdiğiniz "+enbuyukindex+". sayı en büyük sayıdır.");
        scanner.close();
    }
}