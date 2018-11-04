package RemediQuiz;

/**
 *
 * @author aflah brill
 */
public class Pegawai {
    private String nama;
    private int ID;

    public Pegawai(String nama, int ID) {
        this.nama = nama;
        this.ID = ID;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    
    
}
