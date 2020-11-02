/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP2Colecciones.Ej_1;

import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class DDJJStockAgroquimico {

    int anioDeclaracion;
    int mesDeclaracion;
    double totalKiloLitros;
    String empresa;
    long cuit;
    ArrayList<DDJJStockAgroquimicoDetalle> detallesAgroquimico;
//Con array se inicializaba la dim del array con el nro ingresado en cantAgroqcos
    public int getAnioDeclaracion() {
        return anioDeclaracion;
    }

    public void setAnioDeclaracion(int anioDeclaracion) {
        this.anioDeclaracion = anioDeclaracion;
    }

    public int getMesDeclaracion() {
        return mesDeclaracion;
    }

    public void setMesDeclaracion(int mesDeclaracion) {
        this.mesDeclaracion = mesDeclaracion;
    }

 

    public double getTotalKiloLitros() {
        return totalKiloLitros;
    }

    public void setTotalKiloLitros(double totalKiloLitros) {
        this.totalKiloLitros = totalKiloLitros;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public long getCuit() {
        return cuit;
    }

    public void setCuit(long cuit) {
        this.cuit = cuit;
    }

    public ArrayList<DDJJStockAgroquimicoDetalle> getDetallesAgroquimico() {
        return detallesAgroquimico;
    }

    public void setDetallesAgroquimico(ArrayList<DDJJStockAgroquimicoDetalle> detallesAgroquimico) {
        this.detallesAgroquimico = detallesAgroquimico;
    }
}
