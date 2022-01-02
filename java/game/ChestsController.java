package game;

import javafx.animation.Animation;
import javafx.animation.FadeTransition;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.effect.Effect;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.util.Duration;

import java.io.Serializable;
import java.net.URL;
import java.util.ResourceBundle;

public class ChestsController implements Initializable {
    @FXML
    private ImageView weaponChest;

    @FXML
    private ImageView treasureChest;
    @FXML
    private ImageView openChest;
    private Timeline chestOpen=new Timeline();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }


    public int chestCollide(Node hero, Pane chest){
        if(hero.getBoundsInParent().intersects(chest.getBoundsInParent())){
            return 1;
        }
        else{
            return 0;
        }

    }
//    public void openChest(Node hero){
//        if(chestCollide(hero)==1) {
//            chestOpen.getKeyFrames().add(new KeyFrame(Duration.millis(25),
//                    (e) -> {
//                        weaponChest.setVisible(false);
//                        openChest.setVisible(true);
//
//                    }));
//            chestOpen.play();
//        }
//
//    }

}
