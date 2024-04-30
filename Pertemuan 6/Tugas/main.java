public class main {
    public static void main(String[] args) {
        
      Mobil car1 = new Mobil("HONDA", "JAZZ", 3000, 4);
      Mobil car2 = new Mobil("LAMBORGINI", "AVENTADOR", 5000, 2);
      Motor bike = new Motor("KAWASAKI", "NINJA", 250, 2);
        
        System.out.println("==================");
        System.out.println(car1.allDisplayKendaraan());
        car1.berjalan();
        car1.berhenti();       
        System.out.println("==================");
        System.out.println(car2.allDisplayKendaraan());
        car2.berjalan();
        System.out.println("==================");
        System.out.println(bike.allDisplayKendaraan());
        bike.berjalan();
        bike.berhenti();
        System.out.println("==================");

        

    }
    
}
