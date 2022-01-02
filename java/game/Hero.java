package game;

import javafx.fxml.FXMLLoader;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class Hero extends GameObjects{

    private AnchorPane obsPane;
    private FXMLLoader fxmlLoader;
    HeroController controller;
    private int id;
    private int coins;
    private int yCoordinate;
    private Helmet helmet;
    private Weapon CurrentWeapon;


    public Hero (Helmet helmet) throws IOException {
        this.helmet = helmet;

        fxmlLoader = new FXMLLoader(getClass().getResource("Hero.fxml"));
        obsPane = fxmlLoader.load();
        id = 6;
        controller = fxmlLoader.<HeroController>getController();
//        obsPane = new AnchorPane();
//        ImageView heroNormal = new ImageView(new Image(Game.class.getResourceAsStream("images/Hero/heroNormal-removebg-preview.png"),45.0, 60.0, false, true));
//        ImageView heroKnife = new ImageView(new Image(Game.class.getResourceAsStream("images/Hero/heroKnife-removebg-preview.png"),45.0, 60.0, false, true));
//
//        obsPane.getChildren().add(0,heroNormal);
//        obsPane.getChildren().add(1,heroKnife);
    }


    public Helmet getHelmet(){
        return this.helmet;
    }

    public int getCoins(){
        System.out.println("hero update coins");
        return coins;
    }

    public void addCoins(int coin){
        System.out.println("hero collect coins");
        coins+=coin;
    }

    public void addWeapon(Weapon weapon){
        System.out.println("hero collect weapon");
        CurrentWeapon = helmet.addWeapon(weapon);
    }
    public int getyCoordinate(){
        return  this.yCoordinate;
    }

    public void useCoins() throws InsufficientCoinsException{
        if(this.coins < 10){
                throw new InsufficientCoinsException("You don't have enough Coins");
        }
        else{
            this.addCoins(-10);
            //add resurrect method
        }
    }
    public AnchorPane getObsPane() {
        return obsPane;
    }

    public HeroController getControl() {
        return controller;
    }

    public int getid() {
        // TODO Auto-generated method stub
        return 6;
    }

    public int updateCoins() {
        return coins;
    }

    public int updateWea() {

        if(CurrentWeapon instanceof Sword){
            System.out.println("hero update sword");
            return 0;
        }
        else if(CurrentWeapon instanceof ThrowingKnives) {
            System.out.println(CurrentWeapon.getLevel());
            System.out.println("hero update knife");
            return 1;
        }
        else{
            return 2;
        }
    }

    public Weapon getCurrentWeapon() {
        return CurrentWeapon;
    }
}
