public abstract class Kendaraan{
    String brand;
    String nama;
    int speed;



    Kendaraan(String brand,String nama, int speed){
        this.brand = brand;
        this.nama = nama;
        this.speed = speed;
        
    }

   

   abstract void berjalan ();
   abstract void berhenti ();

   
   String displayKendaraan(){
    String info = "";
    info += "Brand : " + brand +"\n" ;
    info += "Nama  : " + nama +"\n";
    info += "Speed : " + speed+ "cc" + "\n";
     return info;
   }

   }

   