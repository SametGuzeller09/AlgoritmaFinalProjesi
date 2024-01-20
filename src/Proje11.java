import java.util.Scanner;
import java.util.Random;

public class Proje11 {
    public static void main(String[] args) {
        int kullanici, bilgisayar, kskor = 0, bskor = 0;
        Random random = new Random();
        bilgisayar = random.nextInt(3);
        Scanner scanner = new Scanner(System.in);
        System.out.println("bilgisayar oynadı sıra sizde: ");
        System.out.println("0 taş");
        System.out.println("1 kağıt");
        System.out.println("2 makas");
        System.out.println();
        System.out.println("Lütfen seçiminizi yapınız");
        kullanici = scanner.nextInt();

        while (bskor < 3 && kskor < 3) {
            if (bilgisayar == kullanici) {
                System.out.println();
                System.out.println("berabere iki tarafa da skor yok bilgisayarın hamlesi: " + bilgisayar);
                System.out.println();
                System.out.println("Toplam Skor: Kullanıcı: " + kskor + " Bilgisayar: " + bskor);
                System.out.println();
                bilgisayar = random.nextInt(3);
                System.out.println("Sonraki tur bilgisayar oynadı sıra sizde: ");
                System.out.println("0 taş");
                System.out.println("1 kağıt");
                System.out.println("2 makas");
                System.out.println();
                System.out.println("Lütfen seçiminizi yapınız");
                kullanici = scanner.nextInt();
            }
            if (bilgisayar == 0 && kullanici == 1) {
                System.out.println();
                System.out.println("Kullanıcı kazandı bilgisayarın hamlesi: " + bilgisayar);
                System.out.println();
                kskor++;
                System.out.println("Toplam Skor: Kullanıcı: " + kskor + " Bilgisayar: " + bskor);
                System.out.println();
                if(bskor==3 || kskor==3){
                    if (bskor == 3) {
                        System.out.println("Bilgisayar Kazandı");
                        scanner.close();
                        break;
                    }
                    if (kskor == 3) {
                        System.out.println("Tebrikler Oyunu Kullanıcı Kazandı");
                        scanner.close();
                        break;
                    }
                }
                bilgisayar = random.nextInt(3);
                System.out.println("Sonraki tur bilgisayar oynadı sıra sizde: ");
                System.out.println("0 taş");
                System.out.println("1 kağıt");
                System.out.println("2 makas");
                System.out.println();
                System.out.println("Lütfen seçiminizi yapınız");
                kullanici = scanner.nextInt();
            }
            if (bilgisayar == 0 && kullanici == 2) {
                System.out.println();
                System.out.println("bilgisayar kazandı bilgisayarın hamlesi: " + bilgisayar);
                System.out.println();
                bskor++;
                System.out.println("Toplam Skor: Kullanıcı: " + kskor + " Bilgisayar: " + bskor);
                System.out.println();
                if(bskor==3 || kskor==3){
                    if (bskor == 3) {
                        System.out.println("Bilgisayar Kazandı");
                        scanner.close();
                        break;
                    }
                    if (kskor == 3) {
                        System.out.println("Tebrikler Oyunu Kullanıcı Kazandı");
                        scanner.close();
                        break;
                    }
                }
                bilgisayar = random.nextInt(3);
                System.out.println("Sonraki tur bilgisayar oynadı sıra sizde: ");
                System.out.println("0 taş");
                System.out.println("1 kağıt");
                System.out.println("2 makas");
                System.out.println();
                System.out.println("Lütfen seçiminizi yapınız");
                kullanici = scanner.nextInt();
            }
            if (bilgisayar == 1 && kullanici == 0) {
                System.out.println();
                System.out.println("bilgisayar kazandı bilgisayarın hamlesi: " + bilgisayar);
                System.out.println();
                bskor++;
                System.out.println("Toplam Skor: Kullanıcı: " + kskor + " Bilgisayar: " + bskor);
                System.out.println();
                if(bskor==3 || kskor==3){
                    if (bskor == 3) {
                        System.out.println("Bilgisayar Kazandı");
                        scanner.close();
                        break;
                    }
                    if (kskor == 3) {
                        System.out.println("Tebrikler Oyunu Kullanıcı Kazandı");
                        scanner.close();
                        break;
                    }
                }
                bilgisayar = random.nextInt(3);
                System.out.println("Sonraki tur bilgisayar oynadı sıra sizde: ");
                System.out.println("0 taş");
                System.out.println("1 kağıt");
                System.out.println("2 makas");
                System.out.println();
                System.out.println("Lütfen seçiminizi yapınız");
                kullanici = scanner.nextInt();
            }
            if (bilgisayar == 1 && kullanici == 2) {
                System.out.println();
                System.out.println("Kullanıcı kazandı bilgisayarın hamlesi: " + bilgisayar);
                System.out.println();
                kskor++;
                System.out.println("Toplam Skor: Kullanıcı: " + kskor + " Bilgisayar: " + bskor);
                System.out.println();
                if(bskor==3 || kskor==3){
                    if (bskor == 3) {
                        System.out.println("Bilgisayar Kazandı");
                        scanner.close();
                        break;
                    }
                    if (kskor == 3) {
                        System.out.println("Tebrikler Oyunu Kullanıcı Kazandı");
                        scanner.close();
                        break;
                    }
                }
                bilgisayar = random.nextInt(3);
                System.out.println("Sonraki tur bilgisayar oynadı sıra sizde: ");
                System.out.println("0 taş");
                System.out.println("1 kağıt");
                System.out.println("2 makas");
                System.out.println();
                System.out.println("Lütfen seçiminizi yapınız");
                kullanici = scanner.nextInt();
            }
            if (bilgisayar == 2 && kullanici == 0) {
                System.out.println();
                System.out.println("Kullanıcı kazandı bilgisayarın hamlesi: " + bilgisayar);
                System.out.println();
                kskor++;
                System.out.println("Toplam Skor: Kullanıcı: " + kskor + " Bilgisayar: " + bskor);
                System.out.println();
                if(bskor==3 || kskor==3){
                    if (bskor == 3) {
                        System.out.println("Bilgisayar Kazandı");
                        scanner.close();
                        break;
                    }
                    if (kskor == 3) {
                        System.out.println("Tebrikler Oyunu Kullanıcı Kazandı");
                        scanner.close();
                        break;
                    }
                }
                bilgisayar = random.nextInt(3);
                System.out.println("Sonraki tur bilgisayar oynadı sıra sizde: ");
                System.out.println("0 taş");
                System.out.println("1 kağıt");
                System.out.println("2 makas");
                System.out.println();
                System.out.println("Lütfen seçiminizi yapınız");
                kullanici = scanner.nextInt();
            }
            if (bilgisayar == 2 && kullanici == 1) {
                System.out.println();
                System.out.println("bilgisayar kazandı bilgisayarın hamlesi: " + bilgisayar);
                System.out.println();
                bskor++;
                System.out.println("Toplam Skor: Kullanıcı: " + kskor + " Bilgisayar: " + bskor);
                System.out.println();
                if(bskor==3 || kskor==3){
                    if (bskor == 3) {
                        System.out.println("Bilgisayar Kazandı");
                        scanner.close();
                        break;
                    }
                    if (kskor == 3) {
                        System.out.println("Tebrikler Oyunu Kullanıcı Kazandı");
                        scanner.close();
                        break;
                    }
                }
                bilgisayar = random.nextInt(3);
                System.out.println("Sonraki tur bilgisayar oynadı sıra sizde: ");
                System.out.println("0 taş");
                System.out.println("1 kağıt");
                System.out.println("2 makas");
                System.out.println();
                System.out.println("Lütfen seçiminizi yapınız");
                kullanici = scanner.nextInt();
            }
        }     
    }
}