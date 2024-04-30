public class Motor extends Kendaraan {
    int pedal = 2;
    

    public Motor (String brand,String nama, int speed,int pedal){
        super(brand,nama, speed);
        this.pedal = pedal;
        
    }

    String displayKendaraan() {
        return "pedal : " + this.pedal;
    }
    String allDisplayKendaraan(){
        String info = super.displayKendaraan(); //super digunakan untuk mengambil nilai dari super class
        info += "Pedal : " + pedal +"\n";
        return info;
    }

}

    
 

