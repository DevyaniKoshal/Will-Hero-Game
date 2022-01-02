package game;

import java.io.IOException;

public class Boss extends Orc{
    private  int forwardBossDistance=40;
    private boolean landFlag;

    public Boss(int h, int c, String d) throws IOException {
        super(h, c, d);
        landFlag = false;
    }

    public void setLandFlag(){
        landFlag = true;
    }
    public boolean checkLand(){
        return landFlag;
    }

    public int getForwardBossDistance(){
        return  forwardBossDistance;
    }


}