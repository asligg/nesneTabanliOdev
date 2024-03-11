public class Main {
    public static void main(String[] args) {
        Ogrenci ogrenci = new Ogrenci();
        Ogrenci OGR1 = new Ogrenci(null, null, 0.0, "104", "1973");
        Ogrenci OGR2 = new Ogrenci("Gökhan", "Bilgisayar Müh.", 0.0, "104", "1985");
        Ogrenci OGR3 = new Ogrenci("Ayşe", "Makine Müh.", 0.0, "104", "1985") ;
        Ogrenci OGR4 = new Ogrenci("Elif", "Elektrik-Elektronik Müh.", 1.98, "104", "2020");

        System.out.println("Öğrencilerin bilgileri");
        System.out.println("OGR1 : "+ OGR1.getAd()+" "+ OGR1.getBolum()+" "+OGR1.ogrenciNoOlustur()+" "+OGR1.getGano());
        System.out.println("OGR2 : "+ OGR2.getAd()+" "+ OGR2.getBolum()+" "+OGR2.ogrenciNoOlustur()+" "+OGR2.getGano());
        System.out.println("OGR3 : "+ OGR3.getAd()+" "+ OGR3.getBolum()+" "+OGR3.ogrenciNoOlustur()+" "+OGR3.getGano());
        System.out.println("OGR4 : "+ OGR4.getAd()+" "+ OGR4.getBolum()+" "+OGR4.ogrenciNoOlustur()+" "+OGR4.getGano());

        double harc3 = OGR3.harcHesapla(1)+OGR3.harcHesapla(4,0.0);
        double harc4 = OGR4.harcHesapla(7)+OGR4.harcHesapla(4,0.0);

        System.out.printf("\n3. öğrencinin ödeyecği harç : "+harc3);
        System.out.printf("\n4.öğrencinin ödeyeceği harç : "+harc4);
    }
}
