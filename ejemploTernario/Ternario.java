package ejemploTernario;

import java.util.Scanner;

/**
 * Creado por @autor: angel
 * El  05 de abr. de 2021.
 * //-encoding utf8 -docencoding utf8 -charset utf8(Para el javadoc)
 **/
public class Ternario {
    public static void main(String[] args) {

        String [] username={"andres", "angel", "admin"};
        String [] passwords={"1234","abcd","abc123"};

        Scanner sc= new Scanner(System.in);

        System.out.println("Introduce el nombre del usuario \n");
        String user= sc.next();

        System.out.println("Ingrese el password \n");
        String pass=sc.next();


        boolean esAutenticado=false;

        for (int i = 0; i < username.length ; i++) {
            esAutenticado= (username[i].equals(user) && passwords[i].equals(pass)) ? true : esAutenticado;  // si en vez de esAutenticado le ponemos false nos daría siempre false a no ser que fuese el último del array
        }
        String estado=esAutenticado ? "Bienvenido usuario ".concat(user).concat("!") : "Username o contraseña incorrecta \n Acceso denegado";
        System.out.println(estado);
    }
}
