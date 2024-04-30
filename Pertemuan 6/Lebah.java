public class Lebah extends Hewan {
    private String kasta;

    public Lebah(String kasta, double berat, String makanan, String habitat) {
        super(berat, makanan, habitat);
        this.kasta = kasta;
    }

    public void bergerak() {
        System.out.println("Otot perut mengendur, udara masuk melalui lubang di segmen tubuh");
        System.out.println("Trakea mengirim oksigen");
        System.out.println("Otot perut berkontraksi");
    }

    public void bernapas(){
        System.out.println("Mengepakkan sayap ke depan");
        System.out.println("Memutar sayap hampir 90 derajat");
        System.out.println("Mengepakkan sayap ke belakang");
    }
public void cetakInfo(){
    super.cetakInfo();
    System.out.println("kasta  : " + this.kasta);
}
}