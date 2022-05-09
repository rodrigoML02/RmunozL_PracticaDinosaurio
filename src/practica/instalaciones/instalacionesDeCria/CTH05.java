package practica.instalaciones.instalacionesDeCria;

import practica.enums.*;

/**
 *
 * public int coste; public Medio medio; public Alimentacion alimentacion;
 * public int comida; public int numDinos; public int hectarias; public
 * TipoRecinto tipoRencinto; public ArrayList<Dinosaurios> dinosaurios = new
 * ArrayList<>(); id
 *
 */
public class CTH05 extends InstalacionesDeCria {

    public CTH05() {
        this.tipo = TipoIsla.CRIA;
        this.coste = 1000;
        this.medio = Medio.TERRESTRE;
        this.iD = "CT05-";
        this.alimentacion = Alimentacion.HERVIBORO;
        this.comida = 200;
        this.caos = 0;
        this.hectarias = 10;
        this.capacidad = 5;
        this.tipoRencinto = TipoRecinto.MADERA;

    }

    @Override
    public String toString() {
        return "INSTALACION DE CRIA CTH05";
    }

}
