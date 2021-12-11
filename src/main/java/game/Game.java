package game;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class Game extends Application {
    private Hero hero;
    private ArrayList<Orc> enemies;

    public Game(){
        enemies = new ArrayList<Orc>();
    }

    @Override
    public void start(Stage stage) throws IOException {
        //AnchorPane root = FXMLLoader.load(getClass().getResource("Game1.fxml"));
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Game.fxml"));
        AnchorPane root = fxmlLoader.load();
        //Group root1 = new Group();

        Scene scene = new Scene(root);

        //ImageView bg = new ImageView(new Image(getClass().getResourceAsStream("images/bg.jpeg")));



//        ImageView heroNormal = new ImageView(new Image(Game.class.getResourceAsStream("images/Hero/heroNormal-removebg-preview.png"),45.0, 60.0, false, true));
//        heroNormal.setX(0);
//        heroNormal.setY(0);
        hero = new Hero();
        ImageView heroNormal = (ImageView) hero.getObsPane().getChildren().get(0);
        heroNormal.setY(200);
        heroNormal.setX(150);


        ImageView heroKnife = (ImageView) hero.getObsPane().getChildren().get(1);
        heroKnife.setY(200);
        heroKnife.setX(0);

        GreenOrc greenOrc1 = new GreenOrc();
        enemies.add(greenOrc1);
        ImageView greenOrcImg = (ImageView) greenOrc1.getObsPane().getChildren().get(0);
        greenOrcImg.setY(200);
        greenOrcImg.setX(625);

        RedOrc redOrc1 = new RedOrc();
        enemies.add(greenOrc1);
        ImageView redOrcImg = (ImageView) redOrc1.getObsPane().getChildren().get(1);
        redOrcImg.setX(250);
        redOrcImg.setY(200);

        FallingPlatform p1 = new FallingPlatform();
        ImageView _p1 = (ImageView) p1.getObsPane().getChildren().get(0);
        p1.getController().startFalling();

        Islands island1 = new Islands();
        ImageView isl1 = (ImageView) island1.getObsPane().getChildren().get(0);
        //isl1.setX(-10);
        //isl1.setY(300);

        ImageView isl2 = (ImageView) island1.getObsPane().getChildren().get(1);
        isl2.setX(575);
        isl2.setY(325);

        Chests chest = new Chests();
        ImageView ch1 = (ImageView) chest.getObsPane().getChildren().get(0);
        ch1.setX(750);
        ch1.setY(280);

        Group grp1 = new Group(isl1);
        Group grp2 = new Group(isl2, greenOrcImg, ch1);

        grp1.getChildren().get(0).setLayoutY(300);
        grp1.getChildren().get(0).setLayoutX(-10);

        //root.getChildren().add(0, bg);
        root.getChildren().add(heroNormal);
        //root.getChildren().add(heroKnife);
        //root.getChildren().add(greenOrcImg);
        //root.getChildren().add(redOrcImg);
        root.getChildren().add(grp1);
        root.getChildren().add(grp2);
        //root.getChildren().add(8,_p1);
        hero.getControl().Jump(island1, grp1.getChildren().get(0).getLayoutY());
        greenOrc1.getController().jumpOrc(island1, isl2.getY());


        stage.setResizable(false);
        stage.setTitle("Will Hero Game!");
        stage.setHeight(600);
        stage.setWidth(1100);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}

