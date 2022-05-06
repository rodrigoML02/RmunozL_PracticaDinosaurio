/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica.instalaciones.instalacionesDeExhibicion;

import practica.enums.Alimentacion;
import practica.enums.Medio;
import practica.enums.TipoIsla;
import practica.enums.TipoRecinto;

/**
 *
 * @author rodri
 */
public class ETH02 extends InstalacionesDeExposicion {

    public ETH02() {
        this.tipo = TipoIsla.EXHIBICION;
        this.coste = 2100;
        this.medio = Medio.TERRESTRE;
        this.alimentacion = Alimentacion.HERVIBORO;
        this.comida = 0;
        this.dinosaurios = null;
        this.caos = 0;
        this.hectarias = 200;
        this.capacidad = 2;
        this.tipoRencinto = TipoRecinto.MADERA;
    }

    @Override
    public String toString() {
        return "INSTALACION DE EXHIBICION ETH02";
    }

}
