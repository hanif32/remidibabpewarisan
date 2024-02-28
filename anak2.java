public class anak2 extends orangtua {
    String nama = "Muhaimin";
    int age = 16;
    String jeniskelamin = "Lakilaki";

    public void Cetak(){
        System.out.println("anak laki laki akan cenderung seperti ibunya jadi: ");
        System.out.println("-Anak ini memiliki sifat "+super.sifatibu);
        System.out.println("-yang bernama "+nama);
        System.out.println("-berumur "+age+"tahun");
        System.out.println("-dengan tinggi Badan "+super.tb);
        super.hobiayah();

    }
}