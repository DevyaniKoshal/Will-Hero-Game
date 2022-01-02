package game;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.awt.event.MouseEvent;
import java.io.IOException;




public class SceneController {

    private Stage stage;
    private Scene scene;
    private Parent root;

    public void SceneController(Stage stage){

    }


    public void SwitchToGame() throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("Game.fxml"));
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }
    public void SwitchToPause(javafx.scene.input.MouseEvent mouseEvent) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("InGamePause.fxml"));
        stage =(Stage)((Node)mouseEvent.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }
    public void SwitchToSaveMe() throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("SaveMe.fxml"));
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }
    public void SwitchToGameOver() throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("GameOver.fxml"));
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }
    public void SwitchToMainScreen() throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("WelcomeScreen.fxml"));
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }
    public void SwitchToSavedGames() throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("GameArchive.fxml"));
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }


}
