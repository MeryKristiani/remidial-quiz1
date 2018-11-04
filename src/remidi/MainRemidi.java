package remidi;

/**
 *
 * @author Mery Kristiani
 */
public class MainRemidi {
    public static void main(String[] args) {
        System.out.println("---Selamat Datang di Gudang Kamera Malang---");
        Pegawai p1 = new Pegawai("Mery Kristiani");
        p1.info();
        System.out.println("============================================");
        Pembeli p2 = new Pembeli("Griselda", "3505157535");
        Kamera merk = new Kamera("Fujifilm X-A5", p2);
        System.out.println(merk.info());
        Transaksi kamera = new Transaksi(8999000, 0.15f);
        kamera.setHarga(8999000);
        kamera.setDiskon(0.15f);
        kamera.info();
    }
}
