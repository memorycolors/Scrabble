package es.javier.scrabble;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;

public class Ficha {

    Group group = new Group();
    static final short TAM_FICHA = 45;

    // metodo constructor se llama igual que la clase 
    public Ficha() {

        //ficha A 
        Rectangle fichaa = new Rectangle();
        fichaa.setWidth(TAM_FICHA);
        fichaa.setHeight(TAM_FICHA);
        fichaa.setArcWidth(20);
        fichaa.setArcHeight(20);
        fichaa.setFill(Color.AQUA);
        group.getChildren().add(fichaa);

        
        
        Text a = new Text("A");
        a.setFont(Font.font("Verdana", 20));
        a.setFill(Color.BLACK);
        a.setTextAlignment(TextAlignment.CENTER);
        a.setLayoutY(28);
        a.setLayoutX(17);
        group.getChildren().add(a);
    }
}
