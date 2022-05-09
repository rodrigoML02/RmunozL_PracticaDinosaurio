/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica.islands;

import java.util.ArrayList;
import practica.enums.TipoIsla;
import practica.instalaciones.Instalacion;

public abstract class Island {

    public int hectareas;
    public int food;
    public TipoIsla tipo;
    public ArrayList<Instalacion> instalaciones = new ArrayList<Instalacion>();

    @Override
    public abstract String toString();

}
