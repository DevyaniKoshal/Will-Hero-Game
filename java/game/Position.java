package game;

import java.io.Serializable;

public class Position implements Serializable {
    private int x_cood;
    private int y_cood;


    public Position(int x, int y){
        this.x_cood=x;
        this.y_cood=y;

    }


}
