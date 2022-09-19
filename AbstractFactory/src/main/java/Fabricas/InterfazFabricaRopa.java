package Fabricas;
import Productos.Sudadera.InterfazSudadera;
import Productos.Tennis.InterfazTennis;

public interface InterfazFabricaRopa {
    public InterfazSudadera getSudadera();
    public InterfazTennis getTennis();
}
