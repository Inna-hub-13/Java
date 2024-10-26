package com.example.thirtheenthsteps;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Rectangle;

public class CheckerBoard146 extends Application {

    @Override
    public void start(Stage primaryStage) {

        BorderPane pane = new BorderPane();
        double width = 50;
        double height = 50;
        int n = 8;
        fillSomePane(pane, n, width, height);

        Scene scene = new Scene(pane, n * width, n * height);
        primaryStage.setResizable(false);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void fillSomePane(BorderPane pane, int n, double width, double height) {

        Rectangle rec;

        double h = width, v = 0;
        int rows = 0;

        while(rows < n) {

            rec = new Rectangle(h, v, width, height);

             if(h < n * width - 2 * width)
                 h += 2 * width;

             else {

                 rows++;
                 if(rows % 2 == 0)
                     h = width;
                 else
                     h = 0;

                 v += height;
             }

            rec.setFill(Color.BLACK);
            pane.getChildren().add(rec);
        }
    }
}
