/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author admin01
 */
public class EnterpriseDirectory {
    
     private ArrayList<Enterprise> enterpriseList;

    public EnterpriseDirectory() {
        enterpriseList = new ArrayList<>();
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }
    
    public Enterprise createAndAddEnterprise(String name, Enterprise.EnterpriseType type,String street,String city,String state,long zipcode){
        Enterprise enterprise = null;
        if (type == Enterprise.EnterpriseType.Bank){
            enterprise = new BankEnterprise(name);
            enterprise.setCity(city);
            enterprise.setStreet(street);
            enterprise.setState(state);
            enterprise.setZipcode(zipcode);
            enterpriseList.add(enterprise);
        }
        return enterprise;
    }
    
}
