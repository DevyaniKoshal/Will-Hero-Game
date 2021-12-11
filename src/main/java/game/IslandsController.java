package game;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.image.ImageView;

public class IslandsController {

    @FXML
    private ImageView rock1;

    @FXML
    private ImageView rock2;

    @FXML
    private ImageView rock3;

    @FXML
    private ImageView rock4;

    @FXML
    private ImageView rock5;

    public boolean ifCollide(Node n1){
        if(rock1.getBoundsInParent().intersects(n1.getBoundsInParent())){
            return true;
        }
        else if(rock2.getBoundsInParent().intersects(n1.getBoundsInParent())){
            return true;
        }
        else{
            return false;
        }
    }

}

