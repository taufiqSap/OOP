public class Mobil extends Kendaraan {
    int pintu =4;

    public Mobil (String brand,String nama,int  speed,int pintu){
        super(brand, nama,speed);{
        this.pintu = pintu;
    }
}

    String displayKendaraan(){
        return "Pintu :   " + this.pintu;
    }

    String allDisplayKendaraan(){
        String info = super.displayKendaraan();
        info += "Pintu  : " + pintu+"\n";
        return info;
    }

}
    
    




