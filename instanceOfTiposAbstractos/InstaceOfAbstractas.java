package instanceOfTiposAbstractos;

/**
 * Creado por @autor: angel
 * El  06 de abr. de 2021.
 * //-encoding utf8 -docencoding utf8 -charset utf8(Para el javadoc)
 **/
public class InstaceOfAbstractas {
    public static void main(String[] args) {
      Object texto= "Creando un objeto de la clase String ... que tal!";

       Number num = Integer.valueOf(7); // esto es lo mismo que darle num= 7 //

        boolean b1 = texto instanceof String;

        b1= texto instanceof Integer;
        System.out.println("Texto es del tipo Integer = " + b1);
        b1= texto instanceof String;
        System.out.println("Texto es del tipo String = " + b1);

        b1= num instanceof Integer;
        System.out.println("Num es de tipo Integer = " + b1);

        b1= num instanceof Number;
        System.out.println("Num es de tipo Number = " + b1);

        b1= num instanceof Object;
        System.out.println("Num es de tipo Object = " + b1);

        b1= num instanceof Long;
        System.out.println("Num es de tipo Long = " + b1);

        b1= num instanceof Double;
        System.out.println("Num es de tipo Double = " + b1);

        Number decimal  = Float.valueOf(45.4f);  // es igual que = 45.4;

        b1= decimal instanceof Double;
        System.out.println("Decimal es de tipo Double = " + b1);

        b1= decimal instanceof Float;
        System.out.println("Decimal es de tipo Float = " + b1);


        decimal= 45.4f; // ahora cambiamos la literal con f y decimos que es float

        b1= decimal instanceof Double;
        System.out.println("Decimal es de tipo Double = " + b1);

        b1= decimal instanceof Float;
        System.out.println("Decimal es de tipo Float = " + b1);

    }
}
