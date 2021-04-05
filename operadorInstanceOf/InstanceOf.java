package operadorInstanceOf;

/**
 * Creado por @autor: angel
 * El  05 de abr. de 2021.
 * //-encoding utf8 -docencoding utf8 -charset utf8(Para el javadoc)
 **/
public class InstanceOf {
    public static void main(String[] args) {

        String texto= "Creando un objeto de la clase String ... que tal!";

        Integer num = 7;

        boolean b1 = texto instanceof String;

        System.out.println("Texto es del tipo String = " + b1);

        b1= num instanceof Integer;
        System.out.println("Num es de tipo Integer = " + b1);

        b1= num instanceof Number;
        System.out.println("Num es de tipo Number = " + b1);

        b1= num instanceof Object;
        System.out.println("Num es de tipo Object = " + b1);

    }
}
