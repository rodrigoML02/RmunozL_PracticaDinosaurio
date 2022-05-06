/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica.dinosaurios;

import practica.enums.*;

/**
 *
 *
 */
public abstract class Dinosaurios {

    public String iD;
    public Medio medio;
    public Alimentacion alimentacion;
    public int edad;
    public int edadProblematica;
    public int salud;
    public int favs;
    public String mote;
    public int precio;
    public int hambre;

    @Override
    public abstract String toString();

    public String moreInfo() {
        return "iD=" + iD + ", medio=" + medio + ", alimentacion=" + alimentacion + ", edad=" + edad + ", edadProblematica=" + edadProblematica + ", salud=" + salud + ", favs=" + favs + "precio=" + precio + ", hambre=" + hambre + '}';
    }

}
