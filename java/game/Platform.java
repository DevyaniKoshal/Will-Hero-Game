package game;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class Platform extends GameObjects{
    private AnchorPane obsPane;
    private FXMLLoader fxmlLoader;
    PlatformController controller;
    private int id;


    public Platform() throws IOException {
        fxmlLoader = new FXMLLoader(getClass().getResource("Islands.fxml"));
        obsPane = fxmlLoader.load();
        id = 30;
        controller = fxmlLoader.<PlatformController>getController();
    }

    public AnchorPane getObsPane() {
        return obsPane;
    }

    public PlatformController getControl() {
        return controller;
    }

    public int getid() {
    //
        return 30;
    }

}