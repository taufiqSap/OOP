public class main {
    public static void main(String[] args) {
        
        Mobil car = new Mobil("LAMBORGINI", "HURICAN", 5000, 2); // objek dari class mobil
        Motor bike = new Motor("KAWASAKI", "NINJA", 250, 2);
        Mobil car2 = new Mobil("HONDA", "JAZZ", 2000, 4);
        
        System.out.println("==================");
        //bike.allDisplayKendaraan();
      //  System.out.println(bike.allDisplayKendaraan());
        System.out.println("==================");
        System.out.println(car.displayKendaraan());
      //  System.out.println(car.allDisplayKendaraan());
        System.out.println("==================");
       // System.out.println(car2.allDisplayKendaraan());
        System.out.println("\n");

        

    }
    
}
