/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica.instalaciones.instalacionesDeCria;

import practica.enums.Alimentacion;
import practica.enums.Medio;
import practica.enums.TipoIsla;
import practica.enums.TipoRecinto;

/**
 *
 * @author rodri
 */
public class CTC03 extends InstalacionesDeCria {

    public CTC03() {
        this.tipo = TipoIsla.CRIA;
        this.coste = 2500;
        this.medio = Medio.TERRESTRE;
        this.iD = "CT03-";
        this.alimentacion = Alimentacion.CARNIVORO;
        this.comida = 300;
        this.caos = 0;
        this.hectarias = 50;
        this.capacidad = 3;
        this.tipoRencinto = TipoRecinto.ELECTRIFICADO;
    }

    @Override
    public String toString() {
        return "INSTALACION DE CRIA CTC03";
    }

}
