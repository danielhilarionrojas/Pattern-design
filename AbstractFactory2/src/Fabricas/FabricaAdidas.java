
package Fabricas;

import PorductosTennis.InterfazTennis;
import PorductosTennis.TennisAdidas;
import ProductosSudadera.InterfazSudaderas;
import ProductosSudadera.SudaderaAdidas;


public class FabricaAdidas implements InterfazFactory {

    @Override
    public InterfazSudaderas getSudadera() {
        return new SudaderaAdidas();
    }

    @Override
    public InterfazTennis getTennis() {
        return new TennisAdidas();
    }
    
}
