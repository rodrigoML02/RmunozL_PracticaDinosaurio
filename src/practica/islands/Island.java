/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica.islands;

import java.util.ArrayList;
import practica.Utilidades;
import practica.enums.TipoIsla;
import practica.instalaciones.Instalacion;
import practica.instalaciones.instalacionesDeCria.InstalacionesDeCria;

public abstract class Island {

    public int hectareas;
    public int food;
    public TipoIsla tipo;
    public ArrayList<Instalacion> instalaciones = new ArrayList<Instalacion>();

    @Override
    public abstract String toString();

    public Instalacion getInstalacion(int num) {
        String aviso = null;
        InstalacionesDeCria instalacion = null;
        while (num > this.instalaciones.size() | num < 0) {
            aviso = "NO CORRESPONDE NINGUNA INSTALACION A DICHO NUMERO";
            num = Utilidades.leeEntero(aviso);
        }
        return this.instalaciones.get(num);
    }

}
