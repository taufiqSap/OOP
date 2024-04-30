public class TamanMain {
    public static void main(String[] args) {
        TamanSafari tamansafari1 = new TamanSafari("TAMAN SAFARI ZOO ", "PRIGEN");
        TamanSafari tamansafari2 = new TamanSafari("SAFARI ZOO", "BOGOR");

        Pengunjung pengunjung1 = new Pengunjung("TS1", "BEJO", 29);
        Pengunjung pengunjung2 = new Pengunjung("TS2", "WISAM", 21);
        Pengunjung pengunjung3 = new Pengunjung("TS3", "FAREL", 20);
        Pengunjung pengunjung4 = new Pengunjung("TS4", "RIGEN", 20);
        Pengunjung pengunjung5 = new Pengunjung("TS5", "TAUFIQ", 20);     
        Pengunjung pengunjung6 = new Pengunjung("SB1", "AGTA", 20);
        Pengunjung pengunjung7 = new Pengunjung("SB2", "ABIMANYU", 20);
        Pengunjung pengunjung8 = new Pengunjung("SB3", "HASSAN", 20);    
      
        tamansafari1.addPengunjung(pengunjung1);
        tamansafari1.addPengunjung(pengunjung2);
        tamansafari1.addPengunjung(pengunjung3);
        tamansafari1.addPengunjung(pengunjung4);
        tamansafari1.addPengunjung(pengunjung5);
        tamansafari2.addPengunjung(pengunjung6);
        tamansafari2.addPengunjung(pengunjung7);
        tamansafari2.addPengunjung(pengunjung8);

       
        Hewan hewan1 = new Hewan("Gajah", "Mamalia");
        Hewan hewan2 = new Hewan("Singa", "Mamalia");
        Hewan hewan3 = new Hewan("Buaya", "Reptil");
        Hewan hewan4 = new Hewan("Ular", "Reptil");
        Hewan hewan5 = new Hewan("Cheetah" ,"Mamalia");
        Hewan hewan6 = new Hewan("Kudanil", "Mamalia");
        Hewan hewan7 = new Hewan("Kura-Kura Purba", "Reptil");
        Hewan hewan8 = new Hewan("Orang Utan", "Mamalia");
        Hewan hewan9 = new Hewan("Jerapah", "Mamalia");
        Hewan hewan10 = new Hewan("Merak", "Pavo");
    

        tamansafari1.addHewan(hewan1);
        tamansafari1.addHewan(hewan2);
        tamansafari1.addHewan(hewan3);
        tamansafari1.addHewan(hewan4);
        tamansafari1.addHewan(hewan5);
        tamansafari2.addHewan(hewan6);
        tamansafari2.addHewan(hewan7);
        tamansafari2.addHewan(hewan8);
        tamansafari2.addHewan(hewan9);
        tamansafari2.addHewan(hewan10);

        System.out.println();
        System.out.println("Nama: " + tamansafari1.getNama());
        System.out.println("Lokasi: " + tamansafari1.getLokasi());

}
}

