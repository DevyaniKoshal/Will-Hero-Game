package game;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;


public class Orc extends GameObjects{
    private AnchorPane obsPane;
    private FXMLLoader fxmlLoader;
    OrcController controller;
    private int id;

    private int health;
    private int coinsAwarded;
    private String colour;

    public Orc(int h, int c, String d) throws IOException {
        fxmlLoader = new FXMLLoader(getClass().getResource("Orc.fxml"));
        obsPane = fxmlLoader.load();
        id = 6;
        controller = fxmlLoader.<OrcController>getController();
        health = h;
        coinsAwarded = c;
        colour = d;
    }

    public AnchorPane getObsPane() {
        return obsPane;
    }

    public OrcController getController() {
        return controller;
    }

    public int decHealth(int a){
        health = health -a;
        return health;
    }
}
