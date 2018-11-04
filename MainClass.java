package RemediQuiz;

/**
 *
 * @author aflah brill
 */
public class MainClass {
    public static void main(String[] args) {
        Casette jenis = new Casette("DVD", "VCD");
        Category  Genre= new Category("Action", "Drama");
        Pegawai orang= new Pegawai("Aflah", 001);
        Transaksi bayar= new Transaksi("jenis", "jenis", "genre", "genre", orang, orang);
        
        System.out.print(bayar.info());
}
    
}
