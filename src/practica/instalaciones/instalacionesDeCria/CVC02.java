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
public class CVC02 extends InstalacionesDeCria {

    public CVC02() {
        this.tipo = TipoIsla.CRIA;
        this.coste = 5000;
        this.medio = Medio.VOLADOR;
        this.iD = "CV02-";
        this.alimentacion = Alimentacion.CARNIVORO;
        this.comida = 500;
        this.dinosaurios = null;
        this.caos = 0;
        this.hectarias = 100;
        this.capacidad = 2;
        this.tipoRencinto = TipoRecinto.ELECTRIFICADO;
    }

    @Override
    public String toString() {
        return "INSTALACION DE CRIA CVC02";
    }
}
