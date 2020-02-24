package es.javier.scrabble;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        StackPane root = new StackPane();
        var scene = new Scene(root, 800, 800);
        stage.setScene(scene);
        stage.show();
        
        Ficha ficha = new Ficha();
        root.getChildren().add(ficha.group);
        
        Tablero tablero = new Tablero();
        root.getChildren().add(tablero);
    }

    public static void main(String[] args) {
        launch();
    }

}