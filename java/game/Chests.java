package game;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public abstract class Chests extends GameObjects{
    private AnchorPane obsPane;
    private FXMLLoader fxmlLoader;
    ChestsController controller;
    private String type;
    protected boolean open;


    public Chests(String type, boolean open) throws IOException {
        this.type=type;
        this.open=open;
        fxmlLoader = new FXMLLoader(getClass().getResource("Chests.fxml"));
        obsPane = fxmlLoader.load();
        controller = fxmlLoader.<ChestsController>getController();
    }
    public boolean isOpen() {
        return open;
    }


    public String getType(){
        return type;
    }
    public abstract void collectChest(Hero hero);

    public void setType(String ChestType){
        type=ChestType;
    }
    public AnchorPane getObsPane() {
        return obsPane;
    }

    public ChestsController getController() {
        return controller;
    }
}
