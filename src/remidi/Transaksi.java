package remidi;

/**
 *
 * @author Mery Kristiani
 */
public class Transaksi {
    private int harga;
    private float diskon;
    private float total;
    
    Transaksi() {
    }

    public Transaksi(int harga, float diskon) {
        this.harga = harga;
        this.diskon = diskon;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public float getDiskon() {
        return diskon;
    }

    public void setDiskon(float diskon) {
        this.diskon = diskon;
    }

    public float getTotal() {
        return total = harga - (harga * diskon);
    }

    public void setTotal(float total) {
        this.total = total;
    }
    
    public void info() {
        System.out.println("Harga Kamera                : " + harga);
        System.out.println("Harga Kamera setelah diskon : " + getTotal());
    }
}
