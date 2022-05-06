/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica.islands.islandTypes.islasDeExposicion;

import practica.enums.NivelAdquisitivo;

/**
 *
 * @author rodri
 */
public class IslaNublar extends Exposicion {

    public IslaNublar() {
        this.food = 10000;
        this.hectareas = 7700;
        this.nivelAdquisitivo = NivelAdquisitivo.ALTO;
        this.visitantes = 1000;
        this.instalaciones = null;

    }

    @Override
    public String toString() {
        return "ISLA NUBLAR DE EXPOSICION";
    }

}
