

public class Dosen extends Pegawai {
public String nidn;

  public Dosen(String nip, String nama, double gaji, String nidn){
    super(nip,nama,gaji);
    super.nip = nip;
    super.nama = nama;
    super.gaji = gaji;
    this.nidn = nidn;
    
        
}
public String getInfo(){
  return "NIDN          : " +this.nidn + "\n";         
}
public String getAllInfo(){
  String info = super.getInfo();
    info += "NIDN        : " + nidn;
    return info;
}
}
    

