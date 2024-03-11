public class Ogrenci {
    private String ad ;
    private String bolum;
    private double gano;
    private int ogrNo;
    private String bolumKodu;
    private String  girisYili;

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public double getGano() {
        return gano;
    }

    public void setGano(double gano) throws IllegalArgumentException {
        if (gano<0 || gano>4){
            throw  new IllegalArgumentException("Gano 0 ile 4 arasında olmalıdır!");
        }
        this.gano = gano;
    }

    public int getOgrNo() {
        return ogrNo;
    }

    public void setOgrNo(int ogrNo) {
        this.ogrNo = ogrNo;
    }

    public String getBolumKodu() {
        return bolumKodu;
    }

    public void setBolumKodu(String bolumKodu) {
        this.bolumKodu = bolumKodu;
    }

    public String getGirisYili() {
        return girisYili;
    }

    public void setGirisYili(String girisYili) {
        this.girisYili = girisYili;
    }

    public Ogrenci(String ad, String bolum ) {
        this.ad=ad;
        this.bolum=bolum;
    }
    public Ogrenci(Ogrenci ogrenci){
    }
    public Ogrenci(String ad,String bolum,double gano,String bolumKodu,String girisYili){
        this.ad=ad;
        this.bolum=bolum;
        this.gano=gano;
        this.bolumKodu=bolumKodu;
        this.girisYili=girisYili;
    }
    public Ogrenci(){
    this("","",0.0,"0","");
    }
    public double harcHesapla(int uzatilanYil){
     return uzatilanYil*80;
    }
    public double harcHesapla(int dersSayisi,double harcUcreti){
        harcUcreti = dersSayisi*100;
        return harcUcreti ;
    }
    public String  ogrenciNoOlustur (){
        //girişyılı + bölümkodu + girişsırası
        String girisYil= String.valueOf(getGirisYili());
        String ogrNo = girisYil+bolumKodu+"001";
        return  ogrNo;
    }
}
