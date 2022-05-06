package practica.system;

import java.util.ArrayList;
import practica.Utilidades;
import practica.dinosaurios.Dinosaurios;
import practica.dinosaurios.tiposDeDinosaurios.*;
import practica.enums.Escenarios;
import practica.instalaciones.instalacionesDeCria.InstalacionesDeCria;
import practica.islands.Island;
import practica.islands.islandTypes.islasDeCrianza.Sorna;
import practica.islands.islandTypes.islasDeExposicion.*;

/**
 *
 * @author rodri
 */
public class Player {

    private String alias;
    public int coins;
    public ArrayList<Island> Islas = new ArrayList<>();

    public Player(Escenarios escenario, String alias) {
        this.alias=alias;
        Sorna islaDeCrianza=new Sorna();
        switch (escenario) {
            case JURASSIC_PARK:
                this.coins = 100000;
                IslaNublar islaDeExposicion=new IslaNublar();
                this.Islas.add(islaDeCrianza);
                this.Islas.add(islaDeExposicion);
                break;
            case SAN_DIEGO:
                this.coins = 50000;
                IslaSanDiego islaDeExposicion2=new IslaSanDiego();
                this.Islas.add(islaDeCrianza);
                this.Islas.add(islaDeExposicion2);
                break;
            case JURASSIC_EVOLUTION:
                this.coins = 150000;
                IslaMatanceros islaDeExposicion3=new IslaMatanceros();
                this.Islas.add(islaDeCrianza);
                this.Islas.add(islaDeExposicion3);
                break;



        }
    }

    public void creadorDeDinos(String nombre, InstalacionesDeCria instalacion ) {
        String pregunta=("Que dinosaurio quieres crear: "
                + "      DINOSAURIOS                Precio"
                + ""
                + "      1: Branchiosaurus          500$"
                + "      2: Mosasaurus              1000$"
                + "      3: Pteranodon              800$"
                + "      4: Tyrannosaurus rex       3000$"
                + "      5: Velocirraptor           600$");
        int opcion=Utilidades.leeEntero(pregunta);
        Dinosaurios dinosaurio = null;
        boolean end = false;
        while (!end) {

            switch (opcion) {
                case 1:
                    dinosaurio = new Branchiosaurus(instalacion.iD, nombre);
                    end = true;
                    break;
                case 2:
                    dinosaurio = new Mosasaurus(instalacion.iD, nombre);
                    end = true;
                    break;
                case 3:
                    dinosaurio = new Pteranodon(instalacion.iD, nombre);
                    end = true;
                    break;
                case 4:
                    dinosaurio = new TyrannosaurusRex(instalacion.iD, nombre);
                    end = true;
                    break;
                case 5:
                    dinosaurio = new Velocirraptor(instalacion.iD, nombre);
                    end = true;
                    break;
                case 6: end=true;break;
                default:  System.out.println("Ningun Dinosaurio corresponde al seleccionado escoja otra vez:");opcion=Utilidades.leeEntero(pregunta);break;

            }
            if (this.coins>=dinosaurio.precio & instalacion.dinosaurios.size()<=instalacion.capacidad){
                instalacion.dinosaurios.add(dinosaurio);
                //20% probabilidades de crearse
                int prob=(int)Math.floor(Math.random()*100);
                if(prob<=20){
                    this.coins=this.coins-dinosaurio.precio;
                    int num=0;
                    String newid=instalacion.iD.substring(instalacion.iD.indexOf("-") , instalacion.iD.length())+String.valueOf(num);
                    instalacion.iD=instalacion.iD.replace(instalacion.iD.substring(instalacion.iD.indexOf("-") , instalacion.iD.length()), newid);
                    num++;
                    end=true;
                }
                else{
                    System.out.println("La Clonación ha fallado vuelve a intentarlo");
                    opcion=Utilidades.leeEntero(pregunta);
                }
            }
            else if(this.coins>=dinosaurio.precio &instalacion.dinosaurios.size()>=instalacion.capacidad){
                System.out.println("Instalacion llena escoge otra");
                end=true;
            }
            else{
                System.out.println("No tienes dinero para este dinosaurio escoge otro: ");
                opcion=Utilidades.leeEntero(pregunta);
            }
        }

    }

    public void constructorDeInstalaciones(Island isla){

        switch()
    }


}
