/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica.islands.islandTypes.islasDeCrianza;

import practica.Utilidades;
import practica.instalaciones.instalacionesDeCria.InstalacionesDeCria;
import practica.islands.Island;

/**
 *
 * @author rodri
 */
public abstract class Cria extends Island {

    @Override
    public abstract String toString();

    public InstalacionesDeCria getInstalacion(int num) {
        String aviso = null;
        InstalacionesDeCria instalacion = null;
        while (num > this.instalaciones.size() | num < 0) {
            aviso = "NO CORRESPONDE NINGUNA INSTALACION A DICHO NUMERO";
            num = Utilidades.leeEntero(aviso);
        }
        return this.instalaciones.get(num);
    }

}
