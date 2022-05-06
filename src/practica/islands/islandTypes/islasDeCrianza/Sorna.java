/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica.islands.islandTypes.islasDeCrianza;

import java.util.ArrayList;
import practica.instalaciones.instalacionesDeCria.InstalacionesDeCria;
import practica.islands.Island;

/**
 *
 * @author rodri
 */
public class Sorna extends Island {

    public ArrayList<InstalacionesDeCria> instalaciones = new ArrayList<>();

    public Sorna() {
        this.food = 20000;
        this.hectareas = 5000;
        instalaciones = null;
    }

    @Override
    public String toString() {
        return "ISLA SORNA DE CRIANZA";
    }

    public void construir(InstalacionesDeCria instalaciones) {

        this.instalaciones.add(instalaciones);
        this.hectareas = this.hectareas - instalaciones.hectarias;

    }
}
