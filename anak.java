public class anak extends orangtua {
    String nama = "Yani";
    int age = 17;
    String jeniskelamin = "Perempuan";

    public void Cetak(){
        System.out.println("anak peremuan akan cenderung seperti ayahnya jadii: ");
        System.out.println("-Anak ini memiliki sifat "+super.sifatayah);
        System.out.println("-yang bernama "+nama);
        System.out.println("-berumur "+age+"tahun");
        System.out.println("-dengan tinggi Badan "+super.tb);
        super.hobiibu();

    }
}
