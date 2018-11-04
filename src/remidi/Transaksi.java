package remidi;

/**
 *
 * @author Mery Kristiani
 */
public class Transaksi {
    private int harga;
    
    Transaksi() {
    }

    public Transaksi(int harga) {
        this.harga = harga;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
    
    public void info() {
        System.out.println("Harga Kamera                : " + harga);
    }
}
