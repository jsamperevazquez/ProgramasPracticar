package ejemploJavaUtil.Date;

import jdk.swing.interop.SwingInterOpUtils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Creado por @autor: angel
 * El  10 de abr. de 2021.
 * //-encoding utf8 -docencoding utf8 -charset utf8(Para el javadoc)
 **/
public class UtilDate {
    public static void main(String[] args) {
        Date fecha = new Date();

        System.out.println("Fecha de hoy = " + fecha); // Imprime la fecha dce hoy con formato estandar

        SimpleDateFormat df= new SimpleDateFormat("dd MMMM, yyyy"); // le damos un formato de fecha pasando por parámetro el formato (devuelve un string )
        String fechaStr = df.format(fecha); // recogemos el valor del parámetro de SimpleDateFormat
        // Buscamos los formatos en google de SimpleDateFormat para ver las diferentes opciones
        System.out.println("fechaStr = " + fechaStr); // fecha formateada  como hemos dado en el método.

        //Otro formato
        SimpleDateFormat df2= new SimpleDateFormat("yyyy.MM.dd G 'at' HH:mm:ss z");
        fechaStr=df2.format(fecha);
        System.out.println("fechaStr = " + fechaStr);

        SimpleDateFormat df3= new SimpleDateFormat("'Fecha: 'yyyy.MM.dd G 'Hora' HH:mm:ss z"); // Cambio el texto que va entre ' ' y le pongo el texto que quiera.
        fechaStr=df3.format(fecha);
        System.out.println("fechaStr = " + fechaStr);



    }

}
