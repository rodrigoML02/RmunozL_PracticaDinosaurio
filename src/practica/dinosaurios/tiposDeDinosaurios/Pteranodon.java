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
public class Pteranodon extends Dinosaurios {

    public Pteranodon(String id, String nombre) {
        this.iD = id;
        this.medio = Medio.VOLADOR;
        this.alimentacion = Alimentacion.CARNIVORO;
        this.edad = 0;
        this.edadProblematica = 16;
        this.salud = 100;
        this.favs = 0;
        this.mote = nombre;
        this.hambre = 100;

    }

    public Pteranodon(String id) {
        this.iD = id;
        this.medio = Medio.VOLADOR;
        this.alimentacion = Alimentacion.CARNIVORO;
        this.edad = 0;
        this.edadProblematica = 16;
        this.salud = 100;
        this.favs = 0;
        this.mote = "Pteranodon";
        this.hambre = 100;

    }

    @Override
    public String toString() {
        return "Soy " + this.mote + "el Pteranodon";
    }
}
