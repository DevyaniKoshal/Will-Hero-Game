package game;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class WonController {
    private Stage stage;
    private Scene scene;
    private Parent root;

    public void ReturnToMain(ActionEvent event) throws IOException {
        FXMLLoader loader= new FXMLLoader(getClass().getResource("WelcomeScreen.fxml"));
        root =loader.load();
        stage =(Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();


    }
}