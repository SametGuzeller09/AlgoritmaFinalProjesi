public class Proje8 {
   public static void main(String[] args) {
    int dizi[] = new int[21];
    dizi[0] = 0;
    dizi[1] = 1;
    System.out.print("İlk 20 Fibonacci Sayısı: "+dizi[1]+" ");
    for (int i = 2; i < 21; i++) {
      dizi[i] = dizi[i - 1] + dizi[i - 2];
      System.out.print(dizi[i]+" ");
    }
  }
}