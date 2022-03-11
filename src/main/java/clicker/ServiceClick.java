package clicker;

import org.springframework.stereotype.Service;

@Service
public class ServiceClick {
    private int score = 0;

    public void click(int clk){
        if(clk > 0 && clk < 5){
            score += clk;
        }
    }
    public int getScore() {
        return score;
    }
}