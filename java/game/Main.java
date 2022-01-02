package game;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.*;


public class Main extends Application {
//    private Game game;
//
//    public Main() throws IOException {
//        this.game = new Game();
//    }

    @Override
    public void start(Stage stage) throws IOException {
                //AnchorPane root = FXMLLoader.load(getClass().getResource("Game1.fxml"));
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Game.fxml"));
        AnchorPane root = fxmlLoader.load();

        //Group root1 = new Group();

        Scene scene = new Scene(root);
        //ImageView bg = new ImageView(new Image(getClass().getResourceAsStream("images/bg.jpeg")));
        stage.setResizable(false);
        stage.setTitle("Will Hero Game!");
        stage.setHeight(600);
        stage.setWidth(1100);
        stage.setScene(scene);
        stage.show();


    }


    public static void main(String[] args) {
        launch(args);
//        try {
//            Game g = new Game();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

    }

    public static void serialize() throws IOException{
        Game g = new Game();
        g.save();
        System.out.println(g.getGenemies() + " " + g.getScore());
        System.out.println("serializing..");
        ObjectOutputStream outputStream= null;
        try {
            outputStream = new ObjectOutputStream(new FileOutputStream("data.txt"));
            outputStream.writeObject(g);
            //outputStream.writeObject(Object);
        }finally {
            outputStream.close();
            System.out.println("saved");
        }

    }

    public static void deserialize() throws ClassNotFoundException, IOException{
        Game g;
        System.out.println("deserializing");
        ObjectInputStream inputStream= null;
        try{
            inputStream= new ObjectInputStream(new FileInputStream("data.txt"));
            g = (Game) inputStream.readObject();
            inputStream.close();
        }
        finally {
            inputStream.close();
        }

    }

}
