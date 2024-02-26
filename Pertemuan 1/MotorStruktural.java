public class MotorStruktural{
    public static void main(String[] args) {
        String merek, merek2, merek3, merek4, merek5;
        String tipe, tipe2, tipe3,tipe4,tipe5;
        String   warna, warna2, warna3, warna4, warna5;
        int kecepatan, kecepatan2, kecepatan3,kecepatan4,kecepatan5;
        boolean dipakai, dipakai2, dipakai3,dipakai4,dipakai5;

        merek = "honda";
        tipe = "supra";
        warna = "hitam";
        kecepatan = 110;
        dipakai = true;

        merek2 = "yamaha";
        tipe2 = "vega";
        warna2 = "merah";
        kecepatan2 = 125;
        dipakai2 = false;

        merek3 = "kawasaki";
        tipe3 = "ninja";
        warna3 = "hijau";
        kecepatan3 = 250;
        dipakai3 = false;

        merek4 = "suzuki";
        tipe4 = "satria FU";
        warna4 = "putih";
        kecepatan4 = 150;
        dipakai4 = false;

        merek5 = "yamaha";
        tipe5 = "mio";
        warna5 = "hitam";
        kecepatan5 = 90;
        dipakai5 = true;

        kecepatan = tambahkecepatan(kecepatan, 110);
        kecepatan2 = tambahkecepatan(kecepatan2, 125);
        kecepatan3 = tambahkecepatan(kecepatan3, 250);
        kecepatan4 = tambahkecepatan(kecepatan4, 150);
        kecepatan5 = tambahkecepatan(kecepatan5,90);

        print(merek, tipe, warna, kecepatan, dipakai);
        print(merek2, tipe2, warna2, kecepatan2, dipakai2);
        print(merek3, tipe3, warna3, kecepatan3, dipakai3);
        print(merek4, tipe4, warna4, kecepatan4, dipakai4);
        print(merek5, tipe5, warna5, kecepatan5, dipakai5);
    
    }
    public  static int tambahkecepatan(int kecepatan, int increment){
        kecepatan += increment;
        return kecepatan;
}
public static int kurangikecepatan(int kecepatan, int decrement){
    kecepatan -= decrement;

    return kecepatan;
}
public static void print(String merek, String tipe, String warna, int kecepatan, boolean dipakai) {
    System.out.println("Merek       : " + merek);
    System.out.println("Tipe        : " + tipe);
    System.out.println("Warna       : " + warna);
    System.out.println("Kecepatan   : " + kecepatan);
    System.out.println("Dipakai?    : " + (dipakai ? "yes" : "no"));
    System.out.println();
}
}