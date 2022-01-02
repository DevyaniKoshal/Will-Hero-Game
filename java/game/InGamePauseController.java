package game;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class InGamePauseController {
    private Stage stage;
    private Scene scene;
    private Parent root;

    public void ResumeGame(ActionEvent event) throws IOException {
        FXMLLoader loader= new FXMLLoader(getClass().getResource("Game.fxml"));
        root =loader.load();
        stage =(Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


    public void ReturnToMain(ActionEvent event) throws IOException {
        //Main.serialize();
        FXMLLoader loader= new FXMLLoader(getClass().getResource("WelcomeScreen.fxml"));
        root =loader.load();
        stage =(Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
