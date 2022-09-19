
package Fabricas;

import Productos.Sudadera.InterfazSudadera;
import Productos.Sudadera.SudaderaNike;
import Productos.Tennis.InterfazTennis;
import Productos.Tennis.TennisNike;


public class FabricaNike implements InterfazFabricaRopa{

    @Override
    public InterfazSudadera getSudadera() {
        return new SudaderaNike();
    }

    @Override
    public InterfazTennis getTennis() {
        return new TennisNike();
    }
    
}
