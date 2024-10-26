package com.example.thirtheenthsteps;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class TicTacToeBoard142 extends Application {

    @Override
    public void start(Stage primaryStage) {

        GridPane grid = new GridPane();
        fillGrid(grid, 3, 3);

        grid.setPadding(new Insets(15, 15, 15, 15));
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setStyle("-fx-background-color: rgba(125,70,133,0.5)");

        Scene scene = new Scene(grid, 750, 750);
        primaryStage.setTitle("Tic Tac Toe Board");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private static void fillGrid(GridPane grid, int r, int c) {

        int randomNumber;
        for(int i = 0; i < r; i++) {

            for(int j = 0; j < c; j++) {

                randomNumber = (int)(Math.random() * 3);
                // if random number == 0 -> do nothing
                if(randomNumber == 1)
                    grid.add(new ImageView(new Image("o.png")), i, j);
                else if(randomNumber == 2)
                    grid.add(new ImageView(new Image("x.png")), i, j);
            }
        }
    }

}
