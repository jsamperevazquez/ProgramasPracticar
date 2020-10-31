package DAM.practicar;

import javax.naming.NameNotFoundException;
import java.util.Scanner;

/**
 * Creado por @autor: angel
 * El  30/10/2020
 **/
public class Raices {
    int coeficienteA;
    int coeficienteB;
    int coeficienteC;

    // Creo los constructores
    //Uno que si no le introduces valores te los solicite
    public Raices(){
        Scanner sc =new Scanner(System.in);
        //Pedimos el valor de los coeficientes.
        System.out.println("Introduce el valor de Ax");
        coeficienteA=sc.nextInt();
        System.out.println("Introduce el valor de Bx");
        coeficienteB=sc.nextInt();
        System.out.println("Introduce el valor de C");
        coeficienteC=sc.nextInt();
    }

    //Otro para poder nosotros dar parametros de entrada
    public Raices(int cA,int cB, int cC){
        coeficienteA= cA;
        coeficienteB= cB;
        coeficienteC= cC;
    }


    // Creo el método para obtener las raices cuando tiene dos solucciones
    //Formula ecuación 2º grado: (-b±√((b^2)-(4*a*c)))/(2*a)
    public void obtenerRaices(){
        // Hallo las Raices posibles de la parábola.
        double raiz1= (-coeficienteB + Math.sqrt(getDiscriminante()))/(2*coeficienteA);
        double raiz2=(-coeficienteB - Math.sqrt(getDiscriminante()))/(2*coeficienteA);
        if (getDiscriminante()>0) {
            System.out.println("El resultado de la ecuación de segundo grado es de:\n Raiz1= " + raiz1 + "\n Raiz2= " + raiz2);
        }
        else if (getDiscriminante()<0){
            System.out.println("El discriminante es menor a 0 y todos sabemos que una ecuanción de números negativos no se expresa en R");
        }
        else System.out.println("La ecuación solo tiene una solución, y el resultado es: \nraiz1= " + raiz1 + "\n raiz2= "+ raiz2);

    }

    // Creo el método para devolver el valor del discriminante el valor del discriminante
    public double getDiscriminante(){
     //La  formula es (b^2)-4*a*c
        double discriminante=(coeficienteB*coeficienteB)-4*coeficienteA*coeficienteC;
        return discriminante;
    }





}
