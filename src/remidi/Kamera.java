package remidi;

/**
 *
 * @author Mery Kristiani
 */
public class Kamera {
    private String merkKamera;
    private Pembeli pembeli;
    private Pegawai pegawaiM;
    
    Kamera() {
    }

    public Kamera(String merkKamera, Pembeli pembeli) {
        this.merkKamera = merkKamera;
        this.pembeli = pembeli;
    }

    public String getMerkKamera() {
        return merkKamera;
    }

    public void setMerkKamera(String merkKamera) {
        this.merkKamera = merkKamera;
    }

    public Pembeli getPembeli() {
        return pembeli;
    }

    public void setPembeli(Pembeli pembeli) {
        this.pembeli = pembeli;
    }

    public Pegawai getPegawaiM() {
        return pegawaiM;
    }

    public void setPegawaiM(Pegawai pegawaiM) {
        this.pegawaiM = pegawaiM;
    }
    
    public String info() {
        String info = "";
        info += "Merk Kamera                 : " + merkKamera + "\n";
        if(this.pembeli != null) {
        info += "Pembeli" + "\n" + pembeli.info() + "\n";
        }
        return info;
    }
}
