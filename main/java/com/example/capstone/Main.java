//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.example.capstone;

import java.io.FileInputStream;
import java.io.IOException;
import javafx.application.Application;
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
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import javafx.stage.Stage;

public class Main extends Application {


    public void start(Stage primaryStage) throws IOException {
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
        primaryStage.setTitle("TutorU");
        primaryStage.setWidth(1280.0D);
        primaryStage.setHeight(720.0D);
        primaryStage.setResizable(false);
        primaryStage.setFullScreenExitHint("ESCAPE BY PRESSING q");
        primaryStage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
