package game;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;

import java.io.Serializable;


public class PlatformController {

    @FXML
    private Pane Mrock1;


    @FXML
    private Pane Mrock2;

    @FXML
    private Rectangle b1;
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


public int [] ifCollide(Node n1){
    int arr[] = new int[5];
    if(rock1.getBoundsInParent().intersects(n1.getBoundsInParent())){
        arr[0] = 1;
        arr[1] = 300;
        if(n1.getBoundsInParent().getMaxY()>303){
            arr[2] = 1;
        }
        else{
            arr[2] = 0;
        }
        return arr;
    }
    else if(rock2.getBoundsInParent().intersects(n1.getBoundsInParent())){
        arr[0] = 1;
        arr[1] = 310;
        if(n1.getBoundsInParent().getMaxY()>313){
            arr[2] = 1;
        }
        else{
            arr[2] = 0;
        }
        return arr;
    }
    else if(rock3.getBoundsInParent().intersects(n1.getBoundsInParent())){
        arr[0] = 1;
        arr[1] = 310;
        if(n1.getBoundsInParent().getMaxY()>313){
            arr[2] = 1;
        }
        else{
            arr[2] = 0;
        }
        return arr;
    }
    else if(rock4.getBoundsInParent().intersects(n1.getBoundsInParent())){
        arr[0] = 1;
        arr[1] = 300;
        if(n1.getBoundsInParent().getMaxY()>303){
            arr[2] = 1;
        }
        else{
            arr[2] = 0;
        }
        return arr;
    }
    else if(rock5.getBoundsInParent().intersects(n1.getBoundsInParent())){
        arr[0] = 1;
        arr[1] = 325;
        if(n1.getBoundsInParent().getMaxY()>327){
            arr[2] = 1;
        }
        else{
            arr[2] = 0;
        }
        return arr;
    }
    else{
        arr[0] = 0;
        arr[1] = 0;
        arr[2] = 0;
    }
    return arr;
}

}

