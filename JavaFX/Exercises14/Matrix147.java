package com.example.thirtheenthsteps;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Matrix147 extends Application{

    @Override
    public void start(Stage primaryStage) {

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setPadding(new Insets(5, 5, 5, 5));
        fillPane(grid, 10);

        Scene scene = new Scene(grid, 350, 350);
        primaryStage.setTitle("Matrix");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void fillPane(GridPane pane, int n) {

        TextField txf;
        int random;

        for(int i = 0; i < n; i++){

            for(int j = 0; j < n; j++){
                random = (int)(Math.random() * 2);
                txf = new TextField();
                txf.setText(String.valueOf(random));
                pane.add(txf, i, j);
            }
        }
    }
}
