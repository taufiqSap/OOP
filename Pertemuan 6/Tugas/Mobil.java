public class Mobil extends Kendaraan {
    int pintu;


    public Mobil(String brand, String nama, int speed, int pintu) {
        super(brand, nama, speed);
        this.pintu = pintu;
    
        
    }

    void berjalan() {
        System.out.println("Menginjak gass dengan kaki agar mobil bisa berjalan");
    }

    void berhenti() {
        System.out.println("Saat mobil berhenti harus menarik tuas Rem tangan");
    }

    String displayKendaraan() {
        return "Pintu :   " + this.pintu;
    }

    String allDisplayKendaraan() {
        String info = super.displayKendaraan();
        info += "Pintu  : " + pintu + "\n";
        return info;
    }

}
