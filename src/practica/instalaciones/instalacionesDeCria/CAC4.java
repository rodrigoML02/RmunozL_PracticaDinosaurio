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
public class CAC4 extends InstalacionesDeCria {

    public CAC4() {
        this.tipo = TipoIsla.CRIA;
        this.coste = 3500;
        this.medio = Medio.ACUATICO;
        this.iD = "CAC4-";
        this.alimentacion = Alimentacion.CARNIVORO;
        this.comida = 100;
        this.dinosaurios = null;
        this.caos = 0;
        this.hectarias = 25;
        this.capacidad = 4;
        this.tipoRencinto = TipoRecinto.VIDREO;
    }

    @Override
    public String toString() {
        return "INSTALACION DE CRIA CAC4";
    }
}
