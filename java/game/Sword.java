package game;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class Sword extends Weapon{
    private int swordLength;
    
    public Sword(int level, int hitPoint) throws IOException {
        super(level, hitPoint);
    }


}
