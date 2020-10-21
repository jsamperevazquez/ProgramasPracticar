package ejercicioPropio04;
import java.util.Scanner;
/**
 * Creado por @autor: angel
 * El  21/10/2020
 **/
public class EjercicioPropio04 {

    // Enunciado:  Pide por teclado dos número y genera 10 números aleatorios entre esos números. Usa el método Math.random para generar un número entero aleatorio (recuerda el casting de double a int).
    public static void main(String[] args) {

        int numero1;
        int numero2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el primer número");
        numero1 = sc.nextInt();

        System.out.println("Introduce el segundo número");
        numero2 = sc.nextInt();
        for (int i=0;i<10;i++) { //Hacemos un for que repita 10 veces (10 números)
            //Generamos un numero aleatorio
            int numAleatorio = (int) Math.floor(Math.random() * (numero1 - numero2) + numero2);// Esta es la formula para generar numeros aleatorios entres valores deseados---->>>>int numero = (int)(Math.random()*(X-Y+1)+Y;
            System.out.println(numAleatorio);
        }

    }
}
