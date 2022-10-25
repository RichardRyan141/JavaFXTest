package com.example.javafxtest;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    Button button,button2;

    Scene scene1,scene2;
    @Override
    public void start(Stage primaryStage) throws Exception
    {
        primaryStage.setTitle("JavaFX Test");

        button = new Button();
        button.setText("Go to Scene 2");
        button.setOnAction(e -> primaryStage.setScene(scene2));

        button2 = new Button();
        button2.setText("Go back to Scene 1");
        button2.setOnAction(e -> primaryStage.setScene(scene1));

        Label label1 = new Label("This is the first scene");

        VBox layout1 = new VBox(20);
        layout1.getChildren().addAll(label1,button);
        scene1 = new Scene(layout1,300,200);

        StackPane layout2 = new StackPane();
        layout2.getChildren().add(button2);
        scene2 = new Scene(layout2,600,300);

        primaryStage.setScene(scene1);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}