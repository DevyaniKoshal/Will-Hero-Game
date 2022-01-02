package game;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.image.ImageView;

public class WeaponController {
    @FXML
    private ImageView knife;

    @FXML
    private ImageView sword;


    public int ifCollide(Node orc){
        if(knife.getBoundsInParent().intersects(orc.getBoundsInParent())){
            return 1;
        }
        else{
            return 0;
        }
    }

}
