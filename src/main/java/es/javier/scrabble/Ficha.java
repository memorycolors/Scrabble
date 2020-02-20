package es.javier.scrabble;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;


public class Ficha {
   
    Group group = new Group();
      
    // metodo constructor se llama igual que la clase 
    public Ficha() {
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(55);
        rectangle.setHeight(55);
        rectangle.setArcWidth(20);
        rectangle.setArcHeight(20);
        rectangle.setFill(Color.BEIGE);
        group.getChildren().add(rectangle);
        
        Text A = new Text("A");
        A.setFont(Font.font ("Verdana", 20));
        A.setFill(Color.BLACK);
        group.getChildren().add(A);
    }
}
