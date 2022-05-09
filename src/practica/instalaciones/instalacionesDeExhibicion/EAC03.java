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
public class EAC03 extends InstalacionesDeExposicion {

    public EAC03() {
        this.tipo = TipoIsla.EXHIBICION;
        this.coste = 25000;
        this.medio = Medio.ACUATICO;
        this.alimentacion = Alimentacion.CARNIVORO;
        this.comida = 0;
        this.caos = 0;
        this.hectarias = 400;
        this.capacidad = 3;
        this.tipoRencinto = TipoRecinto.VIDREO;
    }

    @Override
    public String toString() {
        return "INSTALACION DE EXHIBICION EAC03";
    }
}
