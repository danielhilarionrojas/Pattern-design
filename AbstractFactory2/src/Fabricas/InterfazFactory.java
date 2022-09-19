
package Fabricas;

import PorductosTennis.InterfazTennis;
import ProductosSudadera.InterfazSudaderas;


public interface InterfazFactory {
    
    public InterfazSudaderas getSudadera();
    public InterfazTennis getTennis();
}
