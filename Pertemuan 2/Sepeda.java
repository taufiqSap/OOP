public class Sepeda{
    float kecepatan;
    int gear;

    public Sepeda(float newKecepatam, int newGear){
        kecepatan = newKecepatam;
        gear = newGear;
    }

    public void tambahKecepatan(float increment){
        kecepatan += increment;
        if (kecepatan > 20) {
            kecepatan = 20;
        }
    }

    public void kurangiKecepatan(float decrement){
        kecepatan -= decrement;
        if (kecepatan < 0) {
            kecepatan = 0;
        }
    }
    public void cetakInfo(){
        System.out.println("kecepatan: " + kecepatan );
        System.out.println("Gear: " + gear);
        System.out.println("===================");
    }
}