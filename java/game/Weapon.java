package game;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class Weapon extends GameObjects{
    private AnchorPane obsPane;
    private FXMLLoader fxmlLoader;
    WeaponController controller;


    private int level;
    private int hitPoint;

    public Weapon(int level, int hitPoint) throws IOException {
        this.level = level;
        this.hitPoint = hitPoint;
        fxmlLoader = new FXMLLoader(getClass().getResource("Weapon.fxml"));
        obsPane = fxmlLoader.load();
        controller = fxmlLoader.<WeaponController>getController();
    }

    public AnchorPane getObsPane() {
        return obsPane;
    }

    public WeaponController getController() {
        return controller;
    }

    public void setLevel(int Wlevel){
        this.level=Wlevel;
    }
    public int getLevel(){
        return this.level;
    }

    public int getHitPoint() {
        return hitPoint;
    }
}
