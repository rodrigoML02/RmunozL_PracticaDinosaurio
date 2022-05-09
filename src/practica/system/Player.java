package practica.system;

import java.util.ArrayList;
import java.util.Objects;
import practica.Utilidades;
import practica.dinosaurios.Dinosaurios;
import practica.dinosaurios.tiposDeDinosaurios.*;
import practica.enums.Escenarios;
import practica.instalaciones.instalacionesDeCria.*;
import practica.instalaciones.instalacionesDeExhibicion.*;
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
                break;       }
    }

    @Override
    public String toString() {
        return "Player{" + "alias=" + alias + ", coins=" + coins + ", Islas=" + Islas + '}';
    }


    public void creadorDeDinos(String nombre, InstalacionesDeCria instalacion ) {
        String pregunta=("Que dinosaurio quieres crear: "
                + "     \nDINOSAURIOS  "
                + ""
                + "     \n1: Branchiosaurus "
                + "     \n2: Mosasaurus "
                + "     \n3: Pteranodon "
                + "     \n4: Tyrannosaurus rex  "
                + "     \n5: Velocirraptor  "         );
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
            if (!Objects.isNull(dinosaurio) & this.coins>=200 & instalacion.dinosaurios.size()<=instalacion.capacidad ){
                instalacion.dinosaurios.add(dinosaurio);
                //20% probabilidades de crearse
                int prob=(int)Math.floor(Math.random()*100);
                if(prob<=20){
                    instalacion.capacidad=instalacion.capacidad-1;
                    this.coins=this.coins-200;
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
            else if( !Objects.isNull(dinosaurio) & this.coins>=200 &instalacion.dinosaurios.size()>=instalacion.capacidad){
                System.out.println("Instalacion llena escoge otra instalacion");
                end=true;
            }
            else{
                System.out.println("No tienes dinero SUFICIENTE: ");
                end=true;
            }
        }

    }

    public void constructorDeInstalaciones(Island isla){
       boolean terminado=false;
       int opcion=0;
       String menu=null;
       InstalacionesDeCria instalacionC=null;
       InstalacionesDeExposicion instalacionE=null;
       while(!terminado){
        switch(isla.tipo){
            case CRIA:
                 menu="INSTALACIONES    COSTE"
                  + "\n1:CAC4           3500$ "
                  + "\n2:CTC03          2500$"
                  +" \n3:CTH05          1000$"
                  +" \n4:CVC02          5000$"
                 +  "\n5:AYUDA"
                 + " \n6:SALIR";
                opcion=Utilidades.leeEntero(menu);
                switch(opcion){
                    case 1:
                        instalacionC=new CAC4();break;
                    case 2:
                        instalacionC=new CTC03();break;
                    case 3:
                        instalacionC=new CTH05();break;
                    case 4:
                        instalacionC=new CVC02(); break;
                    case 5:
                        System.out.println("Primera letra tipo de instalacion (C cria E exposiscion)"
                                + "\nSegunda letra medio (A acuatico T terrestre V volador"
                                + "\nTercera letra Tipo de alimentacion (H hervivoro C carnivoro"
                                + "\nEl numero indica la cpacidad del recinto");break;
                    case 6:
                        terminado=true;break;
                    default:
                        System.out.println("Ninguna opcion escogida pruebe de nuevo");break;
                }
            case EXHIBICION:
                menu="INSTALACIONES    COSTE"
                  + "\n1:EAC03         25000$ "
                  + "\n2:ETC02         12500$"
                  +" \n3:ETH02          2100$"
                  +" \n4:EVC02         15000$"
                 +  "\n5:AYUDA"
                 + " \n6:SALIR";
                opcion=Utilidades.leeEntero(menu);
                switch(opcion){
                    case 1:
                        instalacionE=new EAC03();break;
                    case 2:
                        instalacionE=new ETC02();break;
                    case 3:
                        instalacionE=new ETH02();break;
                    case 4:
                        instalacionE=new EVC02(); break;
                    case 5:
                        System.out.println("Primera letra tipo de instalacion (C cria E exposiscion)"
                                + "\nSegunda letra medio (A acuatico T terrestre V volador"
                                + "\nTercera letra Tipo de alimentacion (H hervivoro C carnivoro"
                                + "\nEl numero indica la cpacidad del recinto");break;
                    case 6:
                        terminado=true;break;
                    default:
                        System.out.println("Ninguna opcion escogida pruebe de nuevo");break;
                }
        }
       }
       if(instalacionC!=null){
           if(this.coins>=instalacionC.coste & isla.hectareas>=instalacionC.hectarias){
               isla.instalaciones.add(instalacionC);
               this.coins=this.coins-instalacionC.coste;
               isla.hectareas=isla.hectareas-instalacionC.hectarias;
           }
           else if(this.coins>=instalacionC.coste & isla.hectareas<instalacionC.hectarias){
               System.out.println("No tienes espacio en esta isla");
           }
           else if(this.coins<instalacionC.coste & isla.hectareas>=instalacionC.hectarias){
               System.out.println("No tienes dinero suficiente para esta instalacion");
           }
       }
       else if(instalacionE!=null){
           if(this.coins>=instalacionE.coste & isla.hectareas>=instalacionE.hectarias){
               isla.instalaciones.add(instalacionE);
               this.coins=this.coins-instalacionE.coste;
               isla.hectareas=isla.hectareas-instalacionE.hectarias;
           }
           else if(this.coins>=instalacionE.coste & isla.hectareas<instalacionE.hectarias){
               System.out.println("No tienes espacio en esta isla");
           }
           else if(this.coins<instalacionE.coste & isla.hectareas>=instalacionE.hectarias){
               System.out.println("No tienes dinero suficiente para esta instalacion");
           }
       }
    }


}
