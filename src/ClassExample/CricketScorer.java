package ClassExample;

import java.util.concurrent.Callable;

public class CricketScorer {

    private  int score;
    public void four(){
        score = score + 4;
    }

    public void six(){
        score = score + 6;
    }

    public int getScore(){
        return score;
    }

    public static  void main(String args[]){
        CricketScorer cricketScorer = new CricketScorer();
        cricketScorer.four();
        System.out.println(cricketScorer.getScore());

        cricketScorer.six();
        System.out.println(cricketScorer.getScore());
    }
}
