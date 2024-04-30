public class Hewan {
    private String nama;
    private String tipe;

    public Hewan(String nama, String tipe){
        this.nama = nama;
        this.tipe = tipe;
    }
    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public String  getTipe(){
        return tipe;
    }
    public void setTipe(String tipe){
        this.tipe = tipe;
    }
    public String getHewan() {
        return "Nama: " + nama + ", Tipe: " + tipe;
    }
}
