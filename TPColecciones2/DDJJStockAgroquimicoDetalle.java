package TP2Colecciones.Ej_1;
//La aplicacióndebe solicitary  almacenar  en  el  ArrayListtantos agroquímicoscomo se desee, al finalizar mostrar la informaciónrespetandoloslineamientos del parcial

class DDJJStockAgroquimicoDetalle {

    String códigoAgroquímico;
    String nombreAgroquímico;
    double capacidadEnvase;
    int cantidadEnvases;
    double subtotal;
    String nroDeLote;

}
/*



Solicitar el código del agroquímicoa informar, el usuario ingresa un valorbuscar el código en el array de agroquímicos, 
si no se encuentra el código indicar la situación  con elmensaje“El códigodel agroquímicoingresado  no  existe,  intente nuevamente”y  
volver  a  pedir  el  código,  si  el  código  se  encuentra  solicitar  lacapacidad del envase y lacantidad a informary 
aplicar la información obtenida para cargar  el  array  de detallesAgroquimicode  la  instancia, solo siel agroquímicoencontrado es tipo Banda Roja 
solicitar que se ingrese el númerode lote, el subtotal es el resultante de multiplicar capacidad del envasede agroquímicopor cantidadde envases. 
Validar  que  la  capacidad  y  cantidad  sean mayoresa  cero. 
Repetireste proceso hasta completar las Nfilas que componen el array de detallesAgroquimico.
*/
