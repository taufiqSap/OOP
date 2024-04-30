public class Motor extends Kendaraan {
    int pedal;
    

    public Motor (String brand,String nama, int speed,int pedal){
        super(brand,nama, speed);
    }

    void berjalan(){
        System.out.println("Gas berada di tangan sebelah tangan dan motor bisa belok dengan kemiringan tertentu");
    }
    void berhenti(){
        System.out.println("motor berhenti kaki harus menyangga agar tidak jatuh ");
    }

    String displayKendaraan() {
        return "pedal : " + this.pedal;
    }
    String allDisplayKendaraan(){
        String info = super.displayKendaraan();
        info += "Pedal : " + pedal +"\n";
        return info;
    }

}

    
 

