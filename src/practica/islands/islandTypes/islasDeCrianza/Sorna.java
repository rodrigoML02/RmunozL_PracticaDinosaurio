/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica.islands.islandTypes.islasDeCrianza;

import practica.enums.TipoIsla;

/**
 *
 * @author rodri
 */
public class Sorna extends Cria {

    public Sorna() {
        this.food = 20000;
        this.hectareas = 5000;
        this.tipo = TipoIsla.CRIA;

    }

    @Override
    public String toString() {
        return "ISLA SORNA DE CRIANZA";
    }

}
