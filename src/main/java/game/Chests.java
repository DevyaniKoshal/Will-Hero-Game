package game;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Chests{
    private AnchorPane obsPane;
    private FXMLLoader fxmlLoader;
    ChestsController controller;
    private int id;

    public Chests() throws IOException {
        fxmlLoader = new FXMLLoader(getClass().getResource("Chests.fxml"));
        obsPane = fxmlLoader.load();
        id = 20;
        controller = fxmlLoader.<ChestsController>getController();
    }

    public AnchorPane getObsPane() {
        return obsPane;
    }

    public ChestsController getControl() {
        return controller;
    }


    public int getid() {

        return 20;
    }

}
