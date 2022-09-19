
package Main;

import Fabricas.FabricaAdidas;
import Fabricas.FabricaNike;
import Fabricas.InterfazFabricaRopa;
import Productos.Sudadera.InterfazSudadera;
import Productos.Tennis.InterfazTennis;

public class App {
    
    public static void main(String[] args) {
       
       InterfazFabricaRopa fabrica = new FabricaNike();
       InterfazSudadera Sudadera = fabrica.getSudadera();
       InterfazTennis Tennis = fabrica.getTennis();
       
       InterfazFabricaRopa fabrica1 = new FabricaAdidas();
       InterfazSudadera Sudadera1 = fabrica1.getSudadera();
       InterfazTennis Tennis1 = fabrica1.getTennis();
       
       
        System.out.println(Sudadera.getMarcaSudadera());
        System.out.println(Sudadera.getImportacionSudadera());
        System.out.println(Tennis.getMarcaTennis());
        System.out.println(Tennis.getImportacionTennis());
        System.out.println("------------------------------");
        System.out.println(Sudadera1.getMarcaSudadera());
        System.out.println(Sudadera1.getImportacionSudadera());
        System.out.println(Tennis1.getMarcaTennis());
        System.out.println(Tennis1.getImportacionTennis());
    }
    
}
