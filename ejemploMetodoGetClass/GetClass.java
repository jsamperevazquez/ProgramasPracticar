package ejemploMetodoGetClass;

import java.lang.reflect.Method;

/**
 * Creado por @autor: angel
 * El  08 de abr. de 2021.
 * //-encoding utf8 -docencoding utf8 -charset utf8(Para el javadoc)
 **/
public class GetClass {
    public static void main(String[] args) {

        String texto = "Hola que tal";

        Class strClass=texto.getClass();

        System.out.println("strClass.getName() = " + strClass.getName());
        System.out.println("strClass.getSimpleName() = " + strClass.getSimpleName());
        System.out.println("strClass.getPackageName() = " + strClass.getPackageName());
        System.out.println("strClass.getName() = " + strClass);

        
        // Para saber cuales son sun métodos, usamos el getMethods que devuelve un array
        
        for (Method metodo:strClass.getMethods()){
            System.out.println("metodo.getName() = " + metodo.getName());
        }
    
        Integer numero = 34;
        Class intClass = numero.getClass();
        System.out.println("intClass.getName() = " + intClass.getName());
        System.out.println("intClass = " + intClass.getPackageName());
        //Para saber cual es la superClase de Integer
        System.out.println("intClass.getSuperclass() = " + intClass.getSuperclass());

        // Para saber cual es la superclase escalonada
        System.out.println("intClass.getSuperclass() = " + intClass.getSuperclass().getSuperclass());
        
        //Para saber todos los métodos de la clase Object
        Class objectClass = intClass.getSuperclass().getSuperclass();
        
        for (Method metodos:objectClass.getMethods()){
            System.out.println("metodos.getName() = " + metodos.getName());
        }
    }
}
