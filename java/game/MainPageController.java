package game;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;

import java.io.IOException;

public class MainPageController {


    private Stage stage;
    private Scene scene;
    private Parent root;

    public void StartGame(ActionEvent event) throws IOException {
        FXMLLoader loader= new FXMLLoader(getClass().getResource("Game.fxml"));
        root =loader.load();
        stage =(Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();


    }
    public void OpenArchive(ActionEvent event) throws IOException {
        FXMLLoader loader= new FXMLLoader(getClass().getResource("GameArchive.fxml"));
        root =loader.load();
        stage =(Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();



    }

    public void Exit(ActionEvent event) throws IOException {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Exit Game");
        alert.setHeaderText("You are about to exit the game !");
        alert.setContentText("Exit ?");
        if(alert.showAndWait().get()== ButtonType.OK){
            stage =(Stage)((Node)event.getSource()).getScene().getWindow();
            stage.close();
        }




    }


}

