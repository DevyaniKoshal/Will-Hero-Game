package game;

import javafx.scene.Node;

import java.io.IOException;
import java.util.ArrayList;
import java.lang.Integer;
import java.util.HashMap;

public class TreasureChest extends Chests{

    private int coins;

    public TreasureChest(int coinN) throws IOException {
        super("Treasure", false);
        this.coins=coinN;
    }
    @Override
    public void collectChest(Hero hero){
        System.out.println("treasure collect");
        this.open=true;
        hero.addCoins(coins);

    }

}