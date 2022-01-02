package game;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.util.Duration;

import java.io.Serializable;
import java.net.URL;
import java.util.ResourceBundle;

public class FallingPlatformController implements Initializable {
    @FXML
    private Group fallPlatform;

    @FXML
    private ImageView block1;

    @FXML
    private ImageView block11;

    @FXML
    private ImageView block12;

    @FXML
    private ImageView block13;

    @FXML
    private ImageView block14;

    @FXML
    private ImageView block15;

    @FXML
    private ImageView block16;

    @FXML
    private ImageView block17;

    @FXML
    private ImageView block18;

    @FXML
    private ImageView block19;

    @FXML
    private ImageView block110;

    @FXML
    private Group fallPlatform1;
    @FXML
    private ImageView block21;
    @FXML
    private ImageView block22;
    @FXML
    private ImageView block23;
    @FXML
    private ImageView block24;
    @FXML
    private ImageView block25;
    @FXML
    private ImageView block26;
    @FXML
    private ImageView block27;
    @FXML
    private ImageView block28;
    @FXML
    private ImageView block29;
    @FXML
    private ImageView block210;
    @FXML
    private ImageView block211;
    @FXML
    private ImageView block212;
    @FXML
    private ImageView block213;
    @FXML
    private ImageView block214;
    @FXML
    private ImageView block215;
    @FXML
    private ImageView block216;
    @FXML
    private ImageView block217;
    @FXML
    private ImageView block218;
    @FXML
    private ImageView block2181;
    @FXML
    private ImageView block2182;
    @FXML
    private ImageView block2183;
    @FXML
    private ImageView block2184;
    @FXML
    private ImageView block2185;
    @FXML
    private ImageView block2186;
    @FXML
    private ImageView block2187;
    @FXML
    private ImageView block2188;


    @FXML
    private AnchorPane base;

    private Group fallPlatform2;

    @FXML
    private Group buffer;
    @FXML
    private Group buffer1;

    private int i;
    private int noOfBlocks;
    private boolean fallin;
    private boolean fallin1;
    private boolean bufferMain;
    private int i1;


    public void startFalling() {
        Timeline falling = new Timeline();
        falling.getKeyFrames().addAll(
                new KeyFrame(Duration.millis(750), (e) -> {
                    fall(block1);
                }),
                new KeyFrame(Duration.millis(1500), (e) -> {
                    fall(block11);
                }),
                new KeyFrame(Duration.millis(2250), (e) -> {
                    fall(block12);
                }),

                new KeyFrame(Duration.millis(3000), (e) -> {
                    fall(block13);
                }),
                new KeyFrame(Duration.millis(3750), (e) -> {
                    fall(block14);
                }),
                new KeyFrame(Duration.millis(4500), (e) -> {
                    fall(block15);
                }),
                new KeyFrame(Duration.millis(5250), (e) -> {
                    fall(block16);
                }),
                new KeyFrame(Duration.millis(6000), (e) -> {
                    fall(block17);
                }),
                new KeyFrame(Duration.millis(6750), (e) -> {
                    fall(block18);
                }),
                new KeyFrame(Duration.millis(7500), (e) -> {
                    fall(block19);
                }),
                new KeyFrame(Duration.millis(8250), (e) -> {
                    fall(block110);
                })
        );
        falling.play();
        Timeline falling1 = new Timeline();
        falling1.getKeyFrames().addAll(
                new KeyFrame(Duration.millis(750), (e) -> {
                    buffer.getChildren().add(block1);
                    fallPlatform.getChildren().remove(block1);

                }),
                new KeyFrame(Duration.millis(1500), (e) -> {
                    buffer.getChildren().add(block11);
                    fallPlatform.getChildren().remove(block11);
                }),
                new KeyFrame(Duration.millis(2250), (e) -> {
                    buffer.getChildren().add(block12);
                    fallPlatform.getChildren().remove(block12);
                }),
                new KeyFrame(Duration.millis(3000), (e) -> {
                    buffer.getChildren().add(block13);
                    fallPlatform.getChildren().remove(block13);
                }),
                new KeyFrame(Duration.millis(3750), (e) -> {
                    buffer.getChildren().add(block14);
                    fallPlatform.getChildren().remove(block14);
                }),
                new KeyFrame(Duration.millis(4500), (e) -> {
                    buffer.getChildren().add(block15);
                    fallPlatform.getChildren().remove(block15);
                }),
                new KeyFrame(Duration.millis(5250), (e) -> {
                    buffer.getChildren().add(block16);
                    fallPlatform.getChildren().remove(block16);
                }),
                new KeyFrame(Duration.millis(6000), (e) -> {
                    buffer.getChildren().add(block17);
                    fallPlatform.getChildren().remove(block17);
                }),
                new KeyFrame(Duration.millis(6750), (e) -> {
                    buffer.getChildren().add(block18);
                    fallPlatform.getChildren().remove(block18);
                }),
                new KeyFrame(Duration.millis(7500), (e) -> {
                    buffer.getChildren().add(block19);
                    fallPlatform.getChildren().remove(block19);
                }),
                new KeyFrame(Duration.millis(8250), (e) -> {
                    buffer.getChildren().add(block110);
                    fallPlatform.getChildren().remove(block110);
                })
        );
        //falling.setCycleCount(11);
        falling1.play();
        falling1.setOnFinished((e) -> {
            System.out.println("stopFalling1");
            fallin = false;
        });


    }
    public int ifCollideOrc(Node orc) {
        if (orc.getBoundsInParent().intersects(fallPlatform1.getBoundsInParent())) {
            return 1;
        }
        return 0;
    }

    public void fall(Node block) {
        TranslateTransition translate = new TranslateTransition();
        translate.setNode(block);
        translate.setByY(300);
        translate.setDuration(Duration.millis(2000));
        translate.play();
    }

    public int ifCollide(Node hero) {
        if (hero.getBoundsInParent().intersects(fallPlatform.getBoundsInParent())) {
            if (!fallin) {
                System.out.println("start");
                fallin = true;
                startFalling();
            }
            return 1;
        }
//        for (int j = 0; j < 11; j++) {
//            if(hero.getBoundsInParent().intersects(fallPlatform.getChildren().get(j).getBoundsInParent())) {
//                if(!falling)
//                    startFalling();
//                System.out.println("hh");
//                return 1;
//            }
//        }
//        if(hero.getBoundsInParent().intersects(block1.getBoundsInParent()) || hero.getBoundsInParent().intersects(block11.getBoundsInParent()) || hero.getBoundsInParent().intersects(block12.getBoundsInParent()) ||hero.getBoundsInParent().intersects(block13.getBoundsInParent()) ||hero.getBoundsInParent().intersects(block14.getBoundsInParent()) ||hero.getBoundsInParent().intersects(block15.getBoundsInParent()) ||hero.getBoundsInParent().intersects(block16.getBoundsInParent()) || hero.getBoundsInParent().intersects(block17.getBoundsInParent()) ||hero.getBoundsInParent().intersects(block18.getBoundsInParent()) ||hero.getBoundsInParent().intersects(block19.getBoundsInParent()) ||hero.getBoundsInParent().intersects(block110.getBoundsInParent())){
//            System.out.println("hellothere");
////            if(!falling)
////                startFalling();
//            return 1;
//        }
        return 0;
    }

    public int ifCollide1(Node hero) {
        if (hero.getBoundsInParent().intersects(fallPlatform1.getBoundsInParent())) {
            if (!fallin1) {
                System.out.println("start1");
                fallin1 = true;
                startFalling1();
            }
            return 1;
        }
        return 0;
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        noOfBlocks = 10;
        fallin = false;
        fallin1 = false;
        fallPlatform2 = new Group();
        bufferMain = false;
        //fallPlatform2.getChildren().add(0,block1);
    }


    public void startFalling1() {
        System.out.println("st");
        Timeline falling = new Timeline();
        falling.getKeyFrames().addAll(
                new KeyFrame(Duration.millis(750), (e) -> {
                    fall(block21);
                }),
                new KeyFrame(Duration.millis(1500), (e) -> {
                    fall(block22);
                }),
                new KeyFrame(Duration.millis(2250), (e) -> {
                    fall(block23);
                }),
                new KeyFrame(Duration.millis(3000), (e) -> {
                    fall(block24);
                }),
                new KeyFrame(Duration.millis(3750), (e) -> {
                    fall(block25);
                }),
                new KeyFrame(Duration.millis(4500), (e) -> {
                    fall(block26);
                }),
                new KeyFrame(Duration.millis(5250), (e) -> {
                    fall(block27);
                }),
                new KeyFrame(Duration.millis(6000), (e) -> {
                    fall(block28);
                }),
                new KeyFrame(Duration.millis(6750), (e) -> {
                    fall(block29);
                }),
                new KeyFrame(Duration.millis(7500), (e) -> {
                    fall(block210);
                }),
                new KeyFrame(Duration.millis(8250), (e) -> {
                    fall(block211);
                }),
                new KeyFrame(Duration.millis(9000), (e) -> {
                    fall(block212);
                }),
                new KeyFrame(Duration.millis(9750), (e) -> {
                    fall(block213);
                }),
                new KeyFrame(Duration.millis(10500), (e) -> {
                    fall(block214);
                }),
                new KeyFrame(Duration.millis(11250), (e) -> {
                    fall(block215);
                }),
                new KeyFrame(Duration.millis(12000), (e) -> {
                    fall(block216);
                }),
                new KeyFrame(Duration.millis(12750), (e) -> {
                    fall(block217);
                }),
                new KeyFrame(Duration.millis(13500), (e) -> {
                    fall(block218);
                }),
                new KeyFrame(Duration.millis(14250), (e) -> {
                    fall(block2181);
                }),
                new KeyFrame(Duration.millis(15000), (e) -> {
                    fall(block2182);
                }),
                new KeyFrame(Duration.millis(15750), (e) -> {
                    fall(block2183);
                }),
                new KeyFrame(Duration.millis(16500), (e) -> {
                    fall(block2184);
                }),
                new KeyFrame(Duration.millis(17250), (e) -> {
                    fall(block2185);
                }),
                new KeyFrame(Duration.millis(18000), (e) -> {
                    fall(block2186);
                }),
                new KeyFrame(Duration.millis(18750), (e) -> {
                    fall(block2187);
                }),
                new KeyFrame(Duration.millis(19500), (e) -> {
                    fall(block2188);
                })
        );
        falling.play();
        Timeline falling1 = new Timeline();
        falling1.getKeyFrames().addAll(
                new KeyFrame(Duration.millis(750), (e) -> {
                    buffer1.getChildren().add(block21);
                    fallPlatform1.getChildren().remove(block21);
                }),
                new KeyFrame(Duration.millis(1500), (e) -> {
                    buffer1.getChildren().add(block22);
                    fallPlatform1.getChildren().remove(block22);
                }),
                new KeyFrame(Duration.millis(2250), (e) -> {
                    buffer1.getChildren().add(block23);
                    fallPlatform1.getChildren().remove(block23);
                }),
                new KeyFrame(Duration.millis(3000), (e) -> {
                    buffer1.getChildren().add(block24);
                    fallPlatform1.getChildren().remove(block24);
                }),
                new KeyFrame(Duration.millis(3750), (e) -> {
                    buffer1.getChildren().add(block25);
                    fallPlatform1.getChildren().remove(block25);
                }),
                new KeyFrame(Duration.millis(4500), (e) -> {
                    buffer1.getChildren().add(block26);
                    fallPlatform1.getChildren().remove(block26);
                }),
                new KeyFrame(Duration.millis(5250), (e) -> {
                    buffer1.getChildren().add(block27);
                    fallPlatform1.getChildren().remove(block27);
                }),
                new KeyFrame(Duration.millis(6000), (e) -> {
                    buffer1.getChildren().add(block28);
                    fallPlatform1.getChildren().remove(block28);
                }),
                new KeyFrame(Duration.millis(6750), (e) -> {
                    buffer1.getChildren().add(block29);
                    fallPlatform1.getChildren().remove(block29);
                }),
                new KeyFrame(Duration.millis(7500), (e) -> {
                    buffer1.getChildren().add(block210);
                    fallPlatform1.getChildren().remove(block210);
                }),
                new KeyFrame(Duration.millis(8250), (e) -> {
                    buffer1.getChildren().add(block211);
                    fallPlatform1.getChildren().remove(block211);
                }),
                new KeyFrame(Duration.millis(9000), (e) -> {
                    buffer1.getChildren().add(block212);
                    fallPlatform1.getChildren().remove(block212);
                }),
                new KeyFrame(Duration.millis(9750), (e) -> {
                    buffer1.getChildren().add(block213);
                    fallPlatform1.getChildren().remove(block213);
                }),
                new KeyFrame(Duration.millis(10500), (e) -> {
                    buffer1.getChildren().add(block214);
                    fallPlatform1.getChildren().remove(block214);
                }),
                new KeyFrame(Duration.millis(11250), (e) -> {
                    buffer1.getChildren().add(block215);
                    fallPlatform1.getChildren().remove(block215);
                }),
                new KeyFrame(Duration.millis(12000), (e) -> {
                    buffer1.getChildren().add(block216);
                    fallPlatform1.getChildren().remove(block216);
                }),
                new KeyFrame(Duration.millis(12750), (e) -> {
                    buffer1.getChildren().add(block217);
                    fallPlatform1.getChildren().remove(block217);
                }),
                new KeyFrame(Duration.millis(13500), (e) -> {
                    buffer1.getChildren().add(block218);
                    fallPlatform1.getChildren().remove(block218);
                }),
                new KeyFrame(Duration.millis(14250), (e) -> {
                    buffer1.getChildren().add(block2181);
                    fallPlatform1.getChildren().remove(block2181);
                }),
                new KeyFrame(Duration.millis(15000), (e) -> {
                    buffer1.getChildren().add(block2182);
                    fallPlatform1.getChildren().remove(block2182);
                }),
                new KeyFrame(Duration.millis(15750), (e) -> {
                    buffer1.getChildren().add(block2183);
                    fallPlatform1.getChildren().remove(block2183);
                }),
                new KeyFrame(Duration.millis(16500), (e) -> {
                    buffer1.getChildren().add(block2184);
                    fallPlatform1.getChildren().remove(block2184);
                }),
                new KeyFrame(Duration.millis(17250), (e) -> {
                    buffer1.getChildren().add(block2185);
                    fallPlatform1.getChildren().remove(block2185);
                }),
                new KeyFrame(Duration.millis(18000), (e) -> {
                    buffer1.getChildren().add(block2186);
                    fallPlatform1.getChildren().remove(block2186);
                }),
                new KeyFrame(Duration.millis(18750), (e) -> {
                    buffer1.getChildren().add(block2187);
                    fallPlatform1.getChildren().remove(block2187);
                }),
                new KeyFrame(Duration.millis(19500), (e) -> {
                    buffer1.getChildren().add(block2188);
                    fallPlatform1.getChildren().remove(block2188);
                })
        );
        //falling.setCycleCount(11);
        falling1.play();
        falling1.setOnFinished((e) -> {
            System.out.println("stopFalling1");
            fallin1 = false;
        });
    }
}