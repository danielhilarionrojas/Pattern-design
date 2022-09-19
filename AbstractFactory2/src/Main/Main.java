
package Main;

import Fabricas.FabricaAdidas;
import Fabricas.FabricaNike;
import Fabricas.InterfazFactory;
import PorductosTennis.InterfazTennis;
import ProductosSudadera.InterfazSudaderas;


public class Main {
    public static void main(String[] args) {
        
        InterfazFactory fabricaA = new FabricaAdidas();
        InterfazSudaderas sudadera = fabricaA.getSudadera();
        InterfazTennis tennis = fabricaA.getTennis();
        
        InterfazFactory fabricaN = new FabricaNike();
        InterfazSudaderas sudadera2 = fabricaN.getSudadera();
        InterfazTennis tennis2 = fabricaN.getTennis();
        
        System.out.println(sudadera.getMarcaSudadera());
        System.out.println(sudadera.getImportacionSudadera());
        System.out.println(tennis.getMarcaTennis());
        System.out.println(tennis.getimportacionTennis());
        System.out.println("------------------------------");
        System.out.println(sudadera2.getMarcaSudadera());
        System.out.println(sudadera2.getImportacionSudadera());
        System.out.println(tennis2.getMarcaTennis());
        System.out.println(tennis2.getimportacionTennis());
    }
}
