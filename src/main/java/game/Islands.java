package game;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Islands{
    private AnchorPane obsPane;
    private FXMLLoader fxmlLoader;
    IslandsController controller;
    private int id;

    public Islands() throws IOException {
        fxmlLoader = new FXMLLoader(getClass().getResource("Islands.fxml"));
        obsPane = fxmlLoader.load();
        id = 30;
        controller = fxmlLoader.<IslandsController>getController();
    }

    public AnchorPane getObsPane() {
        return obsPane;
    }

    public IslandsController getControl() {
        return controller;
    }

    public int getid() {

        return 30;
    }

}