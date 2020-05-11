
package es.javier.scrabble;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;



public class Tablero extends Pane {
   
    
    public Tablero() {
        //Lineas verticales del tablero
        for(int i=0; i<15; i++){
            Line vertical = new Line(Ficha.TAM_FICHA*i, 0, i*Ficha.TAM_FICHA, Ficha.TAM_FICHA*14);
            this.getChildren().add(vertical);
         
            
        }
        //lineas horizontales del tablero 
        
        for(int i=0; i<15; i++){
            Line horizontal = new Line(Ficha.TAM_FICHA*14, i*Ficha.TAM_FICHA/*(correscosponde a lado dreecho linea horizontales )*/
                    , 0, i*Ficha.TAM_FICHA/*lineas horizontales desde el lado izquierdo */  );
            this.getChildren().add(horizontal);
            
         // click raton -- hacer click en la columna y ficha 
        this.setOnMouseClicked((MouseEvent mouseEvent) -> {
            System.out.println("Mouse clicked X,Y: " +
                    mouseEvent.getX() + " : " + mouseEvent.getX());
            int clicX =(int) mouseEvent.getX();
            int columna = clicX / Ficha.TAM_FICHA;
            int fila = clicX / Ficha.TAM_FICHA;
            System.out.println("Columna"+columna);
            System.out.println("Fila"+fila);
            
        });
        
             
        }
   // private void colocarFicha(int columna, int fila ,int ficha){
        
        Ficha ficha = new Ficha();
        this.getChildren().add(ficha.group);
        
    }
        
       
}   
  

       
    
    
