/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica.islands.islandTypes.islasDeExposicion;

import practica.enums.NivelAdquisitivo;
import practica.islands.Island;

/**
 *
 * @author rodri
 */
public abstract class Exposicion extends Island {

    public int visitantes;
    public NivelAdquisitivo nivelAdquisitivo;

    @Override
    public abstract String toString();

}
