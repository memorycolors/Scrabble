package es.javier.scrabble;

import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;

public class Tablero extends Pane {

    Scrabble scrabble;
    TextField miTextField = new TextField();

    public Tablero() {
        this.setMinWidth(630);
        this.setMaxWidth(630);
        this.setPrefWidth(630);

        this.setMinHeight(630);
        this.setMaxHeight(630);
        this.setPrefHeight(630);

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

        }
        miTextField.setLayoutX(200);
        miTextField.setLayoutY(700);

        this.getChildren().add(miTextField);

        // click raton -- hacer click en la columna y ficha 
        this.setOnMouseClicked((MouseEvent mouseEvent) -> {
            System.out.println("Mouse clicked X,Y: "
                    + mouseEvent.getX() + " : "
                    + mouseEvent.getY() + " : ");

            String texto = miTextField.getText();
            System.out.println(texto.charAt(0));

            //coger tambien el click y y aplicarlo al a columna-- Hecho  
            int clicX = (int) mouseEvent.getX();
            int clicY = (int) mouseEvent.getY();

            int fila = clicY / Ficha.TAM_FICHA;
            int columna = clicX / Ficha.TAM_FICHA;

            scrabble.colocarFicha(fila, columna, texto.charAt(0));

            System.out.println("Columna" + columna);
            System.out.println("Fila" + fila);
            System.out.println("texto" + texto.charAt(0));
            //crear la ficha 
            //poner la ficha en la pantalla 
            this.colocarFicha(columna, fila , texto.charAt(0));

            // mover la ficha a la posicion del click 
        });

    }

    private void colocarFicha(int columna, int fila , char letra) {
        Ficha ficha = new Ficha(letra);
        ficha.group.setLayoutX((columna) * Ficha.TAM_FICHA);
        ficha.group.setLayoutY((fila) * Ficha.TAM_FICHA);
        this.getChildren().add(ficha.group);

    }
    
}
