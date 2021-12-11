package game;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

import java.net.URL;
import java.util.ResourceBundle;

public class FallingPlatformController implements Initializable {
    @FXML
    private ImageView block1;

    public void startFalling(){
        Timeline falling = new Timeline();
        falling.getKeyFrames().add(new KeyFrame(Duration.millis(100), (e) -> {fall(block1);}));
    }

    public void fall(ImageView block){
        TranslateTransition translate = new TranslateTransition();
        translate.setNode(block);
        translate.setByY(40);
        translate.setDuration(Duration.millis(50));
        translate.play();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //startFalling();
    }
}
