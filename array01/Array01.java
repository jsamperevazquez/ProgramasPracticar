package array01;

/**
 * Creado por @autor: angel
 * El  03 de feb. de 2021.
 **/
public class Array01 {
    // Creo un array estático para favorecer la modularidad y poder hacer los métodos en la otra clase
    static float[] arrayNumeros;

    public static void main(String[] args) {

        arrayNumeros = new float[MetodosArray.posiciones];
        MetodosArray objetoMetodos = new MetodosArray();
        objetoMetodos.rellenarArray();
        objetoMetodos.verValoresArray();
    }
}
