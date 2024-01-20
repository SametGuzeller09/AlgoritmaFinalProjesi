
//                                                                 PROJE 19

public class Pazaryeri {
    String thisİsim;
    String thisRenk;
    String thisSahiplik;

    public Pazaryeri(String isim, String renk, String sahiplik) {
        thisİsim = isim;
        thisRenk = renk;
        thisSahiplik = sahiplik;
    }

    public static void main(String[] args) {
        Pazaryeri obje = new Pazaryeri("Muz", "Sarı", "Yerli");
        System.out.println("Meyve: " + obje.thisİsim);
        System.out.println("Renk: " + obje.thisRenk);
        System.out.println("Sahiplik: " + obje.thisSahiplik);
    }

    public void setPazaryeriBilgileri(String isim, String renk, String sahiplik) {
        this.thisİsim = isim;
        this.thisRenk = renk;
        this.thisSahiplik = sahiplik;
    }

    public void setPazaryeriBilgileri(String isim, String renk) {
        this.thisİsim = isim;
        this.thisRenk = renk;
    }

    public String getIsim() {
        return thisİsim;
    }

    public String getRenk() {
        return thisRenk;
    }

    public String getSahiplik() {
        return thisSahiplik;
    }

    public String PazaryeriTuru() {
        return "belirsiz";
    }

}