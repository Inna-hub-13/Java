package com.example.thirtheenthsteps;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MultipleStages extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {

        Scene scene1 = new Scene(new Button("Ok"), 450, 500);
        primaryStage.setScene(scene1);
        primaryStage.setTitle("Stage 1");
        primaryStage.show();

        Stage stage = new Stage();
        stage.setTitle("Stage 2");
        stage.setScene(new Scene(new Button("Next stage"), 450, 500));
        stage.show();

        primaryStage.setResizable(false);
        stage.setResizable(true);
    }

}
