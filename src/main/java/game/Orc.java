package game;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class Orc {
    private AnchorPane obsPane;
    private FXMLLoader fxmlLoader;
    OrcController controller;
    private int id;

    public Orc() throws IOException {
        fxmlLoader = new FXMLLoader(getClass().getResource("Orc.fxml"));
        obsPane = fxmlLoader.load();
        id = 6;
        controller = fxmlLoader.<OrcController>getController();
    }

    public AnchorPane getObsPane() {
        return obsPane;
    }

    public OrcController getController() {
        return controller;
    }
}
