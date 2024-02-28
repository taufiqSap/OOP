public class Anggota {
    public String noKtp;
    public String nama;
    private double limitPinjaman;
    private double jumlahPinjaman;

    public Anggota(String noKtp, String nama, double limitPinjaman) {
        this.noKtp = noKtp;
        this.nama = nama;
        this.limitPinjaman = limitPinjaman;
        jumlahPinjaman = 0;
    }

    public String getNoKtp() {
        return noKtp;
    }

    public String getNama() {
        return nama;
    }

    public double getLimitPinjaman() {
        return limitPinjaman;
    }

    public double getJumlahPinjam() {
        return jumlahPinjaman;
    }

    public boolean pinjam(double nominal) {
        if (nominal <= 0) {
            return false;
        }
        if (nominal > limitPinjaman - jumlahPinjaman) {
            return false;
        }
        jumlahPinjaman += nominal;
        return true;
    }

    public boolean angsur(double nominal) {
        if (nominal <= 0 || nominal < jumlahPinjaman * 1.5) {
            System.out.println("Maaf, angsuran harus 10% dari jumlah pinjaman");
            return false;
        }
        if (nominal > jumlahPinjaman) {
            return false;
        }
        jumlahPinjaman -= nominal;
        return true;
    }

    public void print() {
        System.out.println("=============================");
        System.out.println("No KTP : " + noKtp);
        System.out.println("Nama: " + nama);
        System.out.println("limit pinjaman: " + limitPinjaman);
        System.out.println("jumlah pinjaman: " + jumlahPinjaman);
        System.out.println("===========================");
    }
}
