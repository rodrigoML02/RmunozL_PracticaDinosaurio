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
public class IslaSanDiego extends Exposicion {

    public IslaSanDiego() {
        this.food = 5000;
        this.hectareas = 100;
        this.nivelAdquisitivo = NivelAdquisitivo.BAJO;
        this.visitantes = 2000;
        this.instalaciones = null;

    }

    @Override
    public String toString() {
        return "ISLA SAN DIEGO DE EXPOSICION";
    }
}
