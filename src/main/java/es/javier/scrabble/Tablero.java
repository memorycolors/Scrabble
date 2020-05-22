package es.javier.scrabble;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;

public class Tablero extends Pane {

    Scrabble scrabble;
    TextField textField = new TextField();
    
    

    public Tablero() {
        scrabble = new Scrabble();
        //Lineas verticales del tablero
        for (int i = 0; i < 15; i++) {
            Line vertical = new Line(Ficha.TAM_FICHA * i, 0, i * Ficha.TAM_FICHA, Ficha.TAM_FICHA * 14);
            this.getChildren().add(vertical);

        }
        //lineas horizontales del tablero 

        for (int i = 0; i < 15; i++) {
            Line horizontal = new Line(Ficha.TAM_FICHA * 14, i * Ficha.TAM_FICHA/*(correscosponde a lado dreecho linea horizontales )*/,
                    0, i * Ficha.TAM_FICHA/*lineas horizontales desde el lado izquierdo */);
            this.getChildren().add(horizontal);

            // click raton -- hacer click en la columna y ficha 
            this.setOnMouseClicked((MouseEvent mouseEvent) -> {
                System.out.println("Mouse clicked X,Y: "
                        + mouseEvent.getX() + " : " + mouseEvent.getX()
                        + mouseEvent.getY() + " : " + mouseEvent.getY());
                
                //coger tambien el click y y aplicarlo al a columna-- Hecho  
                int clicX = (int) mouseEvent.getX();
                int clicY = (int) mouseEvent.getY();

                int fila = clicY / Ficha.TAM_FICHA;
                int columna = clicX / Ficha.TAM_FICHA;

                scrabble.colocarFicha(fila, columna, 'c');

                System.out.println("Columna" + columna);
                System.out.println("Fila" + fila);
                //crear la ficha 
                //poner la ficha en la pantalla 
                this.colocarFicha(columna, fila);

                // mover la ficha a la posicion del click 
            });

        }

    }

    private void colocarFicha(int columna, int fila) {
        Ficha ficha = new Ficha('c');
        ficha.group.setLayoutX((columna) * Ficha.TAM_FICHA);
        ficha.group.setLayoutY((fila) * Ficha.TAM_FICHA);
        this.getChildren().add(ficha.group);
       
        
        
    }
    
    
    
            
}
