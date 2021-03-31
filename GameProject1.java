/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameproject1;       //Visual studios community for C sharp

//import CSS_test.css;
import java.util.Random;
//import com.sun.glass.ui.Cursor;
import java.io.File;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author 04LabB212ad
 */
public class GameProject1 extends Application {
    public static MediaPlayer ppp;
    @Override
    public void start(Stage primaryStage) {
        
        
        ImageView imgview = new ImageView(new Image("file:Resources\\c.png"));
        imgview.setScaleX(1);
        imgview.setScaleY(1);
        StackPane root = new StackPane();
        root.getChildren().add(imgview);
        
        Label t = new Label("The Platformer");
        t.setScaleX(5);
        t.setScaleY(5); 
        root.getChildren().add(t);
        t.setTranslateY(-150);
        
        Label r = new Label("Made by: Cesar, Cole, Manuel, and Jonathan");
        r.setScaleX(3);
        r.setScaleY(3);
        root.getChildren().add(r);
        r.setTranslateY(-50);
        
        Button Play = new Button("Play");
        //Play.setId("start");
        root.getChildren().add(Play);
        Play.setScaleX(5);
        Play.setScaleY(5);
        Play.setTranslateY(50);
        Play.setOnAction((ActionEvent ae) -> {
            primaryStage.close();
            new Game().start(primaryStage);
        });
        //Play.setId("#start");
        
        Button Help = new Button("Help");
        root.getChildren().add(Help);
        Help.setScaleX(3);
        Help.setScaleY(3);
        Help.setTranslateX(-75);
        Help.setTranslateY(175);
        Help.setOnAction((ActionEvent ae) -> {
            primaryStage.close();
            new Help().start(primaryStage);
        });
        
        ImageView fgb = new ImageView(new Image("file:Resources\\Feels_good_man.jpg"));
        root.getChildren().add(fgb);
        fgb.setScaleX(1);
        fgb.setScaleY(1);
        fgb.setTranslateX(-300);
        fgb.setTranslateY(150);
        fgb.setVisible(false);
        
        ImageView M = new ImageView(new Image("file:Resources\\Mario.png"));
        root.getChildren().add(M);
        M.setScaleX(0.5);
        M.setScaleY(0.5);
        M.setTranslateX(300);
        M.setTranslateY(150);
        
        Button HS = new Button("High Score");
        root.getChildren().add(HS);
        HS.setScaleX(4);
        HS.setScaleY(3.5);
        HS.setTranslateX(0);
        HS.setTranslateY(275);
        HS.setOnAction((ActionEvent ae) -> {
            primaryStage.close();
            new High_Score().start(primaryStage);
        });
        
        Button Quit = new Button("Quit");
        root.getChildren().add(Quit);
        Quit.setScaleX(3);
        Quit.setScaleY(3);
        Quit.setTranslateX(75);
        Quit.setTranslateY(175);
        Quit.setOnAction((ActionEvent ae) -> {
            System.exit(0);
        });
        Quit.toFront();
        
        
        Scene scene = new Scene(root, 300, 250);
//        scene.getStylesheets().add(GameProject1.class.getResource("Design.css").toExternalForm());//add our css
        primaryStage.setResizable(false);
        primaryStage.setMinHeight(700);
        primaryStage.setMinWidth(1280);
        primaryStage.setScene(scene);
        //primaryStage.getStylesheets().add(GameProject1.class.getResource("CSS_test.css").toExternalForm());//add our css
        primaryStage.show();
        if (ppp != null) {
            ppp.dispose();
        }
        ppp = new MediaPlayer(new Media(new File("Resources\\"
                + "SMB.mp3").toURI().toString()));
        ppp.setCycleCount(MediaPlayer.INDEFINITE);
        ppp.setVolume(0.05);
        ppp.play();
        
        //while (true){
            //try {Thread.sleep(100);} catch (InterruptedException ignore) {}
            Random Rad = new Random();
            int i = Rad.nextInt(15);
                if (i == 1){
                    t.setTextFill(Color.RED);
                    Quit.setTextFill(Color.RED);
                    r.setTextFill(Color.RED);
                    Help.setTextFill(Color.RED);
                    Play.setTextFill(Color.RED);
                    HS.setTextFill(Color.RED);
                }
                else if (i == 2){
                    t.setTextFill(Color.MAGENTA);
                    Quit.setTextFill(Color.MAGENTA);
                    r.setTextFill(Color.MAGENTA);
                    Help.setTextFill(Color.MAGENTA);
                    Play.setTextFill(Color.MAGENTA);
                    HS.setTextFill(Color.MAGENTA);
                }
                else if (i == 3){
                    t.setTextFill(Color.DARKVIOLET);
                    Quit.setTextFill(Color.DARKVIOLET);
                    r.setTextFill(Color.DARKVIOLET);
                    Help.setTextFill(Color.DARKVIOLET);
                    Play.setTextFill(Color.DARKVIOLET);
                    HS.setTextFill(Color.DARKVIOLET);
                }
                else if (i == 4){
                    t.setTextFill(Color.LIMEGREEN);
                    Quit.setTextFill(Color.LIMEGREEN);
                    r.setTextFill(Color.LIMEGREEN);
                    Help.setTextFill(Color.LIMEGREEN);
                    Play.setTextFill(Color.LIMEGREEN);
                    HS.setTextFill(Color.LIMEGREEN);
                }
                else if (i == 5){
                    t.setTextFill(Color.LIME);
                    Quit.setTextFill(Color.LIME);
                    r.setTextFill(Color.LIME);
                    Help.setTextFill(Color.LIME);
                    Play.setTextFill(Color.LIME);
                    HS.setTextFill(Color.LIME);
                }
                else if (i == 6){
                    t.setTextFill(Color.BLUE);
                    Quit.setTextFill(Color.BLUE);
                    r.setTextFill(Color.BLUE);
                    Help.setTextFill(Color.BLUE);
                    Play.setTextFill(Color.BLUE);
                    HS.setTextFill(Color.BLUE);
                }
                else if (i == 7){
                    t.setTextFill(Color.GREEN);
                    Quit.setTextFill(Color.GREEN);
                    r.setTextFill(Color.GREEN);
                    Help.setTextFill(Color.GREEN);
                    Play.setTextFill(Color.GREEN);
                    HS.setTextFill(Color.GREEN);
                }
                else if (i == 8){
                    t.setTextFill(Color.ROYALBLUE);
                    Quit.setTextFill(Color.ROYALBLUE);
                    r.setTextFill(Color.ROYALBLUE);
                    Help.setTextFill(Color.ROYALBLUE);
                    Play.setTextFill(Color.ROYALBLUE);
                    HS.setTextFill(Color.ROYALBLUE);
                }
                else if (i == 9){
                    t.setTextFill(Color.SKYBLUE);
                    Quit.setTextFill(Color.SKYBLUE);
                    r.setTextFill(Color.SKYBLUE);
                    Help.setTextFill(Color.SKYBLUE);
                    Play.setTextFill(Color.SKYBLUE);
                    HS.setTextFill(Color.SKYBLUE);
                }
                else if (i == 10){
                    t.setTextFill(Color.AQUAMARINE);
                    Quit.setTextFill(Color.AQUAMARINE);
                    r.setTextFill(Color.AQUAMARINE);
                    Help.setTextFill(Color.AQUAMARINE);
                    Play.setTextFill(Color.AQUAMARINE);
                    HS.setTextFill(Color.AQUAMARINE);
                }
                else if (i == 11){
                    t.setTextFill(Color.TOMATO);
                    Quit.setTextFill(Color.TOMATO);
                    r.setTextFill(Color.TOMATO);
                    Help.setTextFill(Color.TOMATO);
                    Play.setTextFill(Color.TOMATO);
                    HS.setTextFill(Color.TOMATO);
                }
                else if (i == 12){
                    t.setTextFill(Color.CORAL);
                    Quit.setTextFill(Color.CORAL);
                    r.setTextFill(Color.CORAL);
                    Help.setTextFill(Color.CORAL);
                    Play.setTextFill(Color.CORAL);
                    HS.setTextFill(Color.CORAL);
                }
                else if (i == 13){
                    t.setTextFill(Color.FIREBRICK);
                    Quit.setTextFill(Color.FIREBRICK);
                    r.setTextFill(Color.FIREBRICK);
                    Help.setTextFill(Color.FIREBRICK);
                    Play.setTextFill(Color.FIREBRICK);
                    HS.setTextFill(Color.FIREBRICK);
                }
                else if (i == 14){
                    t.setTextFill(Color.CRIMSON);
                    Help.setTextFill(Color.CRIMSON);
                    Quit.setTextFill(Color.CRIMSON);
                    Play.setTextFill(Color.CRIMSON);
                    r.setTextFill(Color.CRIMSON);
                    HS.setTextFill(Color.CRIMSON);
                }
                else if (i == 15){
                    t.setTextFill(Color.ORCHID);
                    Quit.setTextFill(Color.ORCHID);
                    r.setTextFill(Color.ORCHID);
                    Help.setTextFill(Color.ORCHID);
                    Play.setTextFill(Color.ORCHID);
                    HS.setTextFill(Color.ORCHID);
                }
                else{
                    t.setTextFill(Color.BLACK);
                    Quit.setTextFill(Color.BLACK);
                    r.setTextFill(Color.BLACK);
                    Help.setTextFill(Color.BLACK);
                    Play.setTextFill(Color.BLACK);
                    HS.setTextFill(Color.BLACK);
                }
            //}
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
