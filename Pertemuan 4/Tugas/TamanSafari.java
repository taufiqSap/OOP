import java.util.ArrayList;
import java.util.List;

public class TamanSafari {
    private String nama;
    private String lokasi;
    private List<Pengunjung> pengunjungList;
    private List<Hewan> hewanList;

    public TamanSafari(String nama, String lokasi) {
        this.nama = nama;
        this.lokasi = lokasi;
        this.pengunjungList = new ArrayList<>();
        this.hewanList = new ArrayList<>();
    }

    public void addPengunjung(Pengunjung pengunjung) {
        pengunjungList.add(pengunjung);
    }

    public List<Pengunjung> getPengunjung() {
        return pengunjungList;
    }
    public void addHewan(Hewan hewan){
        hewanList.add(hewan);
    }
    public List<Hewan> getHewan(){
        return hewanList;
    }

    public String getNama() {
        return nama;
    }

    public String getLokasi() {
        return lokasi;
    }
}

