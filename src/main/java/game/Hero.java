package game;

import javafx.fxml.FXMLLoader;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class Hero{
    private AnchorPane obsPane;
    private FXMLLoader fxmlLoader;
    HeroController controller;
    private int id;

    public Hero () throws IOException {
        fxmlLoader = new FXMLLoader(getClass().getResource("Hero.fxml"));
        obsPane = fxmlLoader.load();
        id = 6;
        controller = fxmlLoader.<HeroController>getController();
//        obsPane = new AnchorPane();
//        ImageView heroNormal = new ImageView(new Image(Game.class.getResourceAsStream("images/Hero/heroNormal-removebg-preview.png"),45.0, 60.0, false, true));
//        ImageView heroKnife = new ImageView(new Image(Game.class.getResourceAsStream("images/Hero/heroKnife-removebg-preview.png"),45.0, 60.0, false, true));
//
//        obsPane.getChildren().add(0,heroNormal);
//        obsPane.getChildren().add(1,heroKnife);
    }

    public AnchorPane getObsPane() {
        return obsPane;
    }

    public HeroController getControl() {
        return controller;
    }

    public int getid() {
        // TODO Auto-generated method stub
        return 6;
    }
}
