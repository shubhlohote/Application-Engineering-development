/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Collateral;

import Business.Loan.Loan;
import java.util.ArrayList;

/**
 *
 * @author admin01
 */
public class CollateralDirectory {
    private ArrayList<Collateral> collateralList;
    public CollateralDirectory() {
        collateralList = new ArrayList<>();
    }

    public ArrayList<Collateral> getcollateralList() {
        return collateralList;
    }
    public Collateral createAndAddCollateral(){
       // Enterprise enterprise = null;
       // if (type == Enterprise.EnterpriseType.Bank){
            Collateral collateral  = new Collateral();
            collateralList.add(collateral);
       // }
        return collateral;
    }
    
}
