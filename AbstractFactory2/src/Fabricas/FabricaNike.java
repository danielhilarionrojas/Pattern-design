/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fabricas;

import PorductosTennis.InterfazTennis;
import PorductosTennis.TennisNike;
import ProductosSudadera.InterfazSudaderas;
import ProductosSudadera.SudaderaNike;

/**
 *
 * @author Daniel Hilarion
 */
public class FabricaNike implements InterfazFactory {

    @Override
    public InterfazSudaderas getSudadera() {
        return new SudaderaNike();
    }

    @Override
    public InterfazTennis getTennis() {
       return new TennisNike();
    } 
    
}
