package com.example.thirtheenthsteps;

import java.util.Calendar;
import java.util.GregorianCalendar;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class ClockPane extends Pane{

    private int hour;
    private int minute;
    private int second;

    public void setHour(int hour) {

        this.hour = hour;
        paintClock();
    }

    public int getHour() {

        return hour;
    }

    public void setMinute(int minute) {

        this.minute = minute;
        paintClock();
    }

    public int getMinute() {

        return minute;
    }

    public void setSecond(int second) {

        this.second = second;
        paintClock();
    }

    public int getSecond() {

        return second;
    }

    public ClockPane() {

        setCurrentTime();
    }

    public ClockPane(int hour, int minute, int second) {

        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void setCurrentTime() {

        GregorianCalendar calendar = new GregorianCalendar();
        this.hour = calendar.get(Calendar.HOUR_OF_DAY);
        this.minute = calendar.get(Calendar.MINUTE);
        this.second = calendar.get(Calendar.SECOND);
        paintClock();
    }

    public void paintClock() {

        double radius = Math.min(getWidth(), getHeight()) * 0.4;
        double centerX = getWidth() / 2;
        double centerY = getHeight() / 2;

        // Create circle
        Circle circle = new Circle(centerX, centerY, radius);
        circle.setFill(Color.color(0.3, 0.7,0.5));
        circle.setStroke(Color.BLACK);
        circle.setStrokeWidth(2);

        Font f1 = new Font("Segoe UI Bold Italic", 20);
        Text tx1 = new Text(centerX - 5, centerY - radius + 18, "12");
        tx1.setFont(f1);
        Text tx2 = new Text(centerX + radius - 15, centerY + 3,  "3");
        tx2.setFont(f1);
        Text tx3 = new Text(centerX - radius + 3, centerY + 5, "9");
        tx3.setFont(f1);
        Text tx4 = new Text(centerX - 3, centerY + radius - 2, "6");
        tx4.setFont(f1);

        // Create second hand
        double handLength = radius * 0.9;
        double handX = centerX + handLength * Math.sin(second * (2 * Math.PI / 60));
        double handY = centerY - handLength * Math.cos(second * (2 * Math.PI / 60));
        Line sLine = new Line(centerX, centerY, handX, handY);
        sLine.setStroke(Color.color(0.8, 0.2,0.2));
        sLine.setStrokeWidth(2);

        // Create minute hand
        handLength = radius * 0.75;
        handX = centerX + handLength * Math.sin(minute * (2 * Math.PI / 60));
        handY = centerY - handLength * Math.cos(minute * (2 * Math.PI / 60));
        Line mLine = new Line(centerX, centerY, handX, handY);
        mLine.setStroke(Color.color(0.8, 0.5,0.4));
        mLine.setStrokeWidth(5);

        // Create hour hand
        handLength = radius * 0.6;
        handX = centerX + handLength * Math.sin((hour % 12 + minute / 60.0) * (2 * Math.PI / 12));
        handY = centerY - handLength * Math.cos((hour % 12 + minute / 60.0) * (2 * Math.PI / 12));
        Line hLine = new Line(centerX, centerY, handX, handY);
        hLine.setStroke(Color.color(0.3, 0.83,0.9));
        hLine.setStrokeWidth(8);

        getChildren().clear();
        getChildren().addAll(circle, tx1, tx2, tx3, tx4, sLine, mLine, hLine);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        paintClock();
    }

    @Override
    public void setHeight(double height) {

        super.setHeight(height);
        paintClock();
    }
}
