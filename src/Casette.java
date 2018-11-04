package RemediQuiz;

/**
 *
 * @author aflah brill
 */
public class Casette {
    private String DVD;
    private String VCD;
    
    public Casette(){
        
    }

    public Casette(String DVD, String VCD) {
        this.DVD = DVD;
        this.VCD = VCD;
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
    
    public String info(){
        String info = "";
        info += this.DVD +"\n";
        info += "Jenis\t\t : "+this.VCD;
        return info;
    } 
}
