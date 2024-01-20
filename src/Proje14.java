import java.text.ParseException;
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Proje14 {
    public static void main(String[] args) throws ParseException {
        Date tarih1, tarih2;
        long gun=0, yil=0, ay=0;
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        Scanner scanner = new Scanner(System.in);
        System.out.println("İlk tarihi giriniz.(gg.aa.yy/12.05.1990)");
        String trh1 = scanner.nextLine();
        System.out.println("İkinci tarihi giriniz.(gg.aa.yy)");
        String trh2 = scanner.nextLine();

        tarih1 = format.parse(trh1);
        tarih2 = format.parse(trh2);

        yil = Math.abs(tarih1.getYear() - tarih2.getYear());

        ay = Math.abs(tarih1.getMonth() - tarih2.getMonth());

        gun = Math.abs(tarih1.getDate() - tarih2.getDate());

        System.out.println("İki tarih arasındaki fark: " + yil + " yıl " + ay + " ay " + gun + " gündür.");
        scanner.close();
    }
}