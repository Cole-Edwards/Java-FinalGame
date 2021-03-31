/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameproject1;
                                    //TRENTON BABY SUN
import java.io.File;                //OP ZL IN
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.scene.paint.Color;
import javafx.geometry.NodeOrientation;
import static javafx.geometry.NodeOrientation.LEFT_TO_RIGHT;
import static javafx.geometry.NodeOrientation.RIGHT_TO_LEFT;
import javafx.scene.CacheHint;
import javafx.scene.ImageCursor;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

/**
 *
 * @author 04LabB212
 */
public class Game extends Application {
    public boolean oscillate = false;
    public ArrayList<MiniHopkins> minihoplist;
    public ArrayList<Kyle> kyles = new ArrayList<>();
    public StackPane root;
    public Image img;
    public Image justin;
    public ImageView HSS;
    public ImageView taco;
    //public ImageView HSS;
    //public Image dolan;
    public Label t;
    public Label r;
    public Label Re;
    public Label Super;
    public Button Play;
    public Button Quit;
    public Button Cont;
    public Image HS;
    public Image player;
    public ImageView pview;
    public Image Floor;
    public ImageView fview;
    public boolean left;
    public boolean right;
    public boolean jump;
    public boolean isjump;
    public boolean crouch;
    public boolean minihop;
    public boolean minihopSS;
    public boolean o = false;
    public boolean p = false;
    public boolean lose = false;
    public boolean i;
    public boolean n;
    public boolean z;
    //public boolean h;
    public boolean l;
    public boolean v = false;
    public volatile boolean Esc;
    public static MediaPlayer Zelda;
    public static MediaPlayer jumpsound;
    //public boolean menu = false;
    public Label L;
    public Label P;
    public Label points;
    public Button main;
    public Button CH1;
    public Button CH2;
    public Button Ch3;
    public boolean reset = true;
    public int incri = 0;
    public int jumpint = 0;
    //public ImageView trenton = new ImageView(new Image("file:C:\\Users\\04LabB212\\Pictures\\xD.png"));
    @Override
    public void start(Stage primaryStage) {
        
        minihoplist = new ArrayList<>();
        root = new StackPane();

        img = new Image("file:Resources\\c.png");
        ImageView imgview = new ImageView(img);
        imgview.setScaleX(1);
        imgview.setScaleY(1);
        root.getChildren().add(imgview);
        
        main = new Button("Main Menu");
        root.getChildren().add(main);
        main.setScaleX(3);
        main.setScaleY(3);
        main.setTranslateY(0);
        main.setOnAction((ActionEvent ae) -> {
            primaryStage.close();
            new GameProject1().start(primaryStage);
        });
        main.setVisible(false);
        
        Cont = new Button("Again?");
        root.getChildren().add(Cont);
        Cont.setScaleX(3);
        Cont.setScaleY(3);
        Cont.setTranslateY(-100);
        Cont.setOnAction((ActionEvent ae) -> {
            primaryStage.close();
            new Game().start(primaryStage);
        });
        Cont.setVisible(false);
        Cont.toFront();
        
        
        Quit = new Button("Quit");
        root.getChildren().add(Quit);
        Quit.setScaleX(3);
        Quit.setScaleY(3);
        Quit.setTranslateY(100);
        Quit.setOnAction((ActionEvent ae) -> {
            System.exit(0);
        });
        Quit.setVisible(false);
        Quit.toFront();
        
        P = new Label("Paused");
        root.getChildren().add(P);
        P.setScaleX(4);
        P.setScaleY(4);
        P.setTranslateY(-150);
        P.setVisible(false);
        
        points = new Label("Score: 0");
        root.getChildren().add(points);
        points.setTranslateX(550);
        points.setTranslateY(-250);
        points.setScaleX(3);
        points.setScaleY(3);
        
        Re = new Label("To continue, press Esc.");
        root.getChildren().add(Re);
        Re.setTranslateY(-75);
        Re.setScaleX(2.5);
        Re.setScaleY(2.5);
        Re.setVisible(false);
        
        ImageView dolan = new ImageView(new Image("file:Resources\\Dolan.png"));
        root.getChildren().add(dolan);
        dolan.setScaleX(1);
        dolan.setScaleY(1);
        dolan.setRotate(45);
        dolan.setTranslateX(-600);
        dolan.setTranslateY(-200);
        
        Image tac = new Image("file:Resources\\tacnuk.png");
        taco = new ImageView(tac);
        root.getChildren().add(taco);
        taco.setScaleX(1);
        taco.setScaleY(1);
        taco.setTranslateY(-250);
        taco.setVisible(false);
        taco.toFront();
        
        Super = new Label("Press V to unleash your potential!");
        Super.setScaleX(5);
        Super.setScaleY(5);
        root.getChildren().add(Super);
        Super.setTranslateY(-100);
        Super.setVisible(false);
        Super.toFront();
        
        HS = new Image("file:Resources\\HSSG.png");
        HSS = new ImageView(HS);
        root.getChildren().add(HSS);
        //HSS.setTranslateX(-285); 
        //HSS.setTranslateY(205);
        HSS.setCacheHint(CacheHint.SPEED);
        HSS.setVisible(false);
        
        ImageView trenton = new ImageView(new Image("file:Resources\\Trenton.png"));
        root.getChildren().add(trenton);
        trenton.toFront();
        trenton.setScaleX(0.3);
        trenton.setScaleY(0.3);
        trenton.setRotate(-45);
        trenton.setTranslateX(615);
        trenton.setTranslateY(-200);
        
        justin = new Image("file:Resources\\ye2.0.png");
        //root.getChildren().add(justin);
        
        L = new Label("You Lose!");
        L.setScaleX(5);
        L.setScaleY(5);
        root.getChildren().add(L);
        L.setTranslateY(-175);
        L.setVisible(false);
        
        CH1 = new Button("Character 1");
        CH1.setScaleX(3);
        CH1.setScaleY(3);
        root.getChildren().add(CH1);
        CH1.setTranslateX(175);
        CH1.setTranslateY(-175);
        CH1.setVisible(false);
        
        
        
        player = new Image("file:Resources\\trans.png");
        pview = new ImageView(player);
        root.getChildren().add(pview);
        pview.setTranslateX(-285); 
        pview.setTranslateY(205);
        pview.setCacheHint(CacheHint.SPEED);
       
        
        
        
        
        Floor = new Image("file:Resources\\Floor.png");
        fview = new ImageView(Floor);
        imgview.setScaleX(1);
        imgview.setScaleY(1);
        root.getChildren().add(fview);
        fview.setTranslateY(300);
        
        //v = false;
        
        Scene scene = new Scene(root, 300, 250);
        scene.setCursor(ImageCursor.DISAPPEAR);
        scene.setOnKeyPressed((KeyEvent ke) -> {
            if ("W".equals(ke.getCode().toString())) {
                jump = true;
                jumpint++;
            }
            if ("D".equals(ke.getCode().toString())) {
                right = true;
            }
            if ("A".equals(ke.getCode().toString())) {
                left = true;
            }
            if ("S".equals(ke.getCode().toString())){
                crouch = true;
            }
            if ("SPACE".equals(ke.getCode().toString())) {
                minihop = true;
                //minihopSS = true;
            }
            if ("O".equals(ke.getCode().toString())){
                o = true;
            }
            if ("P".equals(ke.getCode().toString())){
                p = true;
            }
            if ("I".equals(ke.getCode().toString())){
                i = true;
            }
            if ("N".equals(ke.getCode().toString())){
                n = true;
            }
            if ("Z".equals(ke.getCode().toString())){
                z = true;
            }
            if ("L".equals(ke.getCode().toString())){
                l = true;
            }
            if ("ESCAPE".equals(ke.getCode().toString())){
                
                if (!reset) {
                    Esc = false;
                    reset = true;
                    main.setVisible(false);
                    P.setVisible(false);
                    Quit.setVisible(false);
                    Re.setVisible(false);
                    //Super.setVisible(false);
                }
                else {
                    Esc = true;
                    main.setVisible(true);
                    P.setVisible(true);
                    Quit.setVisible(true);
                    Re.setVisible(true);
                    //Super.setVisible(true);
                }
            }
            if ("V".equals(ke.getCode().toString()) && incri > 25){
                v = true;
                //System.out.println("YOU PRESSED V");
            }
            //if ("H".equals(ke.getCode().toString())){
            //    h = true;
            //}
        });
        scene.setOnKeyReleased((KeyEvent ke) -> {
            if ("ESCAPE".equals(ke.getCode().toString())){
                if (Esc) {
                    reset = false;
                }
            }
            if ("W".equals(ke.getCode().toString())) {
                jump = false;
                jumpint--;
            }
            if ("D".equals(ke.getCode().toString())) {
                right = false;
            }
            if ("A".equals(ke.getCode().toString())) {
                left = false;
            }
            if ("S".equals(ke.getCode().toString())){
                crouch = false;
            }
            if ("SPACE".equals(ke.getCode().toString())) {
                minihop = false;
                //minihopSS = false;
            }
            if ("O".equals(ke.getCode().toString())){
                o = false;
            }
            if ("P".equals(ke.getCode().toString())){
                p = false;
            }
            if ("I".equals(ke.getCode().toString())){
                i = false;
            }
            if ("N".equals(ke.getCode().toString())){
                n = false;
            }
            if ("Z".equals(ke.getCode().toString())){
                z = false;
            }
            if ("L".equals(ke.getCode().toString())){
                l = false;
            }
            //if ("V".equals(ke.getCode().toString())){
            //    v = false;
            //}
            //if ("H".equals(ke.getCode().toString())){
            //    h = false;
            //}
        });
        primaryStage.setResizable(false);
        primaryStage.setMinHeight(700);
        primaryStage.setMinWidth(1280);
        primaryStage.setScene(scene);
        primaryStage.show();
        Thread oscillates = new Thread() {
            @Override
            public void run() {
                while (true) {
                    try {Thread.sleep(400);} catch (InterruptedException ignore) {}
                    oscillate = true;
                    pview.setVisible(true);
                    HSS.setVisible(false);
                    if (v){
                        while (incri < 35){
                            try {Thread.sleep(30);} catch (InterruptedException ignore) {}
                            HSS.setTranslateX(pview.getTranslateX());
                            HSS.setTranslateY(pview.getTranslateY() + -35);
                            HSS.setNodeOrientation(pview.getNodeOrientation());             //Super saiyan transformation
                            oscillate = true;
                            //minihopSS.setTranslateX(minihop.getTranslateX());
                        }
                    }  
                }
            }
        };
        oscillates.setDaemon(true);
        oscillates.start();
        Thread mover = new Thread() {
            @Override
            public void run() {
                boolean bobble = false;
                while (!lose) {
                CheckCollide();
                if (o && p) {
                        Platform.runLater(() -> {
                            trenton.setVisible(true);
                        });
                }
                else {
                    
                    Platform.runLater(() -> {
                            trenton.setVisible(false);
                        });
                }
                if (i && n) {
                        Platform.runLater(() -> {
                            dolan.setVisible(true);
                        });
                }
                else {
                    
                    Platform.runLater(() -> {
                            dolan.setVisible(false);
                        });
                }
                
                if (z && l){
                    GameProject1.ppp.pause();
                    if (Zelda != null)
                    {
                        Zelda.dispose();
                    }
                    Zelda = new MediaPlayer(new Media(new File("Resources\\Zelda.mp3").toURI().toString()));
                    Zelda.play();
                    new Thread() {
                        @Override
                        public void run() {
                            try {Thread.sleep(44000);} catch (InterruptedException E) {}
                            GameProject1.ppp.play();
                        }
                    }.start();
                 //if (jump){
                     
                 //}   
                }
                if (pview.getTranslateX() <= -650) {
                    pview.setTranslateX(649);
                }
                if (pview.getTranslateX() >= 650) {
                    pview.setTranslateX(-649);
                }
                if (minihop && oscillate) {
                    new MiniHopkins().start();
                    oscillate = false;
                }
                if (jump) {
                    new Thread() {
                        @Override
                        public void run() {
                            jumpsound = new MediaPlayer(new Media(new File("Resources\\jump.mp3").toURI().toString()));
                            jumpsound.setVolume(0.05);
                            //jumpsound.play();
                            if (!isjump) {
                                isjump = true;
                                //jumpsound.play();
                            for (int i = 0; i < 100; i++) {     //jump height
                                Platform.runLater(() -> {pview.setTranslateY(pview.getTranslateY() - 1);});
                                try {Thread.sleep(5);} catch(InterruptedException ignoreme) {}
                                
                            }
                            for (int i = 0; i < 100; i++) {
                                Platform.runLater(() -> {pview.setTranslateY(pview.getTranslateY() + 1);});
                                try {Thread.sleep(5);} catch(InterruptedException ignoreme) {}
                            }
                            isjump = false;
                           
                           }
                        }
                    }.start();
                }
                
                if (crouch && !isjump){ 
                    Platform.runLater(() -> {pview.setTranslateY(215);});
                }
                if (!crouch && !isjump) {
                    Platform.runLater(() -> {pview.setTranslateY(205);});
                }
                if (left) {
                    pview.setNodeOrientation(NodeOrientation.RIGHT_TO_LEFT);
                    if (bobble && !crouch) {
                        Platform.runLater(() -> {pview.setTranslateY(pview.getTranslateY() - 10);});
                        bobble = false;
                    }
                    else if (!bobble && !crouch) {
                        Platform.runLater(() -> {pview.setTranslateY(pview.getTranslateY() + 10);});
                        bobble = true;
                    }
                    Platform.runLater(() -> {pview.setTranslateX(pview.getTranslateX() - 5);});
                    
                }
                                
                if (right) {
                    pview.setNodeOrientation(NodeOrientation.LEFT_TO_RIGHT);
                    if (bobble && !crouch) {
                        Platform.runLater(() -> {pview.setTranslateY(pview.getTranslateY() - 10);});
                        bobble = false;
                    }
                    else if (!bobble && !crouch) {
                        Platform.runLater(() -> {pview.setTranslateY(pview.getTranslateY() + 10);});
                        bobble = true;
                    }
                    Platform.runLater(() -> {pview.setTranslateX(pview.getTranslateX() + 5);});
                }
                
                    try {
                        Thread.sleep(20);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Game.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    while (Esc) {
                        try {Thread.sleep(10);} catch (InterruptedException ex) {    
                        }
                    }
                }
                //System.out.println("OMG I AM FROZEN HELP ME YOU LAZY CODERS!");
            }
        };
        mover.setDaemon(true);
        mover.start();
        
        Thread spawner = new Thread() {
            @Override
            public void run() {
                try {Thread.sleep(3000);} catch (InterruptedException ignore) {}
                while (!lose) {
                    Kyle k = new Kyle();
                    kyles.add(k);
                    k.start();
                    try {Thread.sleep(3000);} catch (InterruptedException ignore) {}
                    while (Esc) {
                        try {Thread.sleep(3000);} catch (InterruptedException ex) {}
                    }
                }
            }
        };
        spawner.setDaemon(true);
        spawner.start();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    public void Lose() {
        //System.out.println("YOU LOSE!!!!!!!!!!!!!!");
        //System.out.println("pview: " + pview.getTranslateX());
        L.setVisible(true);
        lose = true;
        main.setVisible(true);
        Cont.setVisible(true);
        Super.setVisible(false);
        
        
    }
    public boolean player_intersects(ImageView p, ImageView kyle) {
        //if (kyle.getTranslateX() - p.getTranslateX() < 75 && (kyle.getTranslateX() - p.getTranslateX()) > - 75 && p.getTranslateX() == pview.getTranslateX()) {
      //      System.out.println(kyle.getTranslateX() - p.getTranslateX());
    //  }
        pview.setTranslateX(pview.getTranslateX());
        return (kyle.getTranslateX() - p.getTranslateX()) < 75 && (kyle.getTranslateX() - p.getTranslateX()) > - 75;
    }
    public void CheckCollide() {
        MiniHopkins[] aa = new MiniHopkins[1000];
        Kyle[] bae = new Kyle[1000];
        MiniHopkins[] a = minihoplist.toArray(aa);
        for (MiniHopkins a1 : a) {
            Kyle[] b = kyles.toArray(bae);
            for (Kyle b1 : b) {
                if (a1 != null && b1 != null && player_intersects(a1.minihop, b1.kys) && a1.minihop.isVisible() && b1.kys.isVisible()) {
                    b1.triggerCollide();
                    a1.triggerCollide();
                }
                if (b1 != null && player_intersects(pview, b1.kys) && b1.kys.isVisible() && b1.kys.getTranslateX() != 650 && b1.kys.getTranslateX() != -650 && b1.kys.getTranslateX() != 0) {
                    //b[i].kys.setVisible(true);
                    //b[i].kys.setScaleX(5);
                    //b[i].kys.setScaleY(5);
                    //System.out.println(pview.getTranslateX() - b[i].kys.getTranslateX());
                    //System.out.println("b1: " + b1.kys.getTranslateX());
                    Lose();
                }
            }
        }
    }
    private class Kyle {
        private final ImageView kys;
        private volatile int collided = 0;
        private int num = 2;
        public Kyle() {
           Random r = new Random();
           int character = (int) (r.nextDouble() * num + 1);
           if (character == 1) {
              kys = new ImageView(new Image("file:Resources\\xD.png"));
           }
           else if (character == 2) {
               kys = new ImageView(justin);
               collided = -3;
           }
           else {
               kys = null;
           }
           kys.setCacheHint(CacheHint.SPEED);
        }
        public void start() {
            new Thread()  {
                @Override
                public void run() {
                    int x;
                    Random r = new Random();
                    final boolean y = r.nextBoolean();
                    kys.setTranslateY(205);
                    if (y) {
                        kys.setNodeOrientation(LEFT_TO_RIGHT);
                        kys.setTranslateX(-650);
                        //kys.setTranslateY(pview.getTranslateY());
                        x = 7;   //speed
                            //if(incri > 35){
                            //    kys.setNodeOrientation(LEFT_TO_RIGHT);
                            //    kys.setTranslateX(-650);
                            //    //kys.setTranslateY(pview.getTranslateY());
                            //    x = 10;   //speed
                            //}
                            //else{
                            //    kys.setNodeOrientation(RIGHT_TO_LEFT);
                            //    kys.setTranslateX(650);
                            //    //kys.setTranslateY(pview.getTranslateY());
                            //    x = -10;  //speed
                            //}
                        }
                        else {
                            kys.setNodeOrientation(RIGHT_TO_LEFT);
                            kys.setTranslateX(650);
                            //kys.setTranslateY(pview.getTranslateY());
                            x = -7;  //speed
                            
                        }
                    Platform.runLater(() -> {
                        root.getChildren().add(kys);  
                    });
                    while (true) {
                        Platform.runLater(() -> {
                            if (!lose) {
                                kys.setTranslateX(kys.getTranslateX() + x);
                            }
                        });
                        
                        if (collided > 0) {//NUMBER OF HITS TO SCREW AN ENEMY OVER
                            Platform.runLater(() -> {
                               kys.setVisible(false);
                               
                            });
                            kyles.remove(this);

                            incri += 1;
                            Platform.runLater(() -> {points.setText("Score: " + incri);
                            Random Rad = new Random();
                            int i = Rad.nextInt(15);
                            if (i == 1)
                                points.setTextFill(Color.RED);
                            else if (i == 2)
                                points.setTextFill(Color.MAGENTA);
                            else if (i == 3)
                                points.setTextFill(Color.DARKVIOLET);
                            else if (i == 4)
                                points.setTextFill(Color.LIMEGREEN);
                            else if (i == 5)
                                points.setTextFill(Color.LIME);
                            else if (i == 6)
                                points.setTextFill(Color.GOLD);
                            else if (i == 7)
                                points.setTextFill(Color.GREEN);
                            else if (i == 8)
                                points.setTextFill(Color.ROYALBLUE);
                            else if (i == 9)
                                points.setTextFill(Color.SKYBLUE);
                            else if (i == 10)
                                points.setTextFill(Color.AQUAMARINE);
                            else if (i == 11)
                                points.setTextFill(Color.TOMATO);
                            else if (i == 12)
                                points.setTextFill(Color.CORAL);
                            else if (i == 13)
                                points.setTextFill(Color.FIREBRICK);
                            else if (i == 14)
                                points.setTextFill(Color.CRIMSON);
                            else if (i == 15)
                                points.setTextFill(Color.ORCHID);
                            else
                                points.setTextFill(Color.BLACK);
                            
                            if (incri == 25){
                                //Super.setVisible(true);
                                taco.setVisible(true);
                                //System.out.println("tacnuke");
                            }
                            else {
                                taco.setVisible(false);
                                Super.setVisible(false);
                            }
                            if (incri > 25 ){
                                Super.setVisible(true);
                                if (v){
                                    //System.out.println("V = true");
                                    //Platform.runLater(() -> {points.setText("Score: " + (incri - 25));});
                                    Super.setVisible(false);
                                    pview.setVisible(false);
                                    //player = new Image("file:Resources\\nailedit.png");
                                    //pview = new ImageView(player);
                                    HSS.setVisible(true);
                                    }
                            }
                            if (incri > 35){
                                pview.setVisible(true);
                                HSS.setVisible(false);
                            }
                            });
                            

                            break;
                        }
                        try {Thread.sleep(30);} catch (InterruptedException ignore) {}
                        while (Esc) {
                        try {Thread.sleep(30);} catch (InterruptedException ex) {}
                    }
                    }
                }
            }.start();
        }
        public void triggerCollide() {
            
           
            //System.out.println("MY JIMMES ARE TRIGGERED");
            collided += 1;
        }
    }
    private class MiniHopkins {
        private final ImageView minihop = new ImageView(new Image("file:Resources\\trans.png"));   
        private boolean collided = false;
        public MiniHopkins() {
            minihop.setCacheHint(CacheHint.SPEED);
            minihop.setRotate(90);
            minihop.setScaleX(0.5);
            minihop.setScaleY(0.5);
        }
        public void start() {
            minihop.setTranslateX(pview.getTranslateX());
            minihop.setTranslateY(pview.getTranslateY());
            Platform.runLater(() -> {root.getChildren().add(minihop);});
            minihoplist.add(this);
            new Thread() {
                @Override
                public void run() {
                    int x;
                    
                    //System.out.println(pview.getNodeOrientation());
                    if (pview.getNodeOrientation().equals(LEFT_TO_RIGHT))
                    {
                         x = 10;
                    }
                    else {
                        x = -10;
                        minihop.setRotate(270);
                    }
                    while (true) {
                        Platform.runLater(() -> {minihop.setTranslateX(minihop.getTranslateX() + x);});
                        
                        if (minihop.getTranslateX() >= 650 || minihop.getTranslateX() <= -650 || collided)
                        {
                            Platform.runLater(() -> {minihop.setVisible(false);});
                            minihoplist.remove(this);
                            break;
                        }
                        try {Thread.sleep(30);} catch (InterruptedException ex) {}
                        while (Esc) {
                            try {Thread.sleep(3000);} catch (InterruptedException ex) {}
                        }
                    }
                    try {this.finalize();} catch (Throwable ex) {}
                }
            }.start();
        }
        public void triggerCollide() {
            //System.out.println("MY JIMMES ARE TRIGGERED");
            
            collided = true;
        }
    }
    
}