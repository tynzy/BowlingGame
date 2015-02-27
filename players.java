package bowling;

public class Players {
    private String name;
    private int frame;

    public int getFrame() {
        return frame;
    }

    public void setFrame(int frame) {
        this.frame = frame;
    }
    private int score;
  

    public Players(String name,int score){
        this.name = name;
        this.score = score;
    }
    public void setName(String name) {
        this.name = name;
    }

  

    public void setScore(int score) {
        this.score += score;
    }

    

    public String getName() {
        return name;
    }

  

    public int getScore() {
        return score;
    }

   
   
    
}
