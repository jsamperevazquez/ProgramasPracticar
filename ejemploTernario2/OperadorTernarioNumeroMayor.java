package ejemploTernario2;

import java.util.Scanner;

/**
 * Creado por @autor: angel
 * El  05 de abr. de 2021.
 * //-encoding utf8 -docencoding utf8 -charset utf8(Para el javadoc)
 **/
public class OperadorTernarioNumeroMayor {
    public static void main(String[] args) {

        int max = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número");
        int numero1=sc.nextInt();

        System.out.println("Ingrese un segundo número");
        int numero2=sc.nextInt();

        System.out.println("Ingrese un tercer número");
        int numero3=sc.nextInt();

        max=(numero1>=numero2) ? numero1:numero2;
        max=(max>=numero3)?max:numero3;
        System.out.println("numero1 = " + numero1);
        System.out.println("numero2 = " + numero2);
        System.out.println("numero3 = " + numero3);
        System.out.println("El número mayor es= " + max);
    }
}
