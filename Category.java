package RemediQuiz;

/**
 *
 * @author aflah brill
 */
public class Category {
    private String action;
    private String drama;

    public Category(String action, String drama) {
        this.action = action;
        this.drama = drama;
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
    
    public String info(){
        String info ="";
        info+= this.action+"\n";
        info+= this.drama;
        return info;
    }
    
}
