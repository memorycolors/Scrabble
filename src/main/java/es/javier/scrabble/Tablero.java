
package es.javier.scrabble;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;



public class Tablero extends Pane {
   
    
    public Tablero() {
        //Lineas verticales 
        for(int i=0; i<16; i++){
            Line line = new Line(Ficha.TAM_FICHA*i, Ficha.TAM_FICHA, Ficha.TAM_FICHA*i, Ficha.TAM_FICHA*15);
            this.getChildren().add(line);
         
            
        }
        //lineas horizontales
        
         for(int i=0; i<16; i++){
            Line line = new Line(Ficha.TAM_FICHA, Ficha.TAM_FICHA*i, Ficha.TAM_FICHA*15, Ficha.TAM_FICHA*i);
            this.getChildren().add(line);
            
            
        }
    }
}
       
    
    
