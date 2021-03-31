
package gameproject1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author 04LabB212
 */
public class Help extends Application {
    
    @Override
    public void start(Stage primaryStage) {
       StackPane root = new StackPane();
       Scene scene = new Scene(root);
       
       Label C = new Label("Controls:");
       root.getChildren().add(C);
       C.setScaleX(3);
       C.setScaleY(3);
       C.setTranslateY(-100);
       
       
       
        ImageView imga = new ImageView(new Image("file:Resources\\c.png"));
        imga.setScaleX(1);
        imga.setScaleY(1);
        root.getChildren().add(imga);
       
       Label W = new Label("W = Jump");
       root.getChildren().add(W);
       W.setScaleX(2);
       W.setScaleY(2);
       W.setTranslateY(-50);
       
       Label A = new Label("A = Move left");
       root.getChildren().add(A);
       A.setScaleX(2);
       A.setScaleY(2);
       A.setTranslateY(0);
       
       Label S = new Label("S = Crouch");
       root.getChildren().add(S);
       S.setScaleX(2);
       S.setScaleY(2);
       S.setTranslateY(50);
       
       ImageView Y = new ImageView(new Image("file:Resources\\Yoshi.png"));
       root.getChildren().add(Y);
       Y.setScaleX(1);
       Y.setScaleY(1);
       Y.setTranslateX(-200);
       Y.setTranslateY(0);
       //Y.setVisible(true);
       Y.toFront();
       
       Label D = new Label("D = Move right");
       root.getChildren().add(D);
       D.setScaleX(2);
       D.setScaleY(2);
       D.setTranslateY(100);
       
       Label maybe = new Label("There are random buttons/button combinations that can make things happen");
       root.getChildren().add(maybe);
       maybe.setScaleX(2);
       maybe.setScaleY(2);
       maybe.setTranslateY(150);
       
       Label Caution = new Label("Caution: Please keep all mouse and crosshair \n"
               + "appendages in the window at all times");
       root.getChildren().add(Caution);
       Caution.setScaleX(2);
       Caution.setScaleY(2);
       Caution.setTranslateY(200);
       
       Button Back = new Button("Back");
       root.getChildren().add(Back);
       Back.setScaleX(3);
       Back.setScaleY(3);
       Back.setTranslateY(275);
       Back.setOnAction((ActionEvent ae) -> {
           primaryStage.close();
           new GameProject1().start(primaryStage);
       });
       
       primaryStage.setResizable(false);
       primaryStage.setMinHeight(700);
       primaryStage.setMinWidth(1280);
       primaryStage.setMaxHeight(700);
       primaryStage.setMaxWidth(1280);
       primaryStage.setScene(scene);
       primaryStage.setTitle("Help");
       primaryStage.show();
    }

  
}
