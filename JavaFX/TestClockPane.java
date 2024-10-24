package com.example.thirtheenthsteps;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;

public class TestClockPane extends Application {

    @Override
    public void start(Stage primaryStage) {

        ClockPane clock = new ClockPane();
        String time = clock.getHour() + ":" + clock.getMinute() + ":" + clock.getSecond();
        Label labelTime = new Label(time);

        BorderPane root = new BorderPane();
        root.setStyle("-fx-background-color: #aad6a3");
        root.setCenter(clock);
        root.setBottom(labelTime);
        BorderPane.setAlignment(labelTime, Pos.TOP_CENTER);

        Scene scene = new Scene(root, 450, 500);
        primaryStage.setTitle("Clock Time");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
