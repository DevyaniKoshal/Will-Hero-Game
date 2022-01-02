package game;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXMLLoader;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;

import java.io.IOException;

public class FallingPlatform extends GameObjects{

    private AnchorPane obsPane;
    private FXMLLoader fxmlLoader;
    FallingPlatformController controller;
    private int id;
    public FallingPlatform () throws IOException {
        fxmlLoader = new FXMLLoader(getClass().getResource("FallingPlatform.fxml"));
        obsPane = fxmlLoader.load();
        id = 6;
        controller = fxmlLoader.<FallingPlatformController>getController();
    }

    public AnchorPane getObsPane() {
        return obsPane;
    }

    public FallingPlatformController getController() {
        return controller;
    }
}
