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
public class IslaMatanceros extends Exposicion {

    public IslaMatanceros() {
        this.food = 25000;
        this.hectareas = 10000;
        this.nivelAdquisitivo = NivelAdquisitivo.MEDIO;
        this.visitantes = 3000;
        this.instalaciones = null;

    }

    @Override
    public String toString() {
        return "ISLA MATANCEROS DE EXPOSICION";
    }
}
