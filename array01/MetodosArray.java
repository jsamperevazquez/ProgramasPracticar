package array01;

import javax.swing.*;

/**
 * Creado por @autor: angel
 * El  03 de feb. de 2021.
 **/
public class MetodosArray {

    public static final int posiciones=10; // Creo un valor constante y estático de la clase

    public MetodosArray (){}

    public void rellenarArray(){

        JOptionPane.showMessageDialog(null,"A continuación vamos a rellenar nuestro array con los valores deseados");

        for (int i = 0; i <posiciones ; i++) { // creo un for para inicializar el array con los valores que deseamos
            Array01.arrayNumeros[i]=Float.parseFloat(JOptionPane.showInputDialog(null,"Introduce el valor que deseas en la posición "+i));
        }

    }
    public void verValoresArray(){
        float [] recogerValores = new float[posiciones];
        for (int i = 0; i <posiciones ; i++) { //Voy a recorrer el array para dar ver su índice y el valor.
            JOptionPane.showMessageDialog(null,"El array contiene en el índice " + i +" El valor " + Array01.arrayNumeros[i]);

        }
    }
}

