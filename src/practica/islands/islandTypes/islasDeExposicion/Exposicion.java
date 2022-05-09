/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica.islands.islandTypes.islasDeExposicion;

import practica.Utilidades;
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

    @Override
    public abstract String toString();

    public InstalacionesDeExposicion getInstalacion(int num) {
        String aviso = null;
        InstalacionesDeExposicion instalacion = null;
        while (num > this.instalaciones.size() | num < 0) {
            aviso = "NO CORRESPONDE NINGUNA INSTALACION A DICHO NUMERO";
            num = Utilidades.leeEntero(aviso);
        }
        return this.instalaciones.get(num);
    }

}
