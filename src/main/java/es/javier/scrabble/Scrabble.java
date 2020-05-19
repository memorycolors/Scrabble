package es.javier.scrabble;

public class Scrabble {

    char[][] cuadricula = new char[14][14];

    public Scrabble() {
        for (int f =0; f<14; f++) {
            for (int c=0; c<14; c++) {
                System.out.println("f:" + f + "c:" + c);
                cuadricula[f][c] = '.';
            }
        }
    }

    public void mostrarConsola() {
        for (int f=0; f<14; f++) {
            for (int c=0; c<14; c++) {
                System.out.println(cuadricula[f][c]);
            }
            System.out.println("");
        }
    }
    public void colocarFicha(int fila, int columna, char letra) {
        System.out.println("Colocando ficha en matriz: " + fila + "," + columna + "," + letra);
        cuadricula[fila][columna] = letra;
        
    }
    
       
}

