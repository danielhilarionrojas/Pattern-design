package Fabricas;

import Productos.Sudadera.InterfazSudadera;
import Productos.Sudadera.SudaderaAdidas;
import Productos.Tennis.InterfazTennis;
import Productos.Tennis.TennisAdidas;

public class FabricaAdidas implements InterfazFabricaRopa{

    @Override
    public InterfazSudadera getSudadera() {
        return new SudaderaAdidas();
    }

    @Override
    public InterfazTennis getTennis() {
        return new TennisAdidas();
    }
    
}
