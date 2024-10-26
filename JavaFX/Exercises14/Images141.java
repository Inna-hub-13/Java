package com.example.thirtheenthsteps;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Images141 extends Application{

    @Override
    public void start(Stage primaryStage) {

        GridPane grid = new GridPane();
        Image i1 = new Image("bg_flag.jpg");
        Image i2 = new Image("Canada.gif");
        Image i3 = new Image("Croatia.gif");
        Image i4 = new Image("Portugal.gif");

        grid.add(new ImageView(i1),0 , 0);
        grid.add(new ImageView(i2),1 , 0);
        grid.add(new ImageView(i3),0 , 1);
        grid.add(new ImageView(i4),1 , 1);

        grid.setHgap(10);
        grid.setVgap(10);

        grid.setPadding(new Insets(20,20,20,20));

        Scene scene = new Scene(grid, 800, 600);
        primaryStage.setTitle("Flags");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
