/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameproject1;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;
import java.util.Scanner;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author wildm_000
 */
public class High_Score extends Application {
public Label points;

    /**
 * Open and read a file, and return the lines in the file as a list
 * of Strings.
 * (Demonstrates Java FileReader, BufferedReader, and Java5.)
 */
    @Override
    public void start(Stage primaryStage) {
        StackPane root = new StackPane();
        Scene scene = new Scene(root);
       
        ImageView imga = new ImageView(new Image("file:Resources\\c.png"));
        imga.setScaleX(1);
        imga.setScaleY(1);
        root.getChildren().add(imga);
        
        ImageView yes = new ImageView(new Image("file:Resources\\itis.png"));
        root.getChildren().add(yes);
        yes.setTranslateX(-155);
        yes.setScaleX(1);
        yes.setScaleY(1);
        
        Label T = new Label("You can't beat me mortal");
        root.getChildren().add(T);
        T.setTranslateX(-155);
        T.setTranslateY(175);
        T.setScaleX(2);
        T.setScaleY(2);
        
        Label H = new Label("TRE = 69");
        root.getChildren().add(H);
        H.setScaleX(4);
        H.setScaleY(4);
        
        
        points = new Label("You: 0");
        root.getChildren().add(points);
        points.setTranslateY(100);
        points.setScaleX(4);
        points.setScaleY(4);
        
        //File file = new File("High_Score.txt");
       // try{
        //   Scanner input = new Scanner(file); 
        //   while(input.hasNext()){
        //       String num = input.nextLine();
        //   }
       // }
        //catch(FileNotFoundException e){
        //    System.out.println("Heck");
        //}
        
        
        
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
        primaryStage.setTitle("High Score");
        primaryStage.show();
    }
    public class Score{
        
        private int score = 0;
        
        public void getScore(int pscore){
            
            Platform.runLater(() -> {points.setText("You: " + score);
            });
        }
    }
}
