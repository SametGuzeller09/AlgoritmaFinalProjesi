import java.util.Scanner;

public class Proje2 {
    public static void main(String[] args) {
        String kelime; int kuzunluk;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir kelime giriniz.");
        kelime = scanner.nextLine();
        kuzunluk = kelime.length()- 1;
        for (int i = 0; i < kelime.length();) {
            i++;
            if (kelime.charAt(i) == kelime.charAt(kuzunluk - i)) {               
                System.out.println("Bu bir palindrome kelimedir: " + kelime);
                break;
            } else {
                System.out.println("Palindrome değildir");
                break;
            }
        }
        scanner.close();
    }
}