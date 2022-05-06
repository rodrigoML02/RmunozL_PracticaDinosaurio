/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica.dinosaurios.tiposDeDinosaurios;

import practica.dinosaurios.Dinosaurios;
import practica.enums.Alimentacion;
import practica.enums.Medio;

/**
 *
 * @author rodri
 */
public class Branchiosaurus extends Dinosaurios {

    public Branchiosaurus(String id, String nombre) {
        this.iD = id;
        this.medio = Medio.TERRESTRE;
        this.alimentacion = Alimentacion.HERVIBORO;
        this.edad = 0;
        this.edadProblematica = 12;
        this.salud = 100;
        this.favs = 0;
        this.mote = nombre;
        this.hambre = 100;
        this.precio = 500;

    }

    public Branchiosaurus(String id) {
        this.iD = id;
        this.medio = Medio.TERRESTRE;
        this.alimentacion = Alimentacion.HERVIBORO;
        this.edad = 0;
        this.edadProblematica = 12;
        this.salud = 100;
        this.favs = 0;
        this.mote = "Branchiosaurus";
        this.hambre = 100;
        this.precio = 500;

    }

    @Override
    public String toString() {
        return "Soy " + this.mote + "el Branchiosaurus";
    }
}
