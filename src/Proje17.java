import java.util.Scanner;

public class Proje17 {
    public static void main(String[] args) {
        String kelime, sesliharfler = "aeıioöuüAEIİOÖUÜ";
        int sayac = 0;
        Scanner scn = new Scanner(System.in);
        System.out.println("Bir kelime giriniz");
        kelime = scn.nextLine();
        for (int i = 0; i < kelime.length(); i++) {
            for (int j = 0; j < sesliharfler.length(); j++) {
                if (kelime.charAt(i) == sesliharfler.charAt(j)) {
                    sayac++;
                }
            }
        }
        System.out.println("kelimenizde " + sayac + " adet sesli ve "+(kelime.length() - sayac) + " adet sessiz harf vardır.");
        scn.close();
    }
}