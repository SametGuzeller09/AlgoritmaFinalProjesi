public class Proje10 {
    public static void main(String[] args) {
        System.out.print("İlk 20 Asal Sayı = ");
        for (int i = 2; i < 75; i++) {
            int sayac = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    sayac++;
                }
            }
            if (sayac == 0) {
                System.out.print(i+" ");
            }
        }
    }
}