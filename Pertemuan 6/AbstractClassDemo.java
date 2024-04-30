public class AbstractClassDemo {
    public static void main(String[] args) {
        // Membuat objek Lebah
        Lebah lebah1 = new Lebah("Ratu", 0.05, "Nektar", "Hutan");
        
        // Memanggil metode-metode pada objek Lebah
        lebah1.cetakInfo();
        lebah1.bergerak();
        lebah1.bernapas();
        
        // Membuat objek Ular
        Ular ular1 = new Ular(true, 20, "Tikus", "Sawah");
        
        // Memanggil metode-metode pada objek Ular
        ular1.cetakInfo();
        ular1.bergerak();
        ular1.bernapas();
    }
}
