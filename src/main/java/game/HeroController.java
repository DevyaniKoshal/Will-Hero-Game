package game;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

import java.net.URL;
import java.util.ResourceBundle;

public class HeroController implements Initializable{
    @FXML
    private ImageView heroNormal;

    private Timeline jump = new Timeline();
    private int j;

    @Override
    public void initialize(URL arg0, ResourceBundle arg1){
        j = 3;
//        TranslateTransition translate = new TranslateTransition();
//        translate.setNode(heroNormal);
//        translate.setByY(40);
//        translate.setAutoReverse(true);
//        translate.setDuration(Duration.millis(500));
//        translate.setCycleCount(TranslateTransition.INDEFINITE);
//        translate.play();
    }

    public void Jump(Islands obj, double yPos){
        jump.getKeyFrames().add(new KeyFrame(Duration.millis(30),
                (e) -> {heroNormal.setY(heroNormal.getY() + j);
                    if(obj.getControl().ifCollide(heroNormal)){
                        j = -j;
                    }
                    if(heroNormal.getY() <yPos - 120){
                        j = 3;
                    }
                    //System.out.println(heroNormal.getY());
                    //System.out.println(obj.getObsPane().getChildren().get(0).getLayoutY());
                }));
        jump.setCycleCount(Animation.INDEFINITE);
        jump.play();
    }
}
