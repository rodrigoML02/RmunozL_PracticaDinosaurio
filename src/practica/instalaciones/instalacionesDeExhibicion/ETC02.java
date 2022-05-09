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
public class ETC02 extends InstalacionesDeExposicion {

    public ETC02() {
        this.tipo = TipoIsla.EXHIBICION;
        this.coste = 12500;
        this.medio = Medio.TERRESTRE;
        this.alimentacion = Alimentacion.CARNIVORO;
        this.comida = 0;
        this.caos = 0;
        this.hectarias = 300;
        this.capacidad = 3;
        this.tipoRencinto = TipoRecinto.ELECTRIFICADO;
    }

    @Override
    public String toString() {
        return "INSTALACION DE EXHIBICION ETC02";
    }
}
