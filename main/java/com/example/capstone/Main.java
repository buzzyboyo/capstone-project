//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.example.capstone;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Stack;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Main extends Application {
    private Stage stage;

    @Override
    public void start(Stage primaryStage) throws Exception{
        stage = primaryStage;
        Scene scene = logInScene();
        Image icon = new Image("C:\\Users\\ethan\\IdeaProjects\\CapStone\\src\\icon.png");
        primaryStage.getIcons().add(icon);
        primaryStage.setTitle("TutorU");
        primaryStage.setWidth(1280.0D);
        primaryStage.setHeight(720.0D);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public Scene logInScene() throws FileNotFoundException {
        StackPane root = new StackPane();

        Button login = new Button("-->");

        login.setOnMouseEntered((e) -> {
            login.setStyle("-fx-background-color: #9c8867; -fx-font-size: 2em; -fx-text-fill: #ffffff");
        });
        login.setOnMouseExited((e) -> {
            login.setStyle("-fx-background-color: #948c7e; -fx-font-size: 2em; -fx-text-fill: #ffffff");
        });
        login.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent t) {
                stage.setScene(HomeLobbyScene());
            }
        });

        login.setStyle("-fx-background-color: #948c7e; -fx-font-size: 2em; -fx-text-fill: #ffffff");
        Shape wSide = new Rectangle(350.0D, 720.0D, Paint.valueOf("ffffff"));
        TextField userText = new TextField();
        userText.setMaxWidth(150.0D);
        PasswordField pwdText = new PasswordField();
        pwdText.setMaxWidth(150.0D);
        Label userName = new Label("Username:");
        Label pw = new Label("Password:");
        Label menuTitle = new Label("TutorU", new ImageView(new Image(new FileInputStream("C:\\Users\\ethan\\IdeaProjects\\CapStone\\src\\icon2.png"))));
        menuTitle.setStyle("-fx-background-color: rgba(0, 100, 100, 0.0); -fx-font-size: 2em; -fx-text-fill: #000000");
        StackPane.setAlignment(menuTitle, Pos.TOP_LEFT);
        StackPane.setAlignment(login, Pos.CENTER_LEFT);
        StackPane.setAlignment(userText, Pos.CENTER_LEFT);
        StackPane.setAlignment(pwdText, Pos.CENTER_LEFT);
        StackPane.setAlignment(userName, Pos.CENTER_LEFT);
        StackPane.setAlignment(pw, Pos.CENTER_LEFT);
        StackPane.setAlignment(wSide, Pos.CENTER_LEFT);
        menuTitle.setTranslateX(100.0D);
        userText.setTranslateX(100.0D);
        userText.setTranslateY(-140.0D);
        userName.setTranslateX(100.0D);
        userName.setTranslateY(-160.0D);
        pwdText.setTranslateX(100.0D);
        pwdText.setTranslateY(-90.0D);
        pw.setTranslateX(100.0D);
        pw.setTranslateY(-110.0D);
        login.setTranslateX(140.0D);
        login.setTranslateY(50.0D);
        root.getChildren().addAll(new Node[]{new ImageView("C:\\Users\\ethan\\IdeaProjects\\CapStone\\src\\MainB.png"), wSide, login, userText, pwdText, pw, userName, menuTitle});

        return new Scene(root);
    }

    protected Scene HomeLobbyScene(){
        StackPane root = new StackPane();
        //Label userName = new Label("Username:");
        //profile pic addition
        ImageView background = new ImageView("C:\\Users\\ethan\\IdeaProjects\\CapStone\\src\\default.png");
        Button pp = new Button("", background);
        pp.setStyle("-fx-background-color: #F5F5DC; -fx-font-size: 2em; -fx-text-fill: #ffffff; -fx-background-radius: 5em; -fx-min-width: 70px; -fx-min-height: 75px; -fx-max-width: 70px; -fx-max-height: 75px");
        pp.setOnMouseEntered((e) -> {
            pp.setStyle("-fx-background-color: #DBDBC3; -fx-font-size: 2em; -fx-text-fill: #ffffff; -fx-background-radius: 5em; -fx-min-width: 70px; -fx-min-height: 75px; -fx-max-width: 70px; -fx-max-height: 75px");
        });
        pp.setOnMouseExited((e) -> {
            pp.setStyle("-fx-background-color: #F5F5DC; -fx-font-size: 2em; -fx-text-fill: #ffffff; -fx-background-radius: 5em; -fx-min-width: 70px; -fx-min-height: 75px; -fx-max-width: 70px; -fx-max-height: 75px");
        });
        StackPane.setAlignment(pp, Pos.TOP_RIGHT);
        pp.setMaxSize(55,66);
        pp.setTranslateX(-20);
        pp.setTranslateY(10);
        //create settings button with gear icon
        ImageView gear = new ImageView("C:\\Users\\ethan\\IdeaProjects\\CapStone\\src\\settings.png");
        Button st = new Button("", gear);
        st.setStyle("-fx-background-color: #F5F5DC; -fx-font-size: 2em; -fx-text-fill: #ffffff; -fx-background-radius: 5em; -fx-min-width: 70px; -fx-min-height: 75px; -fx-max-width: 70px; -fx-max-height: 75px");
        st.setOnMouseEntered((e) -> {
            st.setStyle("-fx-background-color: #DBDBC3; -fx-font-size: 2em; -fx-text-fill: #ffffff; -fx-background-radius: 5em; -fx-min-width: 70px; -fx-min-height: 75px; -fx-max-width: 70px; -fx-max-height: 75px");
        });
        st.setOnMouseExited((e) -> {
            st.setStyle("-fx-background-color: #F5F5DC; -fx-font-size: 2em; -fx-text-fill: #ffffff; -fx-background-radius: 5em; -fx-min-width: 70px; -fx-min-height: 75px; -fx-max-width: 70px; -fx-max-height: 75px");
        });
        StackPane.setAlignment(st, Pos.TOP_RIGHT);
        st.setMaxSize(55,66);
        st.setTranslateX(-100);
        st.setTranslateY(10);

        //create tan panels
        Shape tSide = new Rectangle(1280.0D, 100.0D, Paint.valueOf("#C2C2AA"));
        StackPane.setAlignment(tSide, Pos.TOP_CENTER);
        Shape rSide = new Rectangle(100.0D, 720.0D, Paint.valueOf("#DBDBC3"));
        StackPane.setAlignment(rSide, Pos.CENTER_RIGHT);
        //create buttons in the left bottom corner
        Button jServer = new Button("Join");
        Button hServer = new Button("Host");
        Button settings = new Button("Settings");
        jServer.setBackground(null);//make backgrounds clear so the button is just text
        hServer.setBackground(null);
        settings.setBackground(null);
        //Font font = Font.font("Courier New", FontWeight.BOLD, 24);
        // jServer.setFont(font);//set fonts
        // hServer.setFont(font);
        // settings.setFont(font);
        jServer.setStyle("-fx-background-color: transparent; -fx-font-family: Courier New; -fx-text-fill: #ffffff; -fx-font-size: 2em; -fx-font-weight: bold; -fx-text-stroke: black; -fx-stroke-width: 3");
        hServer.setStyle("-fx-background-color: transparent; -fx-font-family: Courier New; -fx-text-fill: #ffffff; -fx-font-size: 2em; -fx-font-weight: bold; -fx-text-stroke: black; -fx-stroke-width: 3");
        settings.setStyle("-fx-background-color: transparent; -fx-font-family: Courier New; -fx-text-fill: #ffffff; -fx-font-size: 2em; -fx-font-weight: bold; -fx-text-stroke: black; -fx-stroke-width: 3");

        //create fading when mouseover
        jServer.setOnMouseEntered((e) -> {jServer.setStyle("-fx-background-color: transparent; -fx-font-family: Courier New; -fx-text-fill: #000000; -fx-font-size: 2em; -fx-opacity: 0.75; -fx-font-weight: bold");});
        jServer.setOnMouseExited((e) -> {jServer.setStyle("-fx-background-color: transparent; -fx-font-family: Courier New; -fx-text-fill: #ffffff; -fx-font-size: 2em; -fx-opacity: 1.0; -fx-font-weight: bold");});
        hServer.setOnMouseEntered((e) -> {hServer.setStyle("-fx-background-color: transparent; -fx-font-family: Courier New; -fx-text-fill: #000000; -fx-font-size: 2em; -fx-opacity: 0.75; -fx-font-weight: bold");});
        hServer.setOnMouseExited((e) -> {hServer.setStyle("-fx-background-color: transparent; -fx-font-family: Courier New; -fx-text-fill: #ffffff; -fx-font-size: 2em; -fx-opacity: 1.0; -fx-font-weight: bold");});
        settings.setOnMouseEntered((e) -> {settings.setStyle("-fx-background-color: transparent; -fx-font-family: Courier New; -fx-text-fill: #000000; -fx-font-size: 2em; -fx-opacity: 0.75; -fx-font-weight: bold");});
        settings.setOnMouseExited((e) -> {settings.setStyle("-fx-background-color: transparent; -fx-font-family: Courier New; -fx-text-fill: #ffffff; -fx-font-size: 2em; -fx-opacity: 1.0; -fx-font-weight: bold");});

        //set positioning of buttons
        StackPane.setAlignment(jServer, Pos.TOP_LEFT);
        StackPane.setAlignment(hServer, Pos.TOP_LEFT);
        StackPane.setAlignment(settings, Pos.TOP_LEFT);
        jServer.setTranslateX(20);
        hServer.setTranslateX(90);
        settings.setTranslateX(165);
        jServer.setTranslateY(25);
        hServer.setTranslateY(25);
        settings.setTranslateY(25);



        root.getChildren().addAll(new ImageView("C:\\Users\\ethan\\IdeaProjects\\CapStone\\src\\online.jpg"),rSide,tSide, pp, st, jServer, hServer, settings);
        return new Scene(root);
    }

    /*public void startt(Stage primaryStage) throws IOException {
        StackPane root = new StackPane();
        Button login = new Button("-->");

        login.setOnMouseEntered((e) -> {
            login.setStyle("-fx-background-color: #9c8867; -fx-font-size: 2em; -fx-text-fill: #ffffff");
        });
        login.setOnMouseExited((e) -> {
            login.setStyle("-fx-background-color: #948c7e; -fx-font-size: 2em; -fx-text-fill: #ffffff");
        });
        login.setStyle("-fx-background-color: #948c7e; -fx-font-size: 2em; -fx-text-fill: #ffffff");
        Shape wSide = new Rectangle(350.0D, 720.0D, Paint.valueOf("ffffff"));
        TextField userText = new TextField();
        userText.setMaxWidth(150.0D);
        PasswordField pwdText = new PasswordField();
        pwdText.setMaxWidth(150.0D);
        Label userName = new Label("Username:");
        Label pw = new Label("Password:");
        Label menuTitle = new Label("TutorU", new ImageView(new Image(new FileInputStream("C:\\Users\\ethan\\IdeaProjects\\CapStone\\src\\icon2.png"))));
        menuTitle.setStyle("-fx-background-color: rgba(0, 100, 100, 0.0); -fx-font-size: 2em; -fx-text-fill: #000000");
        StackPane.setAlignment(menuTitle, Pos.TOP_LEFT);
        StackPane.setAlignment(login, Pos.CENTER_LEFT);
        StackPane.setAlignment(userText, Pos.CENTER_LEFT);
        StackPane.setAlignment(pwdText, Pos.CENTER_LEFT);
        StackPane.setAlignment(userName, Pos.CENTER_LEFT);
        StackPane.setAlignment(pw, Pos.CENTER_LEFT);
        StackPane.setAlignment(wSide, Pos.CENTER_LEFT);
        menuTitle.setTranslateX(100.0D);
        userText.setTranslateX(100.0D);
        userText.setTranslateY(-140.0D);
        userName.setTranslateX(100.0D);
        userName.setTranslateY(-160.0D);
        pwdText.setTranslateX(100.0D);
        pwdText.setTranslateY(-90.0D);
        pw.setTranslateX(100.0D);
        pw.setTranslateY(-110.0D);
        login.setTranslateX(140.0D);
        login.setTranslateY(50.0D);
        root.getChildren().addAll(new Node[]{new ImageView("C:\\Users\\ethan\\IdeaProjects\\CapStone\\src\\MainB.png"), wSide, login, userText, pwdText, pw, userName, menuTitle});
        Scene scene = new Scene(root);
        Image icon = new Image("C:\\Users\\ethan\\IdeaProjects\\CapStone\\src\\icon.png");
        primaryStage.getIcons().add(icon);

        //customizing size of the stage
        primaryStage.setTitle("TutorU");
        primaryStage.setWidth(1280.0D);
        primaryStage.setHeight(720.0D);
        primaryStage.setResizable(false);
        //full screen options
        primaryStage.setFullScreen(false);
        primaryStage.setFullScreenExitHint("ESCAPE BY PRESSING q");
        primaryStage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));



        //setting the scene of the stage and presenting it
        primaryStage.setScene(scene);
        primaryStage.show();
    }*/

    public static void main(String[] args) {
        Application.launch(args);
    }
}
