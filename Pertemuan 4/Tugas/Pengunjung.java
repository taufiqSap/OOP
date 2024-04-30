public class Pengunjung{
    private String  tiket;
    private String nama;
    private int usia;

    public Pengunjung(String tiket, String nama, int usia){
        this.tiket= tiket;
        this.nama = nama;
        this.usia = usia;
    }
    public String geTiket(){
        return tiket;
    }

    public void setTiket(String tiket){
        this.tiket = tiket;
    }

    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public  int getUsia() {
        return usia;
}
public void setUsia(int usia){
    this.usia = usia;
}
public String getInfo() {
    String info = "";
    info += "No Tiket : " + tiket + " ";
    info += "Nama : " + nama + " ";
    info += "Usia : " + usia;
    return info;
}

}
