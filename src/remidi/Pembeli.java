package remidi;

/**
 *
 * @author Mery Kristiani
 */
public class Pembeli {
    private String nama;
    private String ktp;

    public Pembeli(String nama, String ktp) {
        this.nama = nama;
        this.ktp = ktp;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKtp() {
        return ktp;
    }

    public void setKtp(String ktp) {
        this.ktp = ktp;
    }
    
    public String info() {
        String info = "";
        info += "Nama                        : " + nama +"\n";
        info += "KTP                         : " + ktp +"\n";
        return info;
    }
}
