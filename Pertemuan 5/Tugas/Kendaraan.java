public class Kendaraan{
    String brand;
    String nama;
    int speed;



    Kendaraan(String brand,String nama, int speed){  //konstruktor
        this.brand = brand; 
        this.nama = nama; 
        this.speed = speed;
        
    }



   
   
   String displayKendaraan(){
    String info = "";
    info += "Brand : " + brand +"\n" ;
    info += "Nama  : " + nama +"\n";
    info += "Speed : " + speed+ "cc" + "\n";

     return info;
   }

   }

   