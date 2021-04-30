package ejemploJavaUtil.Calendar;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Creado por @autor: angel
 * El  30 de abr. de 2021.
 * //-encoding utf8 -docencoding utf8 -charset utf8(Para el javadoc)
 **/
public class Calendar {
    public static void main(String[] args) {
        java.util.Calendar calendario = java.util.Calendar.getInstance();

        // Damos la fecha que deseamos (Podríamos hacerlo también con la hora si seguimos dándole parámetros) para asignar una fecha que deseemos
        calendario.set(2021, java.util.Calendar.MAY,30);

        Date fecha= calendario.getTime();
        System.out.println("fecha = " + fecha);

        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
        String fechaConFormato= formato.format(fecha);
        System.out.println("fechaConFormato   = " + fechaConFormato  );
    }
}
