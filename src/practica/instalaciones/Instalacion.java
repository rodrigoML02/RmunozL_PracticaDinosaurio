/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica.instalaciones;

import java.util.ArrayList;
import practica.dinosaurios.Dinosaurios;
import practica.enums.*;

/**
 *
 * @author rodri
 */
public abstract class Instalacion {

    public TipoIsla tipo;
    public int coste;
    public Medio medio;
    public Alimentacion alimentacion;
    public int comida;
    public int hectarias;
    public TipoRecinto tipoRencinto;
    //indica como de probable es que se escape un dinosaurio(0-100)
    public int caos;
    public int capacidad;
    public ArrayList<Dinosaurios> dinosaurios = new ArrayList<>();

    public void caosCalculator() {
        for (Dinosaurios dinos : dinosaurios) {
            //si los dinosaurios estan hambrientos aumenta
            if (dinos.hambre < 25) {
                this.caos = this.caos + (int) Math.floor(Math.random() * 10);
            }
            //si el medio es distinto aumenta mucho mas
            if (dinos.medio != this.medio) {
                this.caos = this.caos + (int) Math.floor(Math.random() * 10) + 10;
            }
        }
        //si has metido mas dinosaurios de los que deberias aumenta en proporcion a los que has metido de mas
        if (this.dinosaurios.size() > this.capacidad) {
            this.caos = this.caos + (((int) Math.floor(Math.random() * 10)) * (this.dinosaurios.size() - this.capacidad + 1));
        }
        switch (this.tipoRencinto) {
            case VIDREO:
                this.caos = this.caos + 5;
                break;
            case MADERA:
                this.caos = this.caos + 10;
                break;
            case ELECTRIFICADO:
                this.caos = this.caos + 1;
                break;

        }
        this.caos = this.caos + ((int) Math.floor(Math.random()));
    }

    public String infoRecintos() {

        return "MEDIO{" + this.medio + "} ALIMENTACION {" + this.alimentacion + "} HECTARIAS{" + this.hectarias + "} TIPO DE RECINTO{" + this.tipoRencinto + "} CAPACIDAD {" + this.capacidad + "}"
                + "DINOSAURIOS{" + dinosaurios + "}";
    }

    @Override
    public abstract String toString();

}
