/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica.islands.islandTypes.islasDeExposicion;

import java.util.ArrayList;
import practica.enums.NivelAdquisitivo;
import practica.instalaciones.instalacionesDeExhibicion.InstalacionesDeExposicion;
import practica.islands.Island;

/**
 *
 * @author rodri
 */
public abstract class Exposicion extends Island {

    public int visitantes;
    public NivelAdquisitivo nivelAdquisitivo;
    public ArrayList<InstalacionesDeExposicion> instalaciones = new ArrayList<>();

    public void construir(InstalacionesDeExposicion instalaciones) {

        this.instalaciones.add(instalaciones);
        this.hectareas = this.hectareas - instalaciones.hectarias;
    }
}
