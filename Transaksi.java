package RemediQuiz;

/**
 *
 * @author aflah brill
 */
public class Transaksi {
    private String DVD;
    private String VCD;
    private String action;
    private String drama;
    private Pegawai nama;
    private Pegawai ID;

    public Transaksi(String DVD, String VCD, String action, String drama, Pegawai nama, Pegawai ID) {
        this.DVD = DVD;
        this.VCD = VCD;
        this.action = action;
        this.drama = drama;
        this.nama = nama;
        this.ID = ID;
    }

    public String getDVD() {
        return DVD;
    }

    public void setDVD(String DVD) {
        this.DVD = DVD;
    }

    public String getVCD() {
        return VCD;
    }

    public void setVCD(String VCD) {
        this.VCD = VCD;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getDrama() {
        return drama;
    }

    public void setDrama(String drama) {
        this.drama = drama;
    }

    public Pegawai getNama() {
        return nama;
    }

    public void setNama(Pegawai nama) {
        this.nama = nama;
    }

    public Pegawai getID() {
        return ID;
    }

    public void setID(Pegawai ID) {
        this.ID = ID;
    }

    public String info(){
        String info="";
        info +="DVD\t\t : "+this.DVD+"\n";
        info +="VCD\t\t : "+this.VCD+"\n";
        info +="Action\t\t : "+this.action+"\n";
        info +="Drama\t\t : "+this.drama+"\n";
        info +="Nama\t\t : "+this.nama.getNama()+"\n";
        info +="ID\t\t : "+this.ID.getID()+"\n";
        return info;
    }
}
