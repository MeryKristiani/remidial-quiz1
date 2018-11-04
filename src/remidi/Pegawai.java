package remidi;

/**
 *
 * @author Mery Kristiani
 */
public class Pegawai {
    private String pegawaiM;
    
    Pegawai() {
    }

    public Pegawai(String pegawaiM) {
        this.pegawaiM = pegawaiM;
    }

    public String getPegawaiM() {
        return pegawaiM;
    }

    public void setPegawaiM(String pegawaiM) {
        this.pegawaiM = pegawaiM;
    }
    
    public void info() {
        System.out.println("Pegawai yang Melayani       : " + pegawaiM);
    }
}
