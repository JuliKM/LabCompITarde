/*
En la claseFuncionesPrograma codifique una función estática que reciba como parámetro  3  valores  enteros,  día,  mes,  anio    
y  retorne  la  fecha  de  tipo  Date correspondiente.public static Date getFechaDate(int día, int mes, int anio){..........} 
En  la  clase  Principal  creada  en  el  punto  anterior  haga  uso  de  la  función getFechaDate
 */
package TPDos;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

       
public class FuncionesPrograma {


    public static String getFechaString(Date fecha) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
        String fechaStr = dateFormat.format(fecha);

        return fechaStr;
    }
    
    public static Date getFechaDate(int dia, int mes, int anio){
        Date fechaDate = new Date();
        fechaDate.setDate(dia);
        fechaDate.setMonth(mes - 1);
        fechaDate.setYear(anio - 1900);
 
        return fechaDate;
    }
    
}



