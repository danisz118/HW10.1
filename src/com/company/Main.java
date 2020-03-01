package com.company;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {

    private static final int BOARD_WIDTH = 500;
    private static final int BOARD_HEIGHT = 500;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Hello JavaFx");
        Canvas canvas = new Canvas();
        canvas.setWidth(BOARD_WIDTH);
        canvas.setHeight(BOARD_HEIGHT);
        BorderPane group = new BorderPane(canvas);
        Scene scene = new Scene(group);
        primaryStage.setScene(scene);
        primaryStage.show();

        GraphicsContext gc = canvas.getGraphicsContext2D();
        test(gc);
    }

    private void test(GraphicsContext gc) {
        //house
        gc.setFill(Color.GREEN);
        gc.fillRect(0, 400, 500, 100);
        gc.setFill(Color.GRAY);
        gc.fillRect(200, 200, 250, 200);
        gc.setFill(Color.BLACK);
        gc.fillPolygon(new double[]{150, 500, 450, 200}, new double[]{200, 200, 100, 100}, 4);
        gc.setFill(Color.OLIVE);
        gc.fillRect(380, 50, 50, 100);
        gc.setFill(Color.GRAY);
        gc.fillRect(230, 250, 100, 150);
        gc.setFill(Color.WHITE);
        gc.fillRect(350, 280, 80, 80);
        // sun
        gc.setFill(Color.DARKORANGE);
        gc.setLineWidth(3);
        gc.strokeLine(390, 280, 390, 360);
        gc.strokeLine(350, 320, 430, 320);
        gc.setStroke(Color.YELLOW);
        gc.setLineWidth(50);
        gc.strokeOval(50, 50, 70, 70);
        gc.fillOval(50, 50, 70, 70);
    }
}
